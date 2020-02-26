package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String str = sc.next();
			DatagramSocket soc = new DatagramSocket();
			DatagramPacket pac = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"),5000);
			soc.send(pac);
			byte[] buf = new byte[1000];
			DatagramPacket rPac = new DatagramPacket(buf, buf.length);
			soc.receive(rPac);
			String STR = new String(rPac.getData());
			System.out.println(STR);
			
		}catch(Exception e) {
			
		}
	}

}
