package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class tablecal {



	WebDriver driver;

	@Test
	public void newone() throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();

		String m = "August";
		String y ="2024";
		String d ="24";
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		while(true) {
		String s= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		String arry[]=s.split(" ");
		String year =arry[0];
		String date = arry[1];
		if(year.equalsIgnoreCase(m)&& date.equalsIgnoreCase(y)) {
			//System.out.println(year+" "+date);
			break;
		}else {

			driver.findElement(By.xpath("(//span[@role='button'])[2]")).click();
		}
		//driver.findElement(By.xpath("(//div[@class='DayPicker-Week'])[3]//div[7]")).click();
		//try {
		//List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div/div/p"));
		//}catch(StaleElementReferenceException e) {
			List<WebElement> ele = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div/div/p"));	
		
		for(WebElement i:ele) {
			System.out.println(i.getText());
	          String dta=i.getText();
	         String datee[]=dta.split(" ");
	         if(datee[0].equals(d)) {
	        	 i.click();
	         }
		
		}
		}
		

		//div[@class='DayPicker-Months']/div[1]
		//div[@class='DayPicker-Caption']
		//(//span[@role='button'])[2]
		//(//div[@class='DayPicker-Week'])[4]//div[3]
		//div[@class='DayPicker-Week']
		
		

		}
		
	}



	

