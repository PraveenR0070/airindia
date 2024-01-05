package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop2 {
	WebDriver driver;
	@Test
	public void location() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement dr = driver.findElement(By.id("select-demo"));
	Select sc = new Select(dr);
	//sc.selectByIndex(2);
	//sc.selectByValue("Monday");
	
	List<WebElement> list = sc.getOptions();
	
	
	for(WebElement i:list) {
	System.out.println(i.getText());
	String s = i.getText();
	int count=0;
	for(int j=0;j<s.length();j++,count++) {
		if(i.getText().equals(s)){
			i.click();
			break;
		}
		}
	}
	
	
	}
}
