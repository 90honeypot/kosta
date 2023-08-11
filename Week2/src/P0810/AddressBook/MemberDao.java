package P0810.AddressBook;

import java.util.ArrayList;

public class MemberDao {
    private ArrayList<Member> list;

    public MemberDao() {
        list = new ArrayList<>();
    }

    public ArrayList<Member> getList() {
        return this.list;
    }

    public void insert(Member m) {
        list.add(m);
    }

    public boolean selectAll() {
        if (list.isEmpty()) {
            return false;
        }
        for (Member m : list) {
            System.out.println(m);
        }
        return true;
    }

    public Member getMemberByName(String name) {
        for (Member m : list) {
            if (m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }

    public Member getMemberByCode(int code) {
        for (Member m : list) {
            if (m.getCode() == code) {
                return m;
            }
        }
        return null;
    }

    public void update(Member m) {
        Member mem = getMemberByName(m.getName());
        int idx = list.indexOf(mem);
        list.set(idx, m);
    }

    public void delete(Member m) {
        list.remove(m);
    }

}
