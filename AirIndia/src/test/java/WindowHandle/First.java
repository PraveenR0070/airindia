package WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

//import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {
	WebDriver driver;
	@Test
	public void test1() {
		
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//String WindowId = driver.getWindowHandle();
		//System.out.println(WindowId);
		//56977B0168B7295BDE8AC5A27CCC2E0D
		//46BBA6A0AF7571563A1C971EF66BA096
		driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
		 Set<String> Windows= driver.getWindowHandles();
		 /*Iterator<String> it = Windows.iterator();
		 String parentWindowID=it.next();
		 String ChildWindowID=it.next();
		 System.out.println("parentWindowId"+" " + parentWindowID);
		 System.out.println("ChildWindowId"  +" "+  ChildWindowID);
		 
		 driver.switchTo().window(parentWindowID);
		 System.out.println("parent Window title :"+driver.getTitle());
		 driver.switchTo().window(ChildWindowID);
		 System.out.println("child Window title :"+driver.getTitle());*/
		 
		List <String> WindowIdsList = new ArrayList(Windows);
		
		for (String i:WindowIdsList) {
			System.out.println(i);
			
		}
		

}
}
