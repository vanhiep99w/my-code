package app;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {
	public static final String IP = "192.168.0.13";
	public static final int PORT = 9999;
	public static void main(String[] args) {
		int clientCount = 0;
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			System.out.println("Server is started at port: " + PORT);
			while (true) {
				clientCount++;
				SocketThread socket = new SocketThread(serverSocket.accept(), clientCount);
				new Thread(socket).start();
				System.out.println("Client " + clientCount + " đã kết nối...");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
