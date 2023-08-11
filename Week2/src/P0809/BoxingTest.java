package P0809;

public class BoxingTest {
    public static void main(String[] args) {
        // 모든 객체 타입을 저장할 수 있다.
        Object[] arr = new Object[5];
        arr[0] = "aaa";                   // String
        // arr[1] = new Integer(5);    // Integer
        arr[1] = 5;
        // arr[2] = new Float(4.5f);   // Float
        arr[2] = 4.5f;
        arr[3] = new Test();
        arr[4] = new Test2();

        ((Test)arr[2]).num = 100;
        ((Test)arr[2]).data = "aaaa";
    }
}
