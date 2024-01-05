package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {

	@Test(groups= {"smoke"})
	public void animaldog() {
		System.out.println("mobile loan");
	}
	@BeforeTest
	public void animalpig() {
		System.out.println("pig");
	}
	@Test(groups= {"smoke"})
	public void animalcat() {
		System.out.println("ato loan");
	}
	@AfterTest
	public void animalgote() {
		System.out.println("gote");
	}

}
