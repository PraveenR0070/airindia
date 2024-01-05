import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flifkart_names {
	WebDriver driver;
	@Test
	public void capturenames() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/tvs-and-appliances-new-clp-store?fm=neo%2Fmerchandising&iid=M_2c852dee-8261-4219-8bd3-287f4ae63397_1_372UD5BXDFYS_MC.LO4IWVHA61BX&otracker=hp_rich_navigation_6_1.navigationCard.RICH_NAVIGATION_Appliances_LO4IWVHA61BX&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_6_L0_view-all&cid=LO4IWVHA61BX");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<WebElement> s =driver.findElements(By.xpath("(//div[@class='_2Brcj4'])[4]"));
	
	//System.out.println(s);
	for(WebElement w:s) {
		System.out.println(w.getText());
		//String st=w.getText();
		if(w.getText().equals("Twitter")) {
			w.click();
		}
	}

	}
}
