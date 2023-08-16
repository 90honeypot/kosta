package P0816.test;

public class Order {
	private static int cnt;
	private int order_num;// 주문번호
	private int prod_num;// 주문한 상품 번호
	private int amount; // 주문수량
	private int payment; // 결제금액
	private boolean pay; // 결제여부
	private boolean out;// 출고여부

	public Order() {
	}

	//주문
	public Order(int prod_num, int amount, int payment) {
		this.order_num = ++cnt;
		this.prod_num = prod_num;
		this.amount = amount;
		this.payment = payment;
	}

	public Order(int order_num, int prod_num, int amount, int payment, boolean pay, boolean out) {
		this.order_num = order_num;
		this.prod_num = prod_num;
		this.amount = amount;
		this.payment = payment;
		this.pay = pay;
		this.out = out;
	}

	public int getOrder_num() {
		return order_num;
	}

	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}

	public int getProd_num() {
		return prod_num;
	}

	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public boolean isOut() {
		return out;
	}

	public void setOut(boolean out) {
		this.out = out;
	}

	@Override
	public String toString() {
		return "Order [order_num=" + order_num + ", prod_num=" + prod_num + ", amount=" + amount + ", payment="
				+ payment + ", pay=" + pay + ", out=" + out + "]";
	}

}