package cts.miniprjct.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties pro;

	public ConfigReader() {

	try {
	File src=new File("./Configuration1/Config.property");

	FileInputStream fis=new FileInputStream(src);

	pro=new Properties();

	pro.load(fis);
	} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println("Exception is" + e.getMessage());
	}

	}
	public String getchromepath() {
	String path=pro.getProperty("chromeDriver");
	return path;
	}

	public String getApplicationURL() {
	return pro.getProperty("URL");
	}
}
