package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class task3 extends BasePage {
public task3(WebDriver Driver) {
		super(Driver);
	}

    @FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser;
	
	@FindBy(xpath="//input[@placeholder='Type to search']")
	WebElement book;
	
	@FindBy(xpath="//a[@class='select-option autocomplete-option-0']")
	WebElement Emma;
	
	@FindBy(xpath="//input[@id='id_3']")
	WebElement amount;
	
	@FindBy(xpath="(//button [@type='button'])[3]")
	WebElement paynow;
	
	@FindBy(xpath="//a[text()=' Monthly installments ']")
	WebElement paynow1;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement instalement;
	
	@FindBy(xpath="//textarea[@id='id_6']")
	WebElement des;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//*[text()='Confirm']")
	WebElement Confirm;
	
	@FindBy(xpath="//div[text()='Print']")
	WebElement print;
	
	public void payuser() {
		payuser.click();
	}
	public void book() {
		book.sendKeys("an");
	}
	public void Emma() {
		Emma.click();
	}
	public void amount() {
		amount.sendKeys("500,00");
	}
	public void paynow() {
		paynow.click();
	}
	public void paynow1() {
		paynow1.click();
	}
	
	public void instalements() { 
		instalement.sendKeys("5");
	}
	public void des() {
		des.sendKeys("they pay know");
	} 
	public void next() {
		next.click();
	}
	public void Confirm() {
		Confirm.click();
	}
	public void print() {
		print.click();
	}
}