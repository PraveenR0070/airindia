package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class first {
	@Test
	public void iframe() {

		WebDriver driver;
		 ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
	    driver.get("https://nxtgenaiacademy.com/iframe/");
	    driver.manage().window().maximize();
	   // driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	    
	    //driver.switchTo().frame("Nested iFrames");
	  WebElement outerframe =  driver.findElement(By.xpath("//iframe[@name='popuppage']"));
	   // driver.switchTo().defaultContent();
	  driver.switchTo().frame(outerframe);
	  
	  //alertbox
	  driver.findElement(By.name("alertbox")).click();	   
	  
	  driver.switchTo().alert().accept();
	  //driver.switchTo().alert().dismiss();//for cancel
	   /* WebElement inner=driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]"));
	    driver.switchTo().frame(inner);
	    //driver.switchTo().defaultContent();
	    
	    driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("new");*/
	    
	}
	

}
