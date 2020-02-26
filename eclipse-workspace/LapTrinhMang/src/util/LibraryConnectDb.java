package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibraryConnectDb {
	private Connection conn;
	private String url = "jdbc:mysql://localhost:82/phpmyadmin/db_structure.php?server=1&db=phpmyadmin";
	private String user = "root";
	private String password = "";
	
	public Connection getConnectMySql(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Không thể nạp driver");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void main(String[] args) {
		LibraryConnectDb lDb = new LibraryConnectDb();
		System.out.println(lDb.getConnectMySql());
	}
}
