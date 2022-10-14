package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
public Properties pro;
	public void readconfigfile() {
		String propath = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		 pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
