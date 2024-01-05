package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	WebDriver driver;
	@Test
	public void gettable() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id(""))
		String s =driver.findElement(By.xpath("//table[@id='customers']")).getText();////table[@id='customers']/tbody/tr
		//System.out.println(s);
		
		/*String onecolumn =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]")).getText();
		System.out.println(onecolumn);*/
		
		
		String row =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[1]")).getText();
		System.out.println(row);
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		List<WebElement> columns =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for(WebElement i:columns) {
			String op =i.getText();//System.out.println(op +"  ");
			if(i.getText().equals("Google")) {
				String maria =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[2]")).getText();
				String ger =driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).getText();
				
				System.out.println(maria+" "+ ger +" ");
			}
		}
			
		
		
		
		
		
		int rows =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td")).size();
		int column =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		//System.out.println(column);//7
	    
	    //System.out.println(rows);//18
		
		
		
		
	}
}
	


