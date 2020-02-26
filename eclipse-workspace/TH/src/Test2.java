


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
 
public class Test2 {
 
	public static boolean nto(int n) {
		if (n==0||n==1) return false;
		//else if(n==1 || n==2) return true
		int i;
		for ( i =2; i<= Math.sqrt(n);i++) {
			if (n%i==0) return false;
		}
		return (i>Math.sqrt(n));
	}
    public final static int SERVER_PORT = 5000;
 
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        Test2 xl = new Test2();
        try {
            System.out.println("Binding to port " + SERVER_PORT + ", please wait  ...");
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Server started: " + serverSocket);
            System.out.println("Waiting for a client ...");
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Client accepted: " + socket);
 
                    DataInputStream is = new DataInputStream(socket.getInputStream());
                    DataOutputStream os = new DataOutputStream(socket.getOutputStream());
                    String ch;
                    while (true) {
                        ch = is.readUTF(); // Receive data from client
                        System.out.println(ch);
                       // System.out.println(ch);
                        int n= Integer.parseInt(ch);
                        String str="";
                        for(int i=2; i<=n;i++) {
                        	if ((n%i==0) && nto(i)) {
                        		str=str.concat(i+""+ " ") ;
                        	}
                        }
                        System.out.println(str.trim());
                    	os.writeUTF(str.trim());
                    }
                   // socket.close();
                } catch (IOException e) {
                    System.err.println(" Connection Error: " + e);
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
        //System.out.println(nto(9));
    }
 
}
