package P0816;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("Week3/src/P0816/file/a.txt", "r");
            int ch;
            raf.seek(10);
            ch = raf.read();
            System.out.println((char) ch);
            raf.seek(6);
            ch = raf.read();
            System.out.println((char) ch);
            System.out.println(raf.length());

            for (long i = raf.length() - 1; i >= 0; i--) {
                raf.seek(i);
                System.out.print((char) raf.read());
            }

            raf.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
