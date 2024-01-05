package New.AirIndia;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	@BeforeTest
	public void test1() {
		System.out.println("first");
		WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		
	}
	
	
	@Test
	public void Test2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("airindia.com");	
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.cssSelector("input.gNO89b"));
		e.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/a/h3[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='signIn']")));
		driver.findElement(By.xpath("//a[@id='signIn']")).click();//signInName
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//input[@name='Email Address']"))));
		Thread.sleep(3000);
		WebElement el = driver.findElement(By.xpath("//input[@name='Email Address']"));
		el.click();
		el.sendKeys("praveenreddy0070@gmail.com");
		driver.findElement(By.cssSelector("*[name='Password']")).sendKeys("Telangana@0070");////button[@type='submit']
		driver.findElement(By.xpath("button[@type='submit']")).click();
	
	}
    @AfterTest
	public void Test3() {
		
	}
	
	
}
