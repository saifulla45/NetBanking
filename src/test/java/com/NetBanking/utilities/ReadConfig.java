package com.NetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties prop;
	
	public ReadConfig(){
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} catch (Exception e) {
			
			System.out.println("Exceptiion is "+e.getMessage());
		}
	}
	
	
	public  String getAppUrl() {
		String url=prop.getProperty("appUrl");
		return url;
	}
	
	public String getUsername() {
		String uname=prop.getProperty("username");
		return uname;
	}
	
	public String getPassword() {
		String pass=prop.getProperty("password");
		return pass;
	}
	
	public String getChromePath() {
		String path=prop.getProperty("chromePath");
		return path;
	}
}
