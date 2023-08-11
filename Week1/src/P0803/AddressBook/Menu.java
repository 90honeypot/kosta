package P0803.AddressBook;

import java.util.Scanner;

public class Menu {
    private MemberService service;

    public Menu() {
        service = new MemberService();
    }

    public void run(Scanner sc) {
        
        boolean flag = true;
        int num;
        while(flag) {
            printMenu();
            num = sc.nextInt();
            sc.nextLine();
            switch(num) {
                case 1:
                    service.addMember(sc);
                    break;
                case 2:
                    service.searchMember(sc);
                    break;
                case 3:
                    service.editMember(sc);
                    break;
                case 4:
                    service.deleteMember(sc);
                    break;
                case 5:
                    service.printAllMember();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
        }
    }
    void printMenu() {
        System.out.println("===== 메뉴 =====");
        System.out.println("1. 추가");
        System.out.println("2. 검색");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 전체출력");
        System.out.println("6. 종료");
        System.out.println("==============");
    }
}
