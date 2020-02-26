package show_ip_address;

import java.net.Socket;

public class ConnectWed {

	public static void main(String[] args) {
		try {
			Socket soc=new Socket("192.168.10.128",80);
			System.out.println(soc.getInetAddress());
			System.out.println(soc.getPort());
			System.out.println("local Port : "+ soc.getLocalPort());
			System.out.println("local Address : "+soc.getLocalAddress()+" * Mỗi lần chạy ra một kết quả cổng khác nhau *");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
