package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbuscalendar {

	WebDriver driver;
	@Test
	public void redbuscalendar() throws InterruptedException {
//not workouted

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ixigo.com/trains");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String st = "Ahmedabad Jn (ADI)";
		driver.findElement(By.xpath("(//input[@class='c-input u-v-align-middle'])[2]")).click();
		//String st = "Ahmedabad Jn (ADI)";
		WebElement dw=driver.findElement(By.xpath("//div[@class='result-row train-station u-box-result']"));
		Select s = new Select(dw);
		List<WebElement>list = s.getOptions();
		
		for(WebElement i:list) {
			String sts = i.getText();
			System.out.println(i.getText());
			if(i.getText().equals(sts)) {
				//i.click();
			}
		}
	
		
		
		

		/*String year = "2023";
		String month = "December";
		String day = "25";


		/*driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();

		while(true) {
			String datepik =	driver.findElement(By.xpath("(//div[@class='rd-month-label'])[2]")).getText();
			System.out.println(datepik);
			String arry[]= datepik.split(" ");
			String mon = arry[0];
			String yr = arry[1];

			if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
				break;
			}else{
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@type='button'])[2]")).click(); {
				}
				List<WebElement> d = driver.findElements(By.xpath("//td[@class='rd-day-body']"));
				for (WebElement i:d) {

					if(i.getText().equals(day)) {
						
						i.click();
					}*/
				
		

	}


}
