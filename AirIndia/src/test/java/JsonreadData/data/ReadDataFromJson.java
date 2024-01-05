package JsonreadData.data; 

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromJson {
	
	public static void expdata() throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\dell\\eclipse-workspace\\New\\SDET_CAW\\data\\input.json");
		Object obj = jsonparser.parse(reader);
		JSONObject  empjsonobj = (JSONObject)obj;

		JSONArray array = (JSONArray)empjsonobj.get("address");
      for(int i=0;i<array.size();i++) {
      JSONObject addres = (JSONObject) array.get(i);
      
      Object d = array.get(i);
       //System.out.println(array.get();
       System.out.println(d);
       
       

	}
	}
	@Test
	public void Executedata() throws IOException, ParseException {
		//WebDriver driver;
		expdata();
		/*WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#jsondata")).sendKeys(Array.get(i));*/
		
		
		
		
	}
}

