package TestNg;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import OrangeHRMPageObjects.AdminPage;
import OrangeHRMPageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest2  extends Baseclass {
	WebDriver driver;
	@Test
	public void ApplicationTest() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp = new LoginPage(driver);
		AdminPage ap=lp.Login("Admin", "admin123");
		Thread.sleep(3000);
		ap.Adminbtn();
	    //ap.dropdown();
		WebElement WE=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		
		Select sc = new Select(WE);
		sc.deselectByValue("Admin");
		
		
		

}
}
