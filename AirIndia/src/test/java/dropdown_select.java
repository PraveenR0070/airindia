import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown_select {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=product/product&language=en-gb&product_id=42");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("https://demo.opencart.com")).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.cssSelector("select#input-option-217"));
		Select sc = new Select(element);
		List<WebElement> all = sc.getOptions();
		for(WebElement i :all) {
			String s = i.getText();
			if(i.getText().equals("Red(+$6.80)")) {
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

