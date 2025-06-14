import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("샘플파일.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            while((line = br.readLine()) != null){
                System.out.println("읽은 내용: " + line);
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("읽기 실패 " + e.getMessage() );
        }
    }
}
