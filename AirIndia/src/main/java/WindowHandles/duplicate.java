package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class duplicate {
	
	@Test
	public void window() throws InterruptedException {
	
		WebDriver driver;
		 ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	  // System.out.println(driver.getWindowHandle());
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
	  Set <String>windowids= driver.getWindowHandles();
	 Iterator<String>it = windowids.iterator();
	 String parentID=it.next();
	 String childID=it.next();
	 System.out.println(parentID+" "+childID);
	 driver.switchTo().window(parentID);
	   
	   

}
}
