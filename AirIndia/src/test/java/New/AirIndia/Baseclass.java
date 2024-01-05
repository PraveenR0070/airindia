package New.AirIndia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	WebDriver driver;
	public void brsetup(String br) {
		
		if(br.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		}else if (br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
	}
	}

}
