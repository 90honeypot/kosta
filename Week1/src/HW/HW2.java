/*
    주소록 (이름(중복X), 전화, 주소)
    1. 추가
    2. 검색(이름으로)
    3. 수정(이름으로 검색해서 전화, 주소 변경)
    4. 삭제(이름으로 검색해서 삭제)
    5. 전체목록
    6. 종료
*/

package HW;

import java.util.Scanner;

public class HW2 {

    static void printMenu() {
        System.out.println("\n--------------------------------------");
        System.out.println("1. 주소록 추가");
        System.out.println("2. 주소록 검색");
        System.out.println("3. 주소록 수정");
        System.out.println("4. 주소록 삭제");
        System.out.println("5. 주소록 전체목록 보기");
        System.out.println("6. 종료하기");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook ab = new AddressBook();

        int check;
        boolean flag = true;
        String name = null, phone, loc;
        while (flag) {
            printMenu();
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    // 추가하기
                    System.out.println("--- 주소록 추가하기 ---");
                    System.out.println("1. 이름을 입력하세요.");
                    name = sc.nextLine();
                    System.out.println("2. 전화번호를 입력하세요.");
                    phone = sc.nextLine();
                    System.out.println("3. 주소를 입력하세요.");
                    loc = sc.nextLine();
                    ab.addMember(name, phone, loc);
                    break;
                case 2:
                    // 검색하기
                    System.out.println("--- 주소록 검색하기 ---");
                    System.out.println("이름을 입력하세요.");
                    name = sc.nextLine();
                    ab.findMember(name);
                    break;
                case 3:
                    // 수정하기
                    System.out.println("--- 주소록 수정하기 ---");
                    System.out.println("변경을 원하는 회원님의 이름을 입력하세요.");
                    name = sc.nextLine();
                    check = ab.find(name);
                    if (check == -1) {
                        System.out.println("존재하지 않는 회원입니다.");
                    } else {
                        System.out.println("1. 전화번호를 입력하세요.");
                        phone = sc.nextLine();
                        System.out.println("2. 주소를 입력하세요.");
                        loc = sc.nextLine();
                        ab.modifyInfo(name, phone, loc);
                    }
                    break;
                case 4:
                    // 삭제하기
                    System.out.println("--- 주소록 삭제하기 ---");
                    System.out.println("삭제을 원하는 회원님의 이름을 입력하세요.");
                    name = sc.nextLine();
                    ab.deleteMember(name);

                    break;
                case 5:
                    // 전체목록 보여주기
                    ab.printList();
                    break;
                case 6:
                    // 종료하기
                    System.out.println("\n프로그램을 종료합니다.");
                    return;
            }

        }
        sc.close();

    }
}

class Member {
    String name;
    String phone;
    String loc;

    Member(String name, String phone, String loc) {
        this.name = name;
        this.phone = phone;
        this.loc = loc;
    }

    void printMember() {
        System.out.println("\n--------------------------------------");
        System.out.println("- 이름     : " + name);
        System.out.println("- 전화번호 : " + phone);
        System.out.println("- 주소     : " + loc);
        System.out.println("--------------------------------------");
    }
}

class AddressBook {

    int MAX_NUMBER_MEM = 100;

    Member[] mem = new Member[MAX_NUMBER_MEM];
    static int count = 0; // 현재 등록된 회원 수

    int find(String name) {
        // return 값 : -1 -> 없음/ n -> idx 값
        for (int i = 0; i < count; i++) {
            if (name.equals(mem[i].name)) { // 회원이 존재함
                return i;
            }
        }
        return -1;
    }

    // 1. 추가
    int addMember(String name, String phone, String loc) {
        // return 1 -> 성공, 0 -> 실패
        int check = find(name);
        if (check != -1) {
            System.out.println("\n이름이 중복되었습니다. (" + name + ")");
            return 0;
        } else {
            mem[count] = new Member(name, phone, loc);
            System.out.println("\n성공적으로 추가되었습니다.");
            mem[count].printMember();
            count += 1;
            return 1;
        }
    }

    // 2. 검색 (이름으로 검색)
    void findMember(String name) {
        int check = find(name);
        if (check == -1) {
            System.out.printf("\n%s 의 회원정보가 없습니다.\n", name);
        } else {
            mem[check].printMember();
        }
    }

    // 3. 수정 (이름으로 검색, 전화번호, 주소 변경)
    int modifyInfo(String name, String phone, String loc) {
        // return 값: 0 -> 이름 없음, 1 -> 수정 완료
        int idx = find(name);
        if (idx == -1) { // 이름이 주소록에 없으면,
            System.out.printf("\n%s 의 회원정보가 없습니다.\n", name);
            return 0;
        } else { // 이름이 주소록에 있으면,
            mem[idx].phone = phone;
            mem[idx].loc = loc;
            System.out.println("\n전화번호와 주소가 성공적으로 바뀌었습니다.");
            mem[idx].printMember();
            return 1;
        }
    }

    // 4. 삭제 (이름으로 검색)
    void deleteMember(String name) {
        int idx = find(name);
        if (idx == -1) { // 이름이 주소록에 없으면,
            System.out.printf("\n%s 의 회원정보가 없습니다.\n", name);
        } else { // 이름이 주소록에 있으면,
            int i;
            for (i = idx; i < count - 1; i++) {
                mem[i].name = mem[i + 1].name;
                mem[i].phone = mem[i + 1].phone;
                mem[i].loc = mem[i + 1].loc;
            }
            System.out.printf("\n%s 의 회원정보가 삭제되었습니다.\n", name);
            count -= 1;
        }
        return;
    }

    // 5. 전체목록
    void printList() {
        int i;
        System.out.println("\n------------<주소록 목록>-------------");
        System.out.println("  이름\t\s\s전화번호\t   주소\t");
        for (i = 0; i < count; i++) {
            // mem[i].printMember();
            // System.out.println(mem[i].name + " " + mem[i].phone + " " + mem[i].loc);
            System.out.printf("%4s\t\s\s%11s\t%s\n", mem[i].name, mem[i].phone, mem[i].loc);
        }
        System.out.println("--------------------------------------");
    }

}