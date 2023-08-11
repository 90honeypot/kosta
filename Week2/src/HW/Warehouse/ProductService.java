package HW.Warehouse;

import java.util.Scanner;

// 기능 제공
public class ProductService {
    private ProductDao dao;

    /*
     * public ProductService(ProductDao dao) { // 의존성 주입
     * this.dao = dao;
     * }
     */

    public ProductService() {
        dao = new ProductDao();
    }

    public void ProductAdd(Scanner sc) {
        System.out.println("==== 상품등록 ====");
        System.out.println("상품이름: ");
        String name = sc.nextLine();
        System.out.println("상품가격: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("상품수량: ");
        int amount = sc.nextInt();
        sc.nextLine();
        Product p = new Product(name, price, amount);
        boolean flag = dao.insert(p);
        if (!flag) {
            System.out.println(">>> 등록실패");
        } else {
            System.out.println(">>> 등록성공");
        }
        System.out.println();
    }

    public void ProductSearch(Scanner sc) {
        System.out.println("==== 검색하기 ====");
        System.out.println("검색할 제품번호:");
        int num = sc.nextInt();
        sc.nextLine();
        
        System.out.println("--- 검색결과 ---");
        int loc = dao.select(num);
        if (loc == -1) {
            System.out.println("없음");
        } else {
            Product p = dao.getProductByIdx(loc);
            System.out.println("\t" + p);
        }
        System.out.println();
    }
    
    public void ProductUpdatePrice(Scanner sc) {
        System.out.println("==== 수정 ====");
        System.out.println("수정할 제품번호:");
        int num = sc.nextInt();
        sc.nextLine();
        int idx = dao.select(num);
        if (idx < 0) {
            System.out.println(">>> 수정 실패. 없는 번호입니다.");
        } else {
            Product p = dao.getProductByIdx(idx);
            System.out.println("수정 전 정보: " + p);
            System.out.println("새로운 가격:");
            p.setPrice(sc.nextInt());
            sc.nextLine();
            System.out.println("---- 수정완료 ----");
            System.out.println(p);
        }
        System.out.println();
    }

    public void ProductDelete(Scanner sc) {
        System.out.println("==== 삭제 ====");
        System.out.println("삭제할 제품번호:");
        int num = sc.nextInt();
        sc.nextLine();
        int idx = dao.select(num);
        if (idx < 0) {
            System.out.println(">>> 삭제 실패. 없는 번호입니다.");
        } else {
            dao.delete(idx);            
            System.out.println("---- 삭제완료 ----");
        }
        System.out.println();
    }

    public void getAll() {
        System.out.println("==== 상품목록 ====");
        dao.selectAll();
        System.out.println();
    }
}
