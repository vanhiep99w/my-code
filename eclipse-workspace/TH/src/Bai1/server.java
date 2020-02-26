package Bai1; 

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.ServerSocket; 
import java.net.Socket; 
 
public class server { 
	
	public String chuHoa(String s) {
    	s = s.trim();
    	String tam = "";
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(c >= 'a' && c <= 'z') c = (char)(c-32);
    		tam += c;
    	}
    	return tam;
    }
	
	public String chuthuong(String s) {
    	s = s.trim();
    	String tam = "";
    	for(int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(c >= 'A' && c <= 'Z') c = (char)(c+32);
    		tam += c;
    	}
    	return tam;
    }
	
	public int demSoTu(String s) {
		int count = 0;
		try {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ' && s.charAt(i+1) != '\0') {
					count++;
				}
			}
			if(s.charAt(0) != ' ') count++;
			return count;
		} catch(Exception e) {
			return count;
		}
	}
	
    public static void main(String []args) throws IOException 
    { 
        String str, str1, str2, str3;
        int count; 
        // tao server socket 
        ServerSocket server = new ServerSocket(1234); 
        System.out.println("Server is now already"); 
        //tao 1 socket do ket noi tu client toi server 
        Socket connectionSocket = server.accept(); 
        //tao luong nhan du lieu tu client 
        DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream()); 
        // tao luong gui du lieu toi client 
        DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 
        // truyen du lieu tu client vao
        str = inFromClient.readUTF();
        server dt = new server();
        str1 = dt.chuHoa(str);
        str2 = dt.chuthuong(str);
        count = dt.demSoTu(str);
       
        //gui ve client 
        str3 = String.valueOf(count);
        outToClient.writeBytes(str1+'\n');
        outToClient.writeBytes(str2+'\n');
        outToClient.writeBytes(str3+'\n');
        //dong luong nhan du lieu tu client 
        inFromClient.close(); 
        //dong luong gui du lieu ve client 
        outToClient.close(); 
        //dong server socket 
        server.close(); 
    } 
}