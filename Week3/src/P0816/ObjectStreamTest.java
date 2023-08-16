package P0816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable {
    String name;
    int age;

    Member() {
    }

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectStreamTest {
    public static void main(String[] args) {
        Member m1 = new Member("aaa", 12);
        try {
            ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Week3/src/P0816/file/e.datas"));
            oo.writeObject(m1);
            oo.close();

            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("Week3/src/P0816/file/e.datas"));
            Member m2 = (Member) oi.readObject();
            oi.close();
            System.out.println(m2.name + m2.age);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
