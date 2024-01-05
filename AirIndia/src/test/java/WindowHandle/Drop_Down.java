package WindowHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down {
	WebDriver driver;
	@Test
	public void test1() {
		
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20");
		driver.manage().window().maximize();
		WebElement e = driver.findElement(By.cssSelector("select.form-select"));
		Select sc = new Select(e);
		//sc.selectByVisibleText("Rating (Highest)");
		//sc.selectByIndex(3);
		List <WebElement>alldropdowns =  sc.getOptions();
		for (WebElement i :alldropdowns) {
			
			System.out.println(i.getText());
			if(i.getText().equals("Rating (Highest)")){
				i.click();
				break;
			}
		}
		

		
		
	}
}
	
	


