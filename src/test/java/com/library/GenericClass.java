package com.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericClass {

	public static String configPath = BaseAutomation.sdirectorypath + "./config.properties";

	// read data from config.properties file

	public static String getProperties(String skey) {
		String value = "";
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream(configPath);
			properties.load(fis);
			value = properties.getProperty(skey);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

}
