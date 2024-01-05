package WindowHandles;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {
	@Test
	public void newwwone() throws InterruptedException {
		WebDriver driver ;

		//		 ChromeOptions chromeOptions = new ChromeOptions();
		//			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//		    driver = new ChromeDriver(chromeOptions);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//System.out.println(	driver.getWindowHandle());
		driver.findElement(By.xpath("(//a[@target='_blank'])[5]")).click();
		Set<String> list=driver.getWindowHandles();
		Iterator<String> it =list.iterator();
	    String st1=it.next();
	    String st2=it.next();
	    System.out.println(st1+" "+st2);
	    driver.switchTo().window(st1);

	}


}
