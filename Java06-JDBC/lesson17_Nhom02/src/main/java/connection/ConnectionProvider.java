package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider {
	private ConfigurationProvider conf = null;

	public ConnectionProvider() {
		conf =new ConfigurationProvider();
	}

	public Connection getConnection() {
		Connection conn = null;
		Properties pro = conf.getProperties();
		try {
			Class.forName(pro.getProperty("driverClass"));
			conn = DriverManager.getConnection(pro.getProperty("url"),  pro.getProperty("user"), pro.getProperty("password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
