package P0731;

public class Hello {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        int a = 10;

        /*
         * char (단일문자) = 작은따옴표
         * String (문자열) = 큰따옴표 사용
         */

        char b = 'K';
        String name = "aaa";

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("name:" + name);

        /*
         * 기본적으로 소수점은 double 타입,
         * float로 바꿔주려면 끝에 f를 붙여야함.
         */

        float e1 = 2.34f;
        double e2 = 2.34;

        System.out.println("e: " + e1);
        System.out.println("e: " + e2 + "\n");

        a = 10;
        System.out.println("a++:" + a++);
        System.out.println("++a:" + ++a);
        System.out.println("a--:" + a--);
        System.out.println("--a:" + --a + "\n");

        /*
         * boolean ans = (100 > 10) ? true : false;
         * 
         * if (ans) {
         * System.out.println("True");
         * } else {
         * System.out.println("False");
         * }
         */

    }
}
