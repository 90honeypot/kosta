package P0809;
class Test {
    int num;
    String data;
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Test) {
            Test t = (Test)obj;
        }
        return false;
    }
}
public class EqualsTest {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.num = 1;
        t1.data = "aaa";

        Test t2 = new Test();
        t2.num = 1;
        t2.data = "aaa";

        Test t3 = t1;

        System.out.println("t1.equals(t2): " + t1.equals(t2));
        System.out.println("t1.equals(t3): " + t1.equals(t3));
        System.out.println("t1 == t2: " + (t1 == t2));
        System.out.println("t1 == t3: " + (t1 == t3));
        System.out.println("t1.data.equals(t2.data): " + t1.data.equals(t2.data));
        System.out.println("t1.data == t2.data: " + (t1.data == t2.data));

        System.out.println(t2.getClass());
    }
}
