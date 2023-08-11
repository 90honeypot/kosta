package P0809;

class Test2 implements Cloneable {
    int num;
    String data;
}

public class CloneTest {
    public static void main(String[] args) {
        Test2 t1 = new Test2();
        t1.num = 1;
        t1.data = "AAA";
        // try {
        //     Test2 t2 = (Test2)t1.clone();
        // } catch (CloneNotSupportedException e) {
        //     // TODO: handle exception
        // }
        
    }
}
