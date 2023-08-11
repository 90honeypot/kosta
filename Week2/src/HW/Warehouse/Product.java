package HW.Warehouse;

public class Product {
    private int num; // 제품 번호 (자동할당)
    private String name;
    private int price;
    private int amount;
    private static int cnt; // 제품번호 할당을 위해

    public Product() {
    }

    public Product(String name, int price, int amount) {
        this.num = ++cnt;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public Product(int num, String name, int price, int amount) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" +
                " num='" + getNum() + "'" +
                ", name='" + getName() + "'" +
                ", price='" + getPrice() + "'" +
                ", amount='" + getAmount() + "'" +
                " }";
    }

}
