package P0808;

class Product {
    String name;
    int price;
    int point;
}

class Tv extends Product {
    public Tv() {
        name = "tv";
        price = 1000;
        point = 100;
    }
}

class Audio extends Product {
    public Audio() {
        name = "Audio";
        price = 2000;
        point = 200;
    }
}

class Computer extends Product {
    public Computer() {
        price = 3000;
        name = "Computer";
        point = 300;
    }
}

class Buyer {
    int money = 10000;
    int point = 0;

    // 제품 구매 메서드 작성
    // 구매시 money 제품가격만큼 차감 / 포인트 적립 / 돈 모자르면 취소


    public void buy(Product p) {
        if (p.price > money) {
            System.out.println("돈이 모자릅니다.");
            return;
        }
        point += p.point;
        money -= p.price;
        System.out.println(p.name + " 구매 완료하였습니다.");
        System.out.println("포인트가 " + p.point + " 적립되었습니다.");
    }

    public void printStatus() {
        System.out.println("---------------");
        System.out.println("money: " + money);
        System.out.println("point: " + point);
        System.out.println("---------------");
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Buyer p = new Buyer();
        p.buy(new Computer());
        p.printStatus();
        p.buy(new Audio());
        p.printStatus();
        p.buy(new Tv());
        p.printStatus();
    }
}
