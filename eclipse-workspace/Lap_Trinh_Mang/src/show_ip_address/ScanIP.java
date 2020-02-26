package show_ip_address;

import java.net.InetAddress;

public class ScanIP {

	public static void main(String[] args) {
	    new ScanIP();
	}
	public  ScanIP() {
	
		for(int i=1;i<255;i++) {
			new MyThread(i).start();
		}
		
	}
}
class MyThread extends Thread{
	int i;
	public MyThread(int i) {
		this.i=i;
	}
	public void run() {
			try {
				InetAddress ips[]=InetAddress.getAllByName("192.168.10."+i);
				for(InetAddress ip:ips) {
					System.out.println(ip.getHostName());
				}
			} catch (Exception e) {
				System.out.println("error");
			}
		}
	}

