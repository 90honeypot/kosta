package P0802;

import java.util.Scanner;
public class CalcTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calc c = new Calc();
        System.out.println("add -> " + c.add(a,b));
        System.out.println("sub -> " + c.sub(a,b));
        System.out.println("mul -> " + c.mul(a,b));
        System.out.println("div -> " + c.div(a,b));
        sc.close();
    }
}

class Calc {
    int add(int a, int b) {
        return a + b;
    }
    int sub(int a, int b) {
        return a - b;
    }
    int mul(int a, int b) {
        return a * b;
    }
    float div(int a, int b) {
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return b;
        }
        
        return (float) a / b;
    }
}

