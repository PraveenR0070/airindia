package jqurydropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Third {
	WebDriver driver;
@Test
public void New() throws InterruptedException {
	
	
	 ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
   driver = new ChromeDriver(chromeOptions);
	
	
   driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
   driver.manage().window().maximize();
   
   driver.findElement(By.cssSelector("input#justAnInputBox")).click();
  // testforselectdrop(driver,"choice 1");
   //Thread.sleep(2000);
   testforselectdrop(driver,"choice 3");
}
   
   public void testforselectdrop(WebDriver driver,String...Value) {

	List <WebElement> list=  driver.findElements(By.cssSelector(".ComboTreeItemChlid"));
	if(!Value[0].equalsIgnoreCase("all")) {
	 for (WebElement li:list) {
		String txt= li.getText();
		System.out.println(txt);
		
		for(String val:Value) {
			if(txt.equals(val)){
			li.click();
			break;
			}
		}
	 }	
}else {
	for(WebElement lst:list ) {
		lst.click();
	}
}
	
	

   }

}
