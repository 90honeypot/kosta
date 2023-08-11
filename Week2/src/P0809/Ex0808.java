package P0809;

import java.util.Scanner;

public class Ex0808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] words = { "시발", "꺼져", "씨발", "개새끼야" };
        System.out.println("하고싶은 말 다 하세요");
        System.out.println("그만하고 싶으면 1을 입력하세요");
        while (true) {
            String str = sc.nextLine();
            if (str.startsWith("1")) {
                break;
            }
            for (String w : words) {
                if (str.contains(w)) {
                    str = str.replace(w, "xxx");
                }
            }
            sb.append(str + '\n');
        }
        System.out.println("--------출력-------");
        System.out.println(sb);

    }
}
