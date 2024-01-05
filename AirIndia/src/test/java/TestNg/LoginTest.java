package TestNg;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import OrangeHRMPageObjects.AdminPage;
import OrangeHRMPageObjects.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;



public class LoginTest  extends Baseclass {
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
		ap.Adminbtn();
		ap.userN("Praveen");
		Thread.sleep(3000);
	    ap.dropdown();
		ap.ginput("Sara.Tencrady");
		ap.statusdropdown("Enabled");
		ap.submi();
		
		
		

}
}
