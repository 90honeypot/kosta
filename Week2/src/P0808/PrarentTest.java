package P0808;

class Parent {
    int x = 5;
    public void method() {
        System.out.println("x: " + x);
    }
}

class Child extends Parent {
    int y = 10;
    @Override
    public void method() {
        super.method();
        System.out.println("y: " + y);
    }
}


public class PrarentTest {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.method();
        Child c = new Child();
        c.method();

        Parent p2 = new Child(); // 업캐스팅. 타입이 올라감
        p2.method();
        
        // 다운 캐스팅: 업캐스팅된 객체로 자식 클래스에 추가된 멤버변수나 메서드를 사용할 때,
        ((Child)p2).y = 5;
        p2.method();
    } 
}
