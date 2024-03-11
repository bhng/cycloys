package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationconfirmation extends BasePage {

	public Registrationconfirmation(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='id_7']")
	WebElement psd;
	
	@FindBy(xpath="//input[@id='id_8']")
	WebElement cpsw;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement cb;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']//div[1]")
	WebElement capcha;
	
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	
	
	public void psd() {
		psd.sendKeys("Maha@2711");
		
	}
	public void cpsw() {
		cpsw.sendKeys("Maha@2711");
		
	}
	public void cb() {
		cb.click();
	}
	
	public void capcha() throws InterruptedException {
		Thread.sleep(5000);	}
	public void submit() {
		submit.click();
	}
}
