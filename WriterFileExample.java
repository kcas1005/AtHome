import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFileExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("샘플파일.txt");
            BufferedWriter bw = new BufferedWriter(writer);

            bw.write("안녕하세요, Write 연습중입니다.\n");
            bw.write("잘들어가는지 보고있어요.");
            
            
            bw.close();                                             // 닫아줘야 데이터 저장.
            System.out.println("파일 쓰기 완료");
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("파일 쓰기 실패" + e.getMessage());
        }
    }
}
