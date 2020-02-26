package show_ip_address;

import java.net.InetAddress;

public class IPAddressses {

	public static void main(String[] args) {
		try {
			
			InetAddress[] addresses=InetAddress.getAllByName(args[0]);
			
			for(int i=0;i<addresses.length;i++) {
				System.out.println(addresses[i]);
			}
		} catch (Exception e) {
			System.out.println("could not find "+ args[0]);
		}
	}
}
