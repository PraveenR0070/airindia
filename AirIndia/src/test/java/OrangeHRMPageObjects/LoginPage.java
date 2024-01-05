package OrangeHRMPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	


	@FindBy (name="username")
	WebElement uname;
	
	@FindBy (name="password")
	WebElement pass;
	
	@FindBy (css="button.oxd-button")
	WebElement LoginBtn;
	
	public AdminPage Login(String unamee,String passs) {
		
		uname.sendKeys(unamee);
		pass.sendKeys(passs);
		LoginBtn.click();
		
		AdminPage ap=new AdminPage(driver);
		return ap;
		
	}
	
	
	
	

}
