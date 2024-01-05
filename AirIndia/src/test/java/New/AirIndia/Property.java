package New.AirIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property {
	WebDriver driver;
	@BeforeTest
	public void property() {
	
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

	}
	@Test
	public void loginpage () throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("airindia.com");	
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.cssSelector("input.gNO89b"));
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a/h3[1]")).click();
	}
	@AfterTest
	public void TearDown() {
		driver.close();
		
	}

}


