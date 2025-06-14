import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteReadWithEncodring {
    public static void main(String[] args) {
        try {
            InputStreamReader reader = new InputStreamReader(
                new FileInputStream("encoded-output.txt"),"UTF-8"
            );

            int ch;
            while((ch = reader.read()) != -1){
                System.out.println((char) ch);
            }

            reader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
