package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection conn;
	private String url;
	private String user;
	private String password;
	
	public ConnectDB() {
		this.url = "jdbc:mysql://localhost:3306/do_an_csnm?useUnicode&characterEncoding=UTF-8";
		this.user = "root";
		this.password = "";
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
