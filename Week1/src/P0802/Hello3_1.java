package P0802;

public class Hello3_1 {

    public static void main(String[] args) {
        System.out.println();
        
        Member[] m = {new Member("a", "b", "c", "d"),
                    new Member("aa", "bb", "cc", "dd"),
                    new Member("aaa", "bbb", "ccc", "ddd")};

        for (int i = 0; i < m.length; i++) {
            m[i].printMember();
            System.out.println();    
        }

        System.out.println();
    }
    
}
