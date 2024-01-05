package OrangeHRMPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {

	WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	WebElement adminbtn;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement uname;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement drop;

	@FindBy(css="input[placeholder*='Type for hints...']")
	WebElement input;
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement status;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

	public void Adminbtn() {
		adminbtn.click();
	}
	public void userN(String s) {
		uname.sendKeys(s);
	}
	public void dropdown() {

		Select sc = new Select(drop);
		sc.selectByVisibleText("Admin");

	}
	public void ginput(String ip) {
		input.sendKeys(ip);
	}
	public void statusdropdown(String st) {

		Select sc = new Select(status);
		sc.selectByVisibleText(st);

	}
	public void submi() {
		submit.click();
	}

}
