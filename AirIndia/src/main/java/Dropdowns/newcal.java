package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class newcal {
	 WebDriver driver;
	@Test
	public void cal() throws InterruptedException {
	    ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.globalsqa.com/demo-site/datepicker/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    Thread.sleep(3000);
	    //driver.findElement(By.cssSelector(".hasDatepicker")).click();
	    String month= "October";
	    String Year = "2023";
	    String day = "18";
	    Thread.sleep(3000);
	    try {
	    driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	    }catch(NoSuchElementException e) {
	    	System.out.println(e.getMessage());
	    }
	    while(true) {
	   String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	   String arr[]  = date.split(" ");
	   String  m= arr[0];
	   String y = arr[1];
	   if(m.equals(month) && y.equalsIgnoreCase(Year)) {
		   break ;
	   }else {
		   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	   }
	   List <WebElement> datep=driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
	   
	   for(WebElement sl:datep) {
		   if(sl.getText().equalsIgnoreCase(day)) {
			   sl.click();
		   }
	   }
	   
	    
	    
	    
	  }
	}
}


