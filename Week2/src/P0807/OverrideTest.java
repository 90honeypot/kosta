package P0807;

class TestParent {
    int num = 10;

    public void method() {
        System.out.println("num: " + num);
    }
}

class TestChild extends TestParent {
    String name = "Child";
        
    @Override
    public void method() {
        System.out.println("num: " + num + "/ name: " + name);
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        TestParent p = new TestParent();
        p.method();

        TestChild c = new TestChild();
        c.method();
        
        // up-casting: 타입을 부모로 올림. 다형성 구현 목적
        TestParent p2 = new TestChild();
        p2.num = 20;
        // p2.name = "ABC";
        p2.method(); // 재정의된 메서드를 호출하면 타입이 부모지만 재정의된 자식 버전의 메서드가 호출
    }
}
