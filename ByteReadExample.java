import java.io.*;
import java.nio.charset.StandardCharsets;

public class ByteReadExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("byte-output.txt");
            InputStreamReader isr = new InputStreamReader(fis,StandardCharsets.UTF_8);

            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char)byteData); // 바이트 → 문자 출력
            }

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
