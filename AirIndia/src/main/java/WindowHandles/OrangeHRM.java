package WindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OrangeHRM {
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
	    Set<String>windowIDs = driver.getWindowHandles();
	    
	    
	  /*Iterator <String>it= windowIDs.iterator();
	  String parentwindowid = it.next();
	  String childwindowid = it.next();
	  System.out.println("parent:"+parentwindowid+"  "+childwindowid);
	  Thread.sleep(3000);
	  driver.switchTo().window(parentwindowid);
	  Thread.sleep(3000);
	  driver.switchTo().window(childwindowid);*/
	    
	    
	   List< String > windowIDList =  new ArrayList(windowIDs);
	   
	  for(String winid:windowIDList) {
		  System.out.println(winid);
		 String title= driver.switchTo().window(winid).getTitle();
		 if(title.equals("OrangeHRM")) {
			 
			 driver.close();
		 }
		  
	  }
	    
		driver.close();
		
		
		
	}

}
