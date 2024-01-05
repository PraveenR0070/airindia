package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	WebDriver driver;

	public WebDriver intilize(String br) throws FileNotFoundException {
		
		
		File path = new File ("./Org.Properties/File.properties");
		try {
		FileInputStream fis= new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		}catch(Exception exp) {
			exp.getMessage();
			
		}
		
		
		
		
		if(br.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
			
		}
		if(br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		return driver;
	}

	public void Teardown() {
		driver.close();
	}
	
	
}
