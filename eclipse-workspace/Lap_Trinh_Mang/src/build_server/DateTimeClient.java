package build_server;

import java.io.DataInputStream;
import java.net.Socket;

public class DateTimeClient {

	
	public static void main(String[] args) {
		try {
			Socket socket=new  Socket("192.168.10.50",5000);
			DataInputStream dis=new DataInputStream(socket.getInputStream());
			System.out.println(dis.readUTF());
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
