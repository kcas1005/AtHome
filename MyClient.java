import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 7777);      // 서버에 연결

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.write("클라이언트에서 보내는 문자! \n");
            out.flush();

            out.close();
            socket.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
