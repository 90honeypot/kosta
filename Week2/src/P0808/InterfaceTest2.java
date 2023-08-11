package P0808;

interface AA {
    public void test1();
}
interface BB {
    public void test2();
}

class CC implements AA, BB {

    @Override
    public void test2() {
        System.out.println("test2");
    }
    
    @Override
    public void test1() {
        System.out.println("test1");
    }

}

public class InterfaceTest2 {
    public static void main(String[] args) {
        CC c = new CC();
        c.test1();
        c.test2();
    }
}
