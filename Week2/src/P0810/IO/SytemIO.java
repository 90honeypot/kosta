package P0810.IO;

import java.io.IOException;

public class SytemIO {
    public static void main(String[] args) {
        int ch = 0;
        try {
            while((ch = System.in.read()) != '\n') {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        };

    }
}
