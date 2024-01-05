package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendars {

	WebDriver driver;

	@Test
	public void getcalendars() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/bootstrap-date-picker-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String year="2020";
		String month= "June";
		String date = "16";
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		while(true) {
		String dateMY = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();
		System.out.println(dateMY);
		String arr[] = dateMY.split(" ");
		String mon = arr[0];
		String yr = arr[1];
		
		if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year) ){
			break;
		}else {
			driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
		}
		//(//th[@class='prev'])[1]
		//(//th[@class='next'])[1]
		}
		List<WebElement>dateno =driver.findElements(By.xpath("//tbody/tr/td"));
		
		
		for(WebElement i:dateno){
			if(i.getText().equals(date)) {
				i.click();
			}
			
		}
		
	}
}
