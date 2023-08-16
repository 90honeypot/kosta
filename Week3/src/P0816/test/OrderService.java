package P0816.test;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
	private OrderDao dao;

	public OrderService() {
		dao = new OrderDao();
	}

	// 주문
	public void addOrder(Scanner sc, ArrayList<Product> prods) {
		System.out.println("주문\n상품목록");
		for (Product p : prods) {
			System.out.println(p);
		}
		System.out.print("주문할 상품 번호:");
		int prodNum = sc.nextInt();
		int idx = prods.indexOf(new Product(prodNum, "", 0, 0));
		if (idx < 0) {
			System.out.println("없는 상품 번호");
		} else {
			System.out.print("주문수량:");
			int amount = sc.nextInt();
			int payment = prods.get(idx).getPrice() * amount; // 결제금액
			dao.insert(new Order(prodNum, amount, payment));
		}
	}

	// 전체 주문 목록
	public void printAll() {
		System.out.println("전체 주문 목록");
		ArrayList<Order> list = dao.selectAll();
		for (Order o : list) {
			System.out.println(o);
		}
	}

	// 결제
	public void pay(Scanner sc) {
		System.out.println("===내 장바구니===");
		ArrayList<Order> list = dao.selectByPay(false);// 결제안한 목록
		for (Order o : list) {
			System.out.println(o);
		}
		System.out.print("결제할 주문 번호:");
		int orderNum = sc.nextInt();
		dao.updatePay(orderNum);// 결제처리
	}

	// 주문취소
	public void delOrder(Scanner sc) {
		System.out.println("===취소 가능한 주문 목록===");
		ArrayList<Order> list = dao.selectByPay(false);// 결제안한 목록
		for (Order o : list) {
			System.out.println(o);
		}
		System.out.print("취소할 주문 번호:");
		int orderNum = sc.nextInt();
		dao.delete(orderNum);
	}

	// 출고현황. 결제완료 후 출고 여부 출력
	public void printOutInfo() {
		System.out.println("출고현황");
		ArrayList<Order> list = dao.selectByPay(true);// 결제목록
		String outMsg = "";
		for (Order o : list) {
			if (o.isOut()) {
				outMsg = "출고완료";
			} else {
				outMsg = "미출고";
			}
			System.out.println(o.getOrder_num() + " / " + o.getProd_num() 
			+ "/" + o.getAmount() + " / " + o.getPayment() + " / " + outMsg);
		}
	}
	
	//창고에 출고 대상 목록 전달
	public ArrayList<Order> getOrdersByOut(){
		return dao.selectByOut();
	}
}