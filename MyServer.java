import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
        public static void main(String[] args) {
            try {
                ServerSocket serverSocket = new ServerSocket(7777);     // 7777 포트로 서버 시작
                System.out.println("포트7777에서 서버가 시작되었습니다. 클라이언트를 기다리는 중...");

                Socket socket = serverSocket.accept();                       // 클라이언트 연결 기다림
                System.out.println("클라이언트가 연결되었습니다!");

                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String input = in.readLine();                                // 클라이언트가 보낸 메세지

                System.out.println("클라이언트로부터 받은 메세지 : " + input);

                in.close();
                socket.close();
                serverSocket.close();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
