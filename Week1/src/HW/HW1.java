package HW;

public class HW1 {
    public static void main(String[] args) {

        System.out.println("1. 소수 구하기 (1~100 사이)");
        for (int i = 2; i < 100; i++) {
            boolean is_prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("\n");

        // --------------------------------------------------
        int n = 5;
        System.out.println("2. 별찍기, (왼쪽 직각삼각형)");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // --------------------------------------------------
        System.out.println("3. 별찍기, (오른쪽 직각삼각형)");

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // --------------------------------------------------
        System.out.println("4. 별찍기, (이등변삼각형)");
        // 1(3) 3(2) 5(1) 7(0)
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // --------------------------------------------------
        System.out.println("5. 별찍기, (다이아몬드)");
        // 5 줄, 1(2) 3(1) 5(0) 3(1) 1(2)
        for (int i = 0; i < n; i++) {
            if (i < n / 2 + 1) {
                for (int j = n / 2; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else { // n=5 ---- 3, 4 (i) --> 1, 2 // 3, 1 n-i = 2, 1
                     // n=7 ---- 4, 5, 6 (i) --> 1, 2, 3 // 5, 3, 1 n-i = 3,2,1
                for (int j = n / 2; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 2 * (n - i) - 1; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
