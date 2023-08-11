package HW.Shop;

import java.util.Scanner;

import HW.Warehouse.ProductService;

public class Menu {
    private ProductService pservice;

    public Menu() {
        pservice = new ProductService();
    }

    public void run(Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.창고 2.편의점 3.종료");
            int m = sc.nextInt();
            sc.nextLine();
            switch (m) {
                case 1:
                    prun(sc);
                    break;
                case 2:
                    System.out.println("편의점 서비스 준비중");
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }
    }

    public void prun(Scanner sc) {
        boolean flag = true;
        while (flag) {
            System.out.println("1.상품등록 2.상품찾기(제품번호) 3.상품찾기(제품명) 4.수정 5.삭제 6.입고 7.출고 8.상품목록 9.이전단계");
            int m = sc.nextInt();
            sc.nextLine();

            switch (m) {
                case 1:
                    pservice.ProductAdd(sc);
                    break;
                case 2:
                    pservice.ProductSearch(sc);
                    break;
                case 3:
                    System.out.println("상품찾기(제품명) - 준비중");
                    break;
                case 4:
                    pservice.ProductUpdatePrice(sc);
                    break;
                case 5:
                    pservice.ProductDelete(sc);
                    break;
                case 6:
                    System.out.println("입고 - 준비중");
                    break;
                case 7:
                    System.out.println("출고 - 준비중");
                    flag = false;
                    break;
                case 8:
                    pservice.getAll();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}
