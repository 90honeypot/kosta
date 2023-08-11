package P0809;

import java.io.IOException;

class Test5 {
    public void test1() throws IOException { // throws IOException 예외처리를 미룸.
        int ch = 0;
        
        while((ch = System.in.read())!='\n'){
            System.out.print((char)ch);
        };
        System.out.println();
    }

    public void test2() throws NullPointerException {
        Object obj = null;
        System.out.println(obj.hashCode());
    }
    public void test3() {
        test2();
    }
}
public class ExceptionTest3 {
    public static void main(String[] args) {
        Test5 t = new Test5();
        try {
            t.test1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            t.test3();
        } catch (NullPointerException e) {
            System.out.println("abc");
        }
        
    }
}

