package P0803.AddressBook;

import java.util.Scanner;

/*
 * Service
 * - 사용자에 제공할 기능 구현
 */
public class MemberService {
    
    private MemberDao dao;
    
    public MemberService () {
        dao = new MemberDao();
    }

    // 1. 추가

    public void addMember(Scanner sc) {

        String name = "";
        String tel = "";
        String address = "";
        
        System.out.println("====== 추가 ======");
        int idx = -2;
        while(idx != -1) {
            if(idx > -1) {
                System.out.println("** 이름이 중복되었습니다. 다시 입력해주세요.");
            }
            System.out.println(">> 이름 :");
            name = sc.nextLine();
            idx = dao.getIdxByName(name);
        }
        System.out.println(">> 전화번호 :");
        tel = sc.nextLine();
        System.out.println(">> 주소 :");
        address = sc.nextLine();
        
        boolean flag = dao.add(new Member(name, tel, address));
        if (flag) {
            System.out.println("#### 추가 완료 ####\n");
        } else {
            System.out.println("#### 주소록 꽉차서 추가할 수 없음 ####\n");
        }

    }

    // 2. 검색
    public void searchMember(Scanner sc) {
        String name = "";
        System.out.println("====== 검색 ======");
        System.out.println(">> 이름 :");
        name = sc.nextLine();
        int idx = dao.getIdxByName(name);
        if(idx == -1) {
            System.out.println(name + " 회원을 찾을 수 없습니다.\n");
        } else {
            System.out.println("##### 검색하신 회원 정보 #####");
            System.out.println(dao.search(idx).toString());
            System.out.println();
        }
    }

    // 3. 수정
    public void editMember(Scanner sc) {
        String name = "";
        System.out.println("====== 검색 ======");
        System.out.println(">> 이름 :");
        name = sc.nextLine();
        int idx = dao.getIdxByName(name);
        if(idx == -1) {
            System.out.println(name + " 회원을 찾을 수 없습니다.\n");
        } else {
            Member m = dao.search(idx);
            System.out.println("##### 수정할 정보 #####");
            System.out.println(">> 전화번호 :");
            m.setTel(sc.nextLine());
            System.out.println(">> 주소 :");
            m.setAddress(sc.nextLine());
            System.out.println("##### 수정완료 #####");
            System.out.println(dao.search(idx).toString());
            System.out.println();
        }
    }

    // 4. 삭제
    public void deleteMember(Scanner sc) {
        String name = "";
        System.out.println("====== 삭제 ======");
        System.out.println(">> 이름 :");
        name = sc.nextLine();
        int idx = dao.getIdxByName(name);
        if(idx == -1) {
            System.out.println(name + " 회원을 찾을 수 없습니다.\n");
        } else {
            dao.delete(idx);
            System.out.println("##### 삭제완료 #####");
            System.out.println();
        }
    }

    // 5. 전체출력
    public void printAllMember() {
        if (dao.getMemberCount() > 0) {
            System.out.println("등록된 회원 수: " + dao.getCount());
            dao.getAll();
        } else {
            System.out.println("주소록에 등록된 회원이 없습니다.\n");
        }
    }
}
