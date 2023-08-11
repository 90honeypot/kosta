
package P0801;

import java.util.Scanner;

public class ExProfile {

    static void sumTwoNumber() {
        Scanner sc = new Scanner(System.in);

        // int[] a = { 5, 7, 3, 1, 9, 2, 6, 4 };
        int[] a = new int[8];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // 1. 요소의 합 출력
        System.out.println("1. 요소의 합 출력하기");
        int sum_all = 0;
        for (int i = 0; i < a.length; i++) {
            sum_all += a[i];
        }
        System.out.println("a 배열의 총 합 : " + sum_all + "\n");

        // 2. 가장 큰값과 작은값 찾아서 출력
        System.out.println("2. 가장 큰 값, 작은 값 찾기");
        int min_num = 10000, max_num = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min_num) {
                min_num = a[i];
            }
            if (a[i] > max_num) {
                max_num = a[i];
            }
        }
        System.out.println("가장 큰 값 : " + max_num);
        System.out.println("가장 작은 값 : " + min_num);

        sc.close();

    }

    static void searchNumber() {

        try (Scanner sc = new Scanner(System.in)) {
            int a[] = { 3, 1, 2, 6, 4, 7, 5, 8, 9, 10 }, i;
            int num = sc.nextInt();

            for (i = 0; i < a.length; i++) {
                if (num == a[i]) {
                    System.out.printf("a[%d] 방에 있습니다.\n", i);
                    break;
                }
            }
            if (i == a.length) {
                System.out.println("아무데도 없습니다.");
            }

            String str1 = sc.nextLine();
            System.out.print(str1);

            System.out.print("----");

            String str2 = sc.nextLine();
            System.out.print(str2);

        }

    }

    public static void main(String[] args) {
        Profile p1 = new Profile();
        // p1.name = "sang";
        // p1.phone = "010.XXXX.9433";
        // p1.location = "경기도 화성시";
        p1.init("sang", "010.XXXX.9433", "경기도 화성시");

        Profile p2 = new Profile();
        p2.name = "wook";
        p2.phone = "010.5524.YYYY";
        p2.location = "경기도 분당시";

        p1.printProfile();
        p2.printProfile();

        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        Profile[] person_list = new Profile[10];

        System.out.println("선언만 한 후 : " + person_list[0]);
        for (int i = 0; i < 10; i++) {
            person_list[i] = new Profile();
        }
        System.out.println("메모리할당 후 : " + person_list[0] + " 0");
        System.out.println("메모리할당 후 : " + person_list[1] + " 1");

        String[] b = { "aaa", "bbb", "ccc", "ddd" };
        for (int i = 0; i < b.length; i++) {
            System.out.printf("b[%d] : %s\n", i, b[i]);
        }

        System.out.println();
        // sumTwoNumber();
        searchNumber();

    }
}

class Profile {

    String name;
    String phone;
    String location;

    public void init(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public void printProfile() {
        System.out.printf("이름: %4s, 전화번호: %s, 주소: %s\n", name, phone, location);
    }

}
    