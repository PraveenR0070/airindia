package New.AirIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
     @FindBy(name="q")
     WebElement uname;
     
     @FindBy(name="btnk")
     WebElement pass;
     
     @FindBy(css="input.gNO89b")
     WebElement Lbutton;
     
     public void loginpageClass(String user) {
    	 uname.sendKeys(user);
    	 pass.click();
    	 
     }

	
	

}
