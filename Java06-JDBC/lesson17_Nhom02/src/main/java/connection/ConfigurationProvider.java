package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationProvider {

	Properties getProperties() {
		Properties props =new  Properties();
		File file=new File("config.properties");
		InputStream inputStream;
		try {
			inputStream = new FileInputStream(file);
			props.load(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return props;
	}
}
