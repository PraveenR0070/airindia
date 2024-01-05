package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class first {
	
	@Test(groups={"smoke"})
	public void newone() {
		System.out.println("car loan");
	}
	@BeforeTest
	public void newtow() {
		System.out.println("first 2 print");
	}
	@Test(groups= {"smoke"})
	public void newthree() {
		System.out.println("byke loan");
	}
	@AfterTest
	public void newfour() {
		System.out.println("first 4 print");
	}

}
