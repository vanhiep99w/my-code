package build_server;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DayTimeServer {

	public static final int daytimePort=5000;
	public static void main(String[] args) {
		ServerSocket theServer;
		try {
			theServer=new ServerSocket(daytimePort);
			while(true) {
				Socket socket=theServer.accept();
				new MyThread(socket).start();;
			}
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}
class MyThread extends Thread{
	Socket socket;
	public MyThread(Socket socket) {
		this.socket=socket;
	}
	public void run() {
		try {
			System.out.println("có kết nối : "+ socket.getInetAddress());
			DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
			dos.writeUTF("TBH"
					+ ""+new  Date().toString());
			//Thread.sleep(100);
			dos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
