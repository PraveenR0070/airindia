package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	@Test(dataProvider="testdata")
	public void readdada(String uname,String Pass) {
		System.out.println(uname+" "+Pass);
	}
	
	
	
	
	@DataProvider(name="testdata")
	public Object[][] testdata() {
		Object datawriter [][] = new Object [2][2];
		datawriter[0][0]="username@gmail.con";
		datawriter[0][1]="pass";
		datawriter[1][0]="user1@gmail.com";
		datawriter[1][1]="pass1";
		
		return datawriter;
		
	}

}
