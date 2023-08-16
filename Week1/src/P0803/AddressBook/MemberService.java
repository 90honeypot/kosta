package P0803.AddressBook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/*
 * Service
 * - 사용자에 제공할 기능 구현
 */
public class MemberService {
    
    private MemberDao dao;
    private String path = "Week1/src/P0803/AddressBook/data.datas";
    
    public MemberService () {
        dao = new MemberDao();
    }

    public void start() {
        try {
            File f = new File(path); // File : 파일에 대한 정보
            if(!f.exists()) {
                System.out.println("첫 실행입니다.");
                return;
            }
            FileInputStream fi = new FileInputStream(path);
            ObjectInputStream oi = new ObjectInputStream(fi);
            int i=0;
            while (true) {
                Member m = (Member) oi.readObject();
                dao.add(m);
                i++;
                if(fi.available() < 10) {
                    break;
                }
            }
            System.out.println("i = " + i);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            FileOutputStream fo = new FileOutputStream(path);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            for (Member m: dao.getDatas()) {
                if (m == null) {
                    break;
                }
                oo.writeObject(m);
            }
            oo.close();
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
