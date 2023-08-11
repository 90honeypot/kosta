package P0808;

class A {
    int num;

    public A(int num) {
        this.num = num;
    }
}

class B extends A {
    String str;

    public B(int num, String str) {
        super(num); // 부모 생성자 호출. 생성자 내에서 1줄로 작성
        this.str = str;
    }

}

public class SuperTest {

    public static void main(String[] args) {
        B b = new B(1, "abc");
        System.out.println("num: " + b.num);
        System.out.println("str: " + b.str);
    }
}
