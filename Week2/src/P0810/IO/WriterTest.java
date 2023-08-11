package P0810.IO;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/P0810/IO/Files/file.txt");
            String str = "문자 출력 스트림: 와우 개쩌잉?";
            fw.write(str);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
