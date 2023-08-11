import java.util.Scanner;

import ConvenienceStore.OrderService;
import Storage.StorageService;

public class Controller {
    
    private StorageService storage_service;
    private OrderService order_service;

    public Controller() {
        storage_service = new StorageService();
        order_service = new OrderService();
    }

    public void orderService(Scanner sc) {

        order_service.setStorageDao(storage_service.getDao());

        boolean flag = true;
        int menu_num = 0;

        while(flag) {
            System.out.println("\n######### 편의점 업무 #########\n");
            System.out.println("1.주문추가  2.내 주문목록  3.주문취소  4.결제하기  5.출고현황보기  6.이전단계");
            menu_num = sc.nextInt();
            sc.nextLine();
            
            switch(menu_num) {
                case 1:
                    System.out.println("1. 주문추가");
                    order_service.addOrder(sc);
                    break;
                case 2:
                    System.out.println("2. 내 주문목록");
                    order_service.printOrderList(sc);
                    break;
                    case 3:
                    System.out.println("3. 주문취소");
                    order_service.cancelOrder(sc);
                    break;
                    case 4:
                    System.out.println("4. 결제하기");
                    order_service.payOrder(sc);
                    break;
                    case 5:
                    System.out.println("5. 출고현황보기");
                    order_service.printReleased(sc);
                    break;
                case 6:
                    System.out.println("");
                    flag = false;
                    break;
            }
        }
    }
    public void storageService(Scanner sc) {
        
        storage_service.setOrderDao(order_service.getDao());

        boolean flag = true;
        int menu_num = 0;

        while(flag) {
            System.out.println("\n######### 창고업무 #########\n");
            System.out.println("1.상품등록  2.전체보기  3.검색하기(번호)  4.검색하기(제품명)  5.가격수정하기(번호)  6.삭제하기  7.입고  8.출고  9.이전단계");
            menu_num = sc.nextInt();
            sc.nextLine();
            
            switch(menu_num) {
                case 1:
                    System.out.println("1. 상품등록");
                    storage_service.registerProduct(sc);
                    break;
                case 2:
                    System.out.println("2. 전체보기");
                    storage_service.printAllProduct(sc);
                    break;
                case 3:
                    System.out.println("3. 검색하기(번호)");
                    storage_service.searchByIdx(sc);
                    break;
                case 4:
                    System.out.println("4. 검색하기(제품명)");
                    storage_service.searchByName(sc);
                    break;
                case 5:
                    System.out.println("5. 가격수정하기");
                    storage_service.editPrice(sc);
                    break;
                case 6:
                    System.out.println("6. 삭제하기");
                    storage_service.deleteProduct(sc);
                    break;
                case 7:
                    System.out.println("7. 입고");
                    storage_service.receiveGoods(sc);
                    break;
                case 8:
                    System.out.println("8. 출고");
                    storage_service.releaseGoods(sc);
                    break;
                case 9:
                    System.out.println("");
                    flag = false;
                    break;
            }
            
        }
    }

    public void run(Scanner sc) {
        boolean flag = true;
        int menu = 0;
        while(flag) {
            System.out.println("메뉴 선택");
            System.out.println("1.창고업무  2.편의점업무  3.종료");
            menu = sc.nextInt();
            sc.nextLine();
            switch(menu) {
                case 1:
                    storageService(sc);
                    break;
                case 2:
                    orderService(sc);
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }
}
