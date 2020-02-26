package app;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import dao.StudentDao;
import model.Request;
import model.Student;

public class SocketThread implements Runnable{
	private Socket sk;
	private int clientCount;
	
	public SocketThread(Socket sk, int count) {
		this.sk = sk;
		this.clientCount = count;
	}
	
	@Override
	public void run() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(sk.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(sk.getInputStream());
			StudentDao studentDao = new StudentDao();
			while (true) {
				Request req = (Request) ois.readObject();
				ArrayList<Student> listStudents = new ArrayList<>();
				if (req.getType() == 1) {
					listStudents = studentDao.getDataByName(req.getContent());
				} else if (req.getType() == 2) {
					int id = Integer.parseInt(req.getContent());
					listStudents = studentDao.getDataByID(id);
				} else {
					int idKhoi = Integer.parseInt(req.getContent());
					listStudents = studentDao.getDataByKhoiId(idKhoi);
				}
				
				oos.writeObject(listStudents);
				oos.reset();
			}
		} catch (IOException | ClassNotFoundException | NumberFormatException e) {
			
		} finally {
			System.out.println("Client " + this.clientCount + " đã đóng kết nối");
		}
	}
	
}
