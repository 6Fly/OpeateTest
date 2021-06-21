import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class BioPractice {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(8090);
        System.out.println("socket create success");
        while (true){
            Socket client = socket.accept();
            System.out.println("client connect success");
            new Thread(()->{
                try {
                    InputStream inputStream = client.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    while (true) {
                        String re = reader.readLine();
                        if (re != null) {
                            System.out.println(re);
                        } else {
                            client.close();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
