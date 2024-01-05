package WebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practiceTable {
	
	WebDriver driver;
	@Test
	public void dropdown() {
		
		
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			String dropvalues=driver.findElement(By.cssSelector("table.tsc_table_s13")).getText();
			System.out.println("values"+dropvalues);
			
			driver.close();
	}

}
