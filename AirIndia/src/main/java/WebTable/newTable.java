package WebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newTable {

	
	WebDriver driver;
	@Test
	public void gettable() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	String s=driver.findElement(By.cssSelector(".tsc_table_s13")).getText();
    	//System.out.println(s);
        int row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td")).size();
		System.out.println(row);
	
		int col = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")).size();
		System.out.println(col);
		
		/*PSystem.out.println("data from the table");
		for(int r=1;r<=row;r++) {
			for(int c=1;c<=col;c++) {
			
				String data = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(data +"   ");
			}
				
			}*/
		for(int r=1;r<=row;r++) {
			String country = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[1]")).getText();
			if(country.equals("Saudi Arabia")) {
				String city = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[2]")).getText();
				String Hight = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[4]")).getText();
				System.out.println(country+" "+city+"  "+Hight);
				break;
			}
		}
		
		
		}
	
		
		//.tsc_table_s13
		//table[@class='tsc_table_s13']/tbody/tr[1]/td[3]
		
}
		
	
	

