package P0816;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWriterTest {
    public static void main(String[] args) {
        int ch;
        InputStreamReader ir = new InputStreamReader(new BufferedInputStream(System.in)); // 버퍼 사용하고 싶을 때,
        try {
            while((ch = ir.read()) != '\n') {
                System.out.print((char)ch);
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
