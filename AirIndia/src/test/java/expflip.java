import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class expflip {
	
	WebDriver driver;
	@Test
	public void property() throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("https://demo.opencart.com")).click();
		Thread.sleep(3000);
		List<WebElement> e = driver.findElements(By.cssSelector(".product-thumb"));
		Thread.sleep(3000);
		WebElement prod = e.stream().filter(p->p.findElement(By.xpath("//div/h4/a"))
	    .getText().equals("Canon EOS 5D")).findFirst().orElse(null);
		//prod.click();
       prod.findElement(By.xpath("(//button[@aria-label='Add to Cart])[2]")).click();
		
		

		

}
}
