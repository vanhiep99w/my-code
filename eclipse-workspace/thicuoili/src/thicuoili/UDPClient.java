package thicuoili;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	final static String HOST_NAME = "10.10.33.21";
	final static int PORT_ID = 54401;
	public final static byte[] BUFFER = new byte[4096];
	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket();
			InetAddress server = InetAddress.getByName(HOST_NAME);
			while(true) {
				String strToSend = "Send MSSV,102160118";
                DatagramPacket dp = new DatagramPacket(strToSend.getBytes(), strToSend.length(), server, PORT_ID);
                ds.send(dp);
                
                DatagramPacket rPac = new DatagramPacket(BUFFER, BUFFER.length);
                ds.receive(rPac);

                String s = new String(rPac.getData()).substring(0,rPac.getLength());
                String[] strings = s.split(",");
                BigInteger a = new BigInteger(strings[0]);
                BigInteger b = new BigInteger(strings[1]);
                BigInteger res = a.multiply(b);
                
                String ans = "from client,"+a.toString() + ","+ b.toString() + "," + res.toString();
                System.out.println(ans);
                DatagramPacket dp2 = new DatagramPacket(ans.getBytes(), ans.length(), server,PORT_ID);
                ds.send(dp2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			ds.close();
		}
	}
}
