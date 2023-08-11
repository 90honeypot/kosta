package P0809;

import java.util.Scanner;

public class StringExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"십장생", "시베리안허스키", "양아치", "바나나", "학교"};
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = sc.nextLine();
            if (str.startsWith("stop")) {
                break;
            }
            String[] arr = str.split(" ");
            for (String s: arr) {
                for(String w : words) {
                    if(s.contains(w)) {
                        str = str.replace(w, "삐리리");
                    }
                }
            }
            System.out.println(str);
        }
    }
}
