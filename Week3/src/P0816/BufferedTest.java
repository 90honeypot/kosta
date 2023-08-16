package P0816;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedTest {
    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("src/P0816/files/a.txt");
            BufferedInputStream bi = new BufferedInputStream(fi);


            FileOutputStream fo = new FileOutputStream("src/P0816/files/a.txt");
            BufferedOutputStream bo = new BufferedOutputStream(fo);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
