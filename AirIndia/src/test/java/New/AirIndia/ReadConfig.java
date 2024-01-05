package New.AirIndia;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class ReadConfig {
	
	Properties pro;
	

public ReadConfig() {
	
	File src = new File("./configarations/config.Properties ");
	
	try {
		FileInputStream fis = new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	}catch(Exception exp) { 
	System.out.println("exception is " + exp.getMessage());
	}	
}
public String getbaseurl(){
	String url = pro.getProperty("BaseURL");
	return url;
}
public String getusername() {
	
	String uname = pro.getProperty("Uname");
	return uname;
}
public String getpassword() {
	
	String pass = pro.getProperty("Pass");
	return pass;
}



}
