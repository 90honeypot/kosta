package P0816.memopad;

import java.util.Scanner;

public class Menu {
    private MemoService service;

    public Menu() {
        service = new MemoService("Week3/src/P0816/memopad/memo/");
    }

    public void run(Scanner sc) {
        service.mkdir();
        boolean flag = true;
        int m = 0;
        while (flag) {
            System.out.println("1.읽기 2.쓰기 3.삭제 4.종료");
            m = sc.nextInt();
            switch (m) {
                case 1:
                    service.read(sc);
                    break;
                case 2:
                    service.write(sc);
                    break;
                case 3:
                    service.delete(sc);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}