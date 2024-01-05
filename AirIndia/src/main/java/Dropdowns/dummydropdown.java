package Dropdowns;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dummydropdown {
	WebDriver driver;

	@Test
	public void newone() {
	 ChromeOptions chromeOptions = new ChromeOptions();
	    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	    driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   WebElement el= driver.findElement(By.xpath("//select"));
	   Select sc = new Select(el);
	   List<WebElement>st=sc.getOptions();
	   for(WebElement i:st) {
		  System.out.println(i.getText());
		   if(i.getText().equalsIgnoreCase("Angola")) {
			   i.click();
		   }	   
	   }
	}
}
