package P0810.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputTest1 {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("src/P0810/IO/Files/file.txt");
            byte[] str = {'h','e','l','l','o','!'};
            // for(byte b: str) {
            //     fo.write(b);
            // }
            fo.write(str);

            fo.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
