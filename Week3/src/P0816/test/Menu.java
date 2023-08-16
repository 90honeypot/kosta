package P0816.test;

import java.util.Scanner;

public class Menu {
	private ProductService pservice;
	private OrderService oservice;
	
	public Menu() {
		pservice = new ProductService();
		oservice = new OrderService();
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while(flag) {
			System.out.println("1.창고 2.편의점 3.종료");
			m = sc.nextInt();
			switch(m) {
			case 1:
				prun(sc);
				break;
			case 2:
				orun(sc);
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
	
	//창고 메뉴 실행
	public void prun(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while(flag) {
			System.out.println("1.등록 2.번호로검색 3.상품명으로검색 4.수정 5.삭제 6.입고 7.출고 8.상품목록 9.종료");
			m = sc.nextInt();
			switch(m) {
			case 1:
				pservice.productAdd(sc);
				break;
			case 2:
				pservice.getByNum(sc);
				break;
			case 3:
				pservice.getByName(sc);
				break;
			case 4:
				pservice.editProduct(sc);
				break;
			case 5:
				pservice.delProduct(sc, oservice.getOrdersByOut());
				break;
			case 6:
				pservice.in(sc);
				break;
			case 7:
				pservice.out(oservice.getOrdersByOut());
				break;
			case 8:
				pservice.printAll();
				break;
			case 9:
				flag = false;
				break;
			}
		}
	}
	public void orun(Scanner sc) {
		boolean flag = true;
		int m = 0;
		while(flag) {
			System.out.println("1.주문 2.주문목록 3.주문취소 4.결제 5.출고현황 6.종료");
			m = sc.nextInt();
			switch(m) {
			case 1:
				oservice.addOrder(sc, pservice.getAll());
				break;
			case 2:
				oservice.printAll();
				break;
			case 3:
				oservice.delOrder(sc);
				break;
			case 4:
				oservice.pay(sc);
				break;
			case 5:
				oservice.printOutInfo();
				break;
			case 6:
				flag = false;
				break;
			}
		}
	}
}