package P0816.test;

import java.util.ArrayList;
import java.util.Scanner;

//기능 구현. 
//서비스에서 배열에 저장하는 작업을 하려면
//dao 객체 필요 => 멤버변수로 정의
public class ProductService {
	private ProductDao dao;

	public ProductService() {
		dao = new ProductDao();
	}

	public void productAdd(Scanner sc) {
		System.out.println("===상품등록===");
		System.out.print("상품명:");
		String name = sc.next();
		System.out.print("가격:");
		int price = sc.nextInt();
		System.out.print("수량:");
		int amount = sc.nextInt();
		Product p = new Product(name, price, amount);
		dao.insert(p);
	}

	public void getByNum(Scanner sc) {
		System.out.println("===번호로 검색===");
		System.out.print("검색할 제품번호:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p == null) {// 못찾았다
			System.out.println("없는 번호");
		} else {
			System.out.println(p);
		}
	}

	// 전체 검색 => 주문에서 사용
	public ArrayList<Product> getAll() {
		return dao.selectAll();
	}

	// 전체 출력
	public void printAll() {
		ArrayList<Product> list = dao.selectAll();
		for (Product p : list) {
			System.out.println(p);
		}
	}

	// 수정
	public void editProduct(Scanner sc) {
		System.out.println("===수정===");
		System.out.print("수정할 제품번호:");
		int num = sc.nextInt();
		Product p = dao.selectByNum(num);
		if (p == null) {// 못찾았다
			System.out.println("없는 번호. 수정취소");
		} else {
			System.out.println("수정전 정보:" + p);
			System.out.print("new price:");
			p.setPrice(sc.nextInt());
		}
	}

	// 삭제
	public void delProduct(Scanner sc, ArrayList<Order> orders) {
		System.out.println("===삭제===");
		System.out.print("삭제할 제품번호:");
		int num = sc.nextInt();
		dao.delete(num, orders);
	}

	// 입고
	public void in(Scanner sc) {
		System.out.println("===입고===");
		System.out.print("입고할 제품번호:");
		int num = sc.nextInt();
		System.out.print("입고량:");
		int amount = sc.nextInt();
		dao.updateAmount(num, amount);
	}

	// 출고
	public void out(ArrayList<Order> orders) {
		System.out.println("===출고===");
		dao.updateOutFlag(orders);
	}

	// 상품명으로 검색
	public void getByName(Scanner sc) {
		System.out.println("===상품명으로 검색===");
		System.out.print("검색할 상품명:");
		String name = sc.next();
		ArrayList<Product> list = dao.selectByName(name);
		if (list.isEmpty()) {
			System.out.println("검색된 상품이 없다");
		} else {
			for (Product p : list) {
				System.out.println(p);
			}
		}
	}
}