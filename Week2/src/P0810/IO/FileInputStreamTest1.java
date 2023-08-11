package P0810.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        try {
            // 파일에서 1바이트씩 읽음
            FileInputStream fi = new FileInputStream("src/P0810/IO/Files/file.txt");
            int ch = 0;
            while((ch = fi.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println();
            fi.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
