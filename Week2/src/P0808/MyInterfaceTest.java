package P0808;

class MyInterfaceImpl implements MyInterface {

    @Override
    public void test1() {
        System.out.println("test1 구현");
    }

    @Override
    public void test2(String str) {
        System.out.println(str + " test2 구현");
    }

}

public class MyInterfaceTest {
    public static void main(String[] args) {
        MyInterfaceImpl mi = new MyInterfaceImpl();
        System.out.println("val: " + MyInterface.VAL);
        mi.test1();
        mi.test2("abc");
    }
}
