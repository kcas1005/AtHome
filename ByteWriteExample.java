import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ByteWriteExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("byte-output.txt");

            String data = "이건 바이트로 저장된 문자열입니다. \n제대로 저장 되는지 모르겠네?";
            byte[] bytes = data.getBytes(StandardCharsets.UTF_8);         //문자열 → 바이트 배열

            fos.write(bytes);
            fos.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
