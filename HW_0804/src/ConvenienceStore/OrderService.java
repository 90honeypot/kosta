package ConvenienceStore;


import java.util.Scanner;

import Storage.Product;
import Storage.StorageDao;

public class OrderService {
    
    OrderDao odao;
    StorageDao sdao;

    public OrderService() {
        odao = new OrderDao();
        
    }
    public OrderDao getDao() {
        return this.odao;
    }
    public void setStorageDao(StorageDao s) {
        this.sdao = s;
    }

    // 주문추가
    public void addOrder(Scanner sc) {
        System.out.println("\n==== 주문추가 ====");
        System.out.println("- 상품명: ");
        String name = sc.nextLine();

        System.out.println("- 주문수량: ");
        int amount = sc.nextInt();
        sc.nextLine();
        
        Product[] pl = sdao.getProductsByName(name);
        if(pl.length == 0 || pl[0] == null) {
            odao.add(new Order(-1, name, amount, -1, false, false, false));
        } else {
            odao.add(new Order(pl[0].getCode(), name, amount, amount*pl[0].getPrice(), false, false, false));
        }
        
        System.out.println("\n==== 주문성공 ====");
        
    }
    
    // 내 주문목록
    public void printOrderList(Scanner sc) {
        System.out.println("\n==== 내 주문 리스트 ====");
        if(odao.getCount() == 0) {
            System.out.println("주문이 하나도 없습니다.");
        } else {
            odao.allList();
        }
        
    }
    
    // 주문취소
    // 방식은? 
    // 결제 안한것만 취소 가능
    public void cancelOrder(Scanner sc) {
        System.out.println("\n==== 주문취소 ====");
        if(odao.getCount() == 0) {
            System.out.println("주문이 하나도 없습니다.");
        } else {
            odao.allList();
        }
        System.out.println("\n취소하실 주문번호를 입력하세요. : ");
        int code = sc.nextInt();
        sc.nextLine();
        if(odao.getObjectByCode(code).isPaid()) {
            System.out.println("\n이미 결제되어 취소할 수 없습니다.");
        } else {
            odao.cancel(odao.getIdxByCode(code));
            System.out.println("\n==== 취소완료 ====");
        }
        
    }

    // 결제하기
    public void payOrder(Scanner sc) {
        System.out.println("\n==== 결제하기 ====");
        if(odao.getCount() == 0) {
            System.out.println("주문이 하나도 없습니다.");
        } else {
            odao.paidList(false);
        }
        System.out.println("\n결제하실 주문번호를 입력하세요. : ");
        int code = sc.nextInt();
        sc.nextLine();

        odao.getObjectByCode(code).setPaid(true);

    }


    // 출고현황보기
    public void printReleased(Scanner sc) {
        System.out.println("\n==== 출고현황보기 ====");
        System.out.println("\n- 출고된 리스트");
        odao.releaseList(true);
        System.out.println("\n- 출고되지않은 리스트");
        odao.releaseList(false);
    }
}
