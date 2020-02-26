package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) {
	try {
		DatagramSocket soc = new DatagramSocket(5000);
		while(true) {
			byte[] buf = new byte[1000];
			DatagramPacket pac = new DatagramPacket(buf, buf.length);
			soc.receive(pac);
			String str = new String(pac.getData());
			int l = pac.getLength();
			str = str.substring(0,l);
			String STR = str.toUpperCase();
			DatagramPacket rPac = new DatagramPacket(STR.getBytes(), STR.length(), pac.getAddress(),pac.getPort());
			soc.send(rPac);
			System.out.println(pac.getAddress());
			System.out.println(pac.getPort());
			System.out.println(str);
		}
		
		
	}catch(Exception e) {
		
	}

}
}