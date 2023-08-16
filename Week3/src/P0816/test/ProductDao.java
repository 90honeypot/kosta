package P0816.test;

import java.util.ArrayList;

//배열에 저장, 검색, 삭제...
public class ProductDao {
	private ArrayList<Product> prods;// 선언

	public ProductDao() {
		// ArrayList 생성
		prods = new ArrayList<>();
	}

	// 파람으로 Product 객체를 하나 받아서 ArrayList에 추가
	public void insert(Product p) {// p: 서비스에서 상품명, 가격, 수량 담아서 줌
		prods.add(p);
	}

	// 번호로 검색.
	// 파람으로 번호받아서 arrayList의 indexOf(객체)로 검색.
	public Product selectByNum(int num) {
		int idx = prods.indexOf(new Product(num, "", 0, 0));
		if (idx < 0) {
			return null;
		} else {
			return prods.get(idx);
		}
	}

	// 이름으로 검색 => 검색된 객체가 여러 개 일 수 있음
	public ArrayList<Product> selectByName(String name) {
		// list:name과 이름이 같은 상품을 찾아서 담을 리스트
		ArrayList<Product> list = new ArrayList<>();
		for (Product p : prods) {
			if (name.equals(p.getName())) {
				list.add(p);
			}
		}
		return list;
	}

	// 삭제. 파람으로 삭제할 상품번호 받음.
	public void delete(int num, ArrayList<Order> orders) {
		for (Order o : orders) {
			if (num == o.getProd_num()) {
				System.out.println("출고 대기 상품이라 삭제불가");
				return;
			}
		}
		boolean flag = prods.remove(new Product(num, "", 0, 0));
		if (flag) {
			System.out.println("삭제완료");
		} else {
			System.out.println("없는 번호. 삭제취소");
		}
	}

	// 입고
	public void updateAmount(int num, int amount) {
		int idx = prods.indexOf(new Product(num, "", 0, 0));
		if (idx < 0) {
			System.out.println("없는 번호. 입고취소");
		} else {
			Product p = prods.get(idx);
			p.setAmount(p.getAmount() + amount);
		}
	}

	// 출고. 주문에서 결제를 했는데 출고 안된 주문을 처리
	public void updateOutFlag(ArrayList<Order> orders) {
		for (Order o : orders) {
			Product p = selectByNum(o.getProd_num());
			if (p.getAmount() >= o.getAmount()) {
				int a = p.getAmount() - o.getAmount();
				p.setAmount(a);// 제품 개수를 주문 수만큼 빼줌
				o.setOut(true);// 출고 처리 결과를 주문에 저장
			} else {
				System.out.println(o.getOrder_num() + "번 주문은 수량부족으로 출고 취소");
			}
		}
	}

	public ArrayList<Product> selectAll() {
		return prods;
	}
}