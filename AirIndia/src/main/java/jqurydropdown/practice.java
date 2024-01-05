package jqurydropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {


	WebDriver driver;
	
	@Test
	public void New() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.cssSelector("#justAnInputBox")).click();
		
		dropdown(driver,"choice 3");
	}
		public static void dropdown(WebDriver driver,String...value) {
			
			List <WebElement>choiceList=driver.findElements(By.cssSelector(".ComboTreeItemChlid"));
			if(!value[0].equals("all")) {
				
				for(WebElement list :choiceList) {
				String dlist=	list.getText();
				for(String val:value) {
					if(dlist.equalsIgnoreCase(val)) {
					list.click();
					break;
				
				}
					
				}
				}
			}
			else {
				for(WebElement v:choiceList) {
					v.click();
				}
			}
			
			
		}
	
	
	
	
	
	
}
