package P0810.AddressBook;

import java.util.Scanner;

public class MemberService {
    private MemberDao dao;

    public MemberService() {
        dao = new MemberDao();
    }

    public void addMember(Scanner sc) {
        System.out.println("==== 멤버 추가 ====");
        Member m = null;
        String name = "";
        
        do {
            System.out.println("이름을 입력하세요.");
            name = sc.nextLine();
            m = dao.getMemberByName(name);
        } while (m != null);

        System.out.println("전화번호 입력하세요.");
        String tel = sc.nextLine();
        System.out.println("주소를 입력하세요.");
        String addr = sc.nextLine();
        m = new Member(dao.getList().size()+1, name, tel, addr);
        dao.insert(m);
        System.out.println("---- 멤버 등록 완료 ----");
        System.out.println(m);
        System.out.println();
    }

    public void selectListAll() {
        System.out.println("멤버 리스트");
        if(!dao.selectAll()) {
            System.out.println("등록된 멤버가 없습니다.");
        }
        System.out.println();
    }

    public void selectByName(Scanner sc) {
        System.out.println("==== 멤버 검색(이름) ====");
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        Member m = dao.getMemberByName(name);
        if(m == null) {
            System.out.println("해당 멤버가 없습니다.");
        } else {
            System.out.println("---- 검색 결과 ----");
            System.out.println(m);
        }
        System.out.println();
    }

    public void selectByCode(Scanner sc) {
        System.out.println("==== 멤버 검색(번호) ====");
        System.out.println("번호을 입력하세요.");
        int code = sc.nextInt();
        sc.nextLine();
        Member m = dao.getMemberByCode(code);
        if(m == null) {
            System.out.println("해당 멤버가 없습니다.");
        } else {
            System.out.println("---- 검색 결과 ----");
            System.out.println(m);
        }
        System.out.println();       
    }

    public void updateByName(Scanner sc) {
        System.out.println("==== 수정 ====");
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        String tel = "";
        String addr = "";
        Member m = dao.getMemberByName(name);
        if(m == null) {
            System.out.println("해당 멤버가 없습니다.");
        } else {
            System.out.println("---- 수정 전 정보 ----");
            System.out.println(m);
            System.out.println();
            System.out.println("수정할 전화번호 입력하세요.");
            tel = sc.nextLine();
            // m.setTel(sc.nextLine());
            System.out.println("수정할 주소 입력하세요.");
            addr = sc.nextLine();
            // m.setAddr(sc.nextLine());
            dao.update(new Member(m.getCode(), name, tel, addr));
            System.out.println("---- 수정 결과 ----");
            System.out.println(dao.getMemberByName(name));
        }
        System.out.println();   
    }

    public void deleteByName(Scanner sc) {
        System.out.println("==== 멤버 삭제 ====");
        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        Member m = dao.getMemberByName(name);
        if(m == null) {
            System.out.println("해당 멤버가 없습니다.");
        } else {
            dao.delete(m);
            System.out.println("---- 삭제 완료 ----");
        }
        System.out.println();       
    }
    
}
