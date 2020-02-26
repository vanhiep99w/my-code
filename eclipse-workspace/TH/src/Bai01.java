

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String str = "Send MSSV,102160092";
			DatagramSocket soc = new DatagramSocket();
			DatagramPacket pac = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("192.168.10.128"),58502 );
			soc.send(pac);
			byte[] buf = new byte[1000];
			DatagramPacket rPac = new DatagramPacket(buf, buf.length);
			soc.receive(rPac);
			String STR = new String(rPac.getData()).substring(0,rPac.getLength());
			String ST=STR.toLowerCase();
			DatagramPacket pac2 = new DatagramPacket(ST.getBytes(), ST.length(), pac.getAddress(),pac.getPort());
			soc.send(pac2);
		}catch(Exception e) {
			
		}
		
	}

}
