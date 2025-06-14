import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ByteWriteWithEncoding {
    public static void main(String[] args){
        try {
            OutputStreamWriter writer = new OutputStreamWriter(
                new FileOutputStream("encoded-output.txt"), "UTF-8"
            );

            writer.write("인코딩 테스트 중");
            writer.close();

            System.out.println("UTF-8 인코딩으로 파일 쓰기 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
