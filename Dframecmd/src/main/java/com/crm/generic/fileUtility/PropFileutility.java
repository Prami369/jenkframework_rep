package com.crm.generic.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropFileutility {

	
	
	public String getDataFromPropertyfile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./configAppData/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
	
		
		
	}
}
