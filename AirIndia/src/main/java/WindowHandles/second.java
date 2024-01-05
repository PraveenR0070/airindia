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

public class second {
	@Test
public void window() throws InterruptedException {
	WebDriver driver;
	 ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    driver = new ChromeDriver(chromeOptions);
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
    Set<String>windowhandles=driver.getWindowHandles();
   /* Iterator<String>it =windowhandles.iterator();
    String parent=it.next();
    String child = it.next();
    System.out.println(parent +" "+child);
    driver.switchTo().window(parent);*/
    
    List<String>WindowIDs= new ArrayList(windowhandles);
    
    for(String i:WindowIDs) {
    	System.out.println(i);
    	String title  = driver.switchTo().window(i).getTitle();
    	System.out.println(title);
    	
    	
    }
    
    
    
    
    
    

}
}
