package P0810.AddressBook;

import java.util.Scanner;

public class Menu {
    private MemberService ms;

    public Menu() {
        ms = new MemberService();
    }

    public void run(Scanner sc) {
        System.out.println("선택");
        boolean flag = true;
        
        while(flag) {
            System.out.println("1.추가 2.전체목록 3.검색(이름) 4.검색(번호) 5.수정 6.삭제 7.종료");
            int n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1:
                    ms.addMember(sc);
                    break;
                case 2:
                    ms.selectListAll();
                    break;
                case 3:
                    ms.selectByName(sc);
                    break;
                case 4:
                    ms.selectByCode(sc);
                    break;
                case 5:
                    ms.updateByName(sc);
                    break;
                case 6:
                    ms.deleteByName(sc);
                    break;
                case 7:
                    flag = false;
                    break;
            }
        }
        System.out.println();
        System.out.println("==== 프로그램을 종료합니다. ====");
        System.out.println();
    }
}
