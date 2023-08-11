package Storage;

import java.util.Scanner;

import ConvenienceStore.Order;
import ConvenienceStore.OrderDao;

public class StorageService {

    private StorageDao sdao;
    private OrderDao odao;

    public StorageService() {
        sdao = new StorageDao();
    }

    public StorageDao getDao() {
        return this.sdao;
    }

    public void setOrderDao(OrderDao o) {
        this.odao = o;
    }

    public void registerProduct(Scanner sc) {
        System.out.println("\n==== 상품등록하기 ====");
        System.out.println("- 상품명: ");
        String name = sc.nextLine();

        System.out.println("- 상품가격: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.println("- 상품수량: ");
        int quantity = sc.nextInt();
        sc.nextLine();

        sdao.register(new Product(name, price, quantity));

        System.out.println("==== 등록 성공 ====");
    }

    public void printAllProduct(Scanner sc) {
        System.out.println("\n==== 등록된 상품 리스트 ====");
        if (sdao.getCount() == 0) {
            System.out.println("등록된 상품이 없습니다.");
        } else {
            sdao.print();
        }

    }

    public void searchByIdx(Scanner sc) {
        System.out.println("\n==== 검색하기(코드번호) ====");
        System.out.println("- 코드번호: ");
        int code = sc.nextInt();
        sc.nextLine();
        if (sdao.getCount() > 0 && sdao.getCount() >= code) {
            System.out.println(sdao.getProductByCode(code));
        } else {
            System.out.println("등록된 상품이 없습니다.");
        }
    }

    public void searchByName(Scanner sc) {
        System.out.println("\n==== 검색하기(상품명) ====");
        System.out.println("- 상품명: ");
        String name = sc.nextLine();
        Product[] items = sdao.getProductsByName(name);
        int i;
        for (i = 0; i < sdao.getCount(); i++) {
            if (items[i] == null) {
                break;
            }
            System.out.println(items[i]);
        }
        if (i == 0) {
            System.out.println("등록된 상품이 없습니다.");
        }
    }

    public void editPrice(Scanner sc) {
        System.out.println("\n==== 가격수정하기(코드번호) ====");
        System.out.println("- 코드번호: ");
        int code = sc.nextInt();
        sc.nextLine();
        if (sdao.getCount() > 0 && sdao.getCount() >= code) {
            Product p = sdao.getProductByIdx(code - 1);
            System.out.println("- 수정할 가격: ");
            p.setPrice(sc.nextInt());
            sc.nextLine();
            System.out.println("==== 수정완료 ====");
            System.out.println(p);
        } else {
            System.out.println("수정할 제품이 없습니다.");
        }
    }

    public void deleteProduct(Scanner sc) {
        System.out.println("\n==== 제품삭제하기(코드번호) ====");
        System.out.println("- 코드번호: ");
        int code = sc.nextInt();
        sc.nextLine();
        if (sdao.getCount() > 0 && sdao.getCount() >= code) {
            sdao.delete(code - 1);
            System.out.println("==== 삭제완료 ====");
        } else {
            System.out.println("삭제할 제품이 없습니다.");
        }
    }

    // 입고
    // 제품명으로 입고 --> 같은 제품명이 있는 경우, --> 리스트 보여주고 코드번호 고르게 하기
    public void receiveGoods(Scanner sc) {

        System.out.println("\n==== 제품입고 ====");
        System.out.println("- 제품명 :");
        String name = sc.nextLine();
        Product[] items = sdao.getProductsByName(name);

        if (items.length == 0 || items[0] == null) { // 아무상품도 없는경우
            System.out.println("등록된 상품이 없습니다.");

        } else if (items[1] == null) { // 동일한 제품명이 하나만 있는경우
            System.out.println("- 입고수량 :");
            items[0].setQuantity(items[0].getQuantity() + sc.nextInt());
            sc.nextLine();
            System.out.println("==== 입고되었습니다. ====");

        } else { // 제품명 여러개
            System.out.println("리스트 중 하나 고르세요");
            sdao.printByName(name);
            System.out.println("- 입고할 제품코드: ");
            Product p = sdao.getProductByCode(sc.nextInt());
            sc.nextLine();
            System.out.println("- 입고수량: ");

            p.setQuantity(p.getQuantity() + sc.nextInt());
            System.out.println("==== 입고되었습니다. ====");
        }

    }

    // 출고
    // 편의점에서 주문한 리스트 중 결제된 것만 처리
    public void releaseGoods(Scanner sc) {
        System.out.println("\n==== 제품출고 ====");
        Order[] order_list = odao.getOrder();

        for (int i = 0; i < odao.getCount(); i++) {
            if (order_list[i].isPaid() && order_list[i].isReleased() == false) {
                System.out.println(order_list[i]);
                String name = order_list[i].getName();
                int code = order_list[i].getCode();
                int quantity = order_list[i].getQuantity();

                Product[] p = sdao.getProductsByName(name);
                if(p.length == 0 || sdao.checkAllQuantityByName(name) < quantity) {
                    System.out.printf("(%d)-%s 제품 수량 부족으로 출고 불가\n", code, name);
                    continue;
                }
                for(int j=0; j<p.length; j++) {
                    int gap = p[j].getQuantity() - quantity;
                    if (gap > 0) { // 수량 업데이트 후 끝
                        p[j].setQuantity(gap);
                        System.out.printf("(%d)-%s 제품 %d개 출고 완료\n", code, name, quantity);
                        break;
                    } else if (gap == 0) { // 수량0개되서 창고리스트에서 제거 후 끝
                        sdao.delete(sdao.getIdxByCode(code));
                        System.out.printf("(%d)-%s 제품 %d개 출고 완료\n", code, name, quantity);
                        break;
                    } else { // 
                        sdao.delete(sdao.getIdxByCode(code));
                        System.out.printf("(%d)-%s 제품 %d개 출고 완료\n", code, name, p[j].getQuantity());
                    }
                }
                order_list[i].setReleased(true);
                System.out.println("---- 출고 완료 ----");
            }
                
        }
        
    }
}
