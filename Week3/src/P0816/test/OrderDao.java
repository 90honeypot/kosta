package P0816.test;

import java.util.ArrayList;

public class OrderDao {
	private ArrayList<Order> list;

	public OrderDao() {
		list = new ArrayList<>();
	}

	public void insert(Order o) {
		list.add(o);
	}

	public ArrayList<Order> selectAll() {
		return list;
	}

	public Order select(int orderNum) {
		for (Order o : list) {
			if (orderNum == o.getOrder_num()) {
				return o;
			}
		}
		return null;
	}

	// 주문 취소. 결제했으면 취소 안됨
	public void delete(int orderNum) {
		for (int i = 0; i < list.size(); i++) {
			Order o = list.get(i);
			if (orderNum == o.getOrder_num()) {
				if (o.isPay()) {
					System.out.println("이미 결제한 주문은 취소 불가");
				} else {
					list.remove(i);// 방번호로 삭제
				}
			}
		}
	}

	public void updatePay(int orderNum) {
		Order o = select(orderNum);
		if (o == null) {
			System.out.println("없는 주문 번호");
			return;
		}
		if (o.isPay()) {
			System.out.println("이미 결제한 주문임. 이중 결제 불가");
		} else {
			o.setPay(true);
			System.out.println("결제완료");
		}

	}

	// 결제(pay)가 true/false
	public ArrayList<Order> selectByPay(boolean pay) {
		ArrayList<Order> os = new ArrayList<>();
		for (Order o : list) {
			if (o.isPay() == pay) {
				os.add(o);
			}
		}
		return os;
	}

	// 출고대상 검색
	public ArrayList<Order> selectByOut() {
		ArrayList<Order> os = new ArrayList<>();
		ArrayList<Order> kk = selectByPay(true);// kk:결제한 주문 목록
		for (Order o : kk) {
			if (!o.isOut()) {// 결제는 했지만 출고가 안된 주문 골라냄
				os.add(o);
			}
		}
		return os;
	}
}