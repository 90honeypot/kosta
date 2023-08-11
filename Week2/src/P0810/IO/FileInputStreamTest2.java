package P0810.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        int size;
        try {
            // 파일에서 1바이트씩 읽음
            FileInputStream fi = new FileInputStream("src/P0810/IO/Files/file.txt");
            int cnt = 0;
            while(true) {
                size = fi.read(buffer);
                System.out.println(new String(buffer)); // byte배열을 문자열로 변환
                cnt ++;
                if (size != buffer.length) {
                    break;
                }
            }
            fi.close();
            System.out.println(cnt);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

