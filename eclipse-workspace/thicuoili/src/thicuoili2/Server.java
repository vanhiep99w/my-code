package thicuoili2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Server {
 
    public final static int SERVER_PORT = 1998 ;
    public static ServerSocket ss = null;
 
    public static void main(String[] args) throws IOException, InterruptedException {
    	ss = new ServerSocket(SERVER_PORT);
        Socket socket = null;
        try {
        	System.out.println("wait");
            socket = ss.accept(); // Connect to server
            System.out.println("thanah cong");
            
        } catch (IOException ie) {
            System.out.println("Can't connect to server");
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}