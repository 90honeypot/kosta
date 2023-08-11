package Storage;

public class Product {

    private int code;
    private String name;
    private int price;
    private int quantity;
    
    public Product() { }
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "{" +
            " code = '" + getCode() + "'" +
            ", name = '" + getName() + "'" +
            ", price = '" + getPrice() + "'" +
            ", quantity = '" + getQuantity() + "'" +
            " }";
    }


}
