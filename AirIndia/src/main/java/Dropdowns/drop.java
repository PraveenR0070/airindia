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

public class drop {
	WebDriver driver;
	@Test
	public void location() throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("location")).sendKeys("Hyderabad Telangana india");//._2W-T9
	driver.findElement(By.cssSelector("._2W-T9")).click();
	Thread.sleep(2000);
	//driver.findElement(By.cssSelector("._3iFC5")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//img[@class='sc-dcJsrY kMlaev'])[4]")).click();
	
	List<WebElement>list =driver.findElements(By.xpath("//div[@class='sc-fBdRDi eqHUXD']"));
	
	
	for (WebElement li:list) {
		driver.navigate().refresh();
		if(li.getText().equals("Nrs Nandini")) {
			li.click();
		}
	}

	/*WebElement poori=list.stream().filter(t->t.findElement(By.cssSelector("img"))
			.getText().equals("Nrs Nandini")).findFirst().orElse(null);
	poori.click();*/
	
			
			
			
			//.eqHUXD  .cvGAEC
	//.getText().equals("Al Rabea Al Arabi Cafeteria")).findFirst().orElse(null);
	//food.click();
	
	//findElement(By.cssSelector(".sc-dcJsrY"))
	
	//(//div[@class='row'])[1]   .sc-dcJsrY 
	
	
	
	/*WebElement fl=driver.findElement(By.id("location"));
	Select sc = new Select(fl);
	sc.selectByVisibleText("Hyderabad Telangana india");
		
	
	List<WebElement> obj = sc.getOptions();
	for(WebElement option : obj) {
		
	if (option.getText().equalsIgnoreCase("Hyderabad")){
			option.click();
		}
		
	}*/
	
	
	}
}
