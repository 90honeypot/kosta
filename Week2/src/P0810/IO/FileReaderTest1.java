package P0810.IO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/P0810/IO/Files/file.txt");
            int ch = 0;
            while((ch = fr.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
