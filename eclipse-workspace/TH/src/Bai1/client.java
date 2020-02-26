package Bai1;

import java.io.DataInputStream; 
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.Socket; 
import java.net.UnknownHostException; 

public class client { 
    public static void main(String []args) throws IOException 
    { 
        // khoi tao 3 bien kieu String 
        String s,s1, s2,s3; 
        //tao socket de ket noi toi server 
        Socket ClientSocket = new Socket("Localhost", 1234); 
        //thong bao da ket noi thanh cong 
        System.out.println("Connected to server"); 
        //tao luong nhap du lieu tu ban phim 
        DataInputStream inFromUser = new DataInputStream(System.in); 
        //tao luong nhan du lieu tu server 
        DataInputStream inFromServer = new DataInputStream(ClientSocket.getInputStream()); 
        //tao luong gui du lieu len server 
        DataOutputStream outToServer = new DataOutputStream(ClientSocket.getOutputStream()); 
        // nhap lieu tu ban phim 
        try{ 
            System.out.println("nhap chuoi:"); 
            s=inFromUser.readUTF(); 
            // gui len server 
             outToServer.writeBytes(s+'\n');  
        }catch(UnknownHostException e) 
        { 
            System.err.println("Server Not Found"); 
            System.exit(1); 
        }catch(IOException e) 
        { 
            System.err.println("Cannot make a connection"); 
            System.exit(1); 
        } 
         
        //nhan ve tu server 
        s1=inFromServer.readUTF(); 
        s2=inFromServer.readUTF();
        s3=inFromServer.readUTF();
        //in ra man hinh 
        System.out.println("chuoi hoa :"+s1); 
        System.out.println("chuoi thuonh :"+s2);
        System.out.println("so tu :"+s3);
        //dong luong gui du lieu len server 
        outToServer.close(); 
        //dong luong nhan du lieu tu server 
        inFromServer.close(); 
        //dong socket client 
        ClientSocket.close(); 
    } 

} 