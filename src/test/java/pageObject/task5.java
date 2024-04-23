package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class task5 extends BasePage {

	public task5(WebDriver Driver) {
		super(Driver);
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//div[text()='Receive QR-code']")
	WebElement qrcode;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate QR code']")
	WebElement GQRcode;
	
	@FindBy(xpath="//button[@type='button']//span[text()='Generate new QR code']")
	WebElement GNQRcode;
	
	public void payuser() {
		payuser.click();
	}
	public void qrcode() {
		qrcode.click();
	}
	public void amount() {
		amount.sendKeys("1,00");
	}
	public void gqrcode() {
		GQRcode.click();
	}
	public void GNQRcode() {
		GNQRcode.click();
	}
}
