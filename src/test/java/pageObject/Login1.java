package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login1 extends BasePage {

	public Login1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath="//a[@id='login-link']")
	WebElement login;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	public void click_register() {
		login.click();

	}
	public void username() {
		username.sendKeys("demo");
	}
	public void password() {
		password.sendKeys("1234");
	}
	public void submit() {
		submit.click();
	}

}
