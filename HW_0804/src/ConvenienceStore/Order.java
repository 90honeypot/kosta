package ConvenienceStore;

public class Order {
    private int code = 1;           // 주문번호 (자동할당)
    private int product_code;       // 주문한 상품번호
    private String name;            // 상품명
    private int quantity;           // 주문수량
    private int total_price;        // 결제가격
    private boolean paid;           // 결제여부
    private boolean released;       // 출고여부
    private boolean canceled;       // 취소여부


    public Order() {
    }

    public Order(int product_code, String name, int quantity, int total_price, boolean paid, boolean released, boolean canceled) {
        this.product_code = product_code;
        this.name = name;
        this.quantity = quantity;
        this.total_price = total_price;
        this.paid = paid;
        this.released = released;
        this.canceled = canceled;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getProduct_code() {
        return this.product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal_price() {
        return this.total_price;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public boolean isPaid() {
        return this.paid;
    }

    public boolean getPaid() {
        return this.paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean getReleased() {
        return this.released;
    }

    public void setReleased(boolean released) {
        this.released = released;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean getCanceled() {
        return this.canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }


    @Override
    public String toString() {
        return "{" +
            " code = '" + getCode() + "'" +
            ", product_code = '" + getProduct_code() + "'" +
            ", name = '" + getName() + "'" +
            ", quantity = '" + getQuantity() + "'" +
            ", total_price = '" + getTotal_price() + "'" +
            ", paid = '" + isPaid() + "'" +
            ", released = '" + isReleased() + "'" +
            ", canceled = '" + isCanceled() + "'" +
            " }";
    }


}
