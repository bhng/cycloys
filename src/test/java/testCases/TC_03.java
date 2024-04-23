package testCases;

import org.testng.annotations.Test;
import pageObject.login;
import pageObject.task3;
import testBase.Baseclass1;

public class TC_03 extends Baseclass1 {
	@Test 
	public void register() throws InterruptedException {
		login L1=new login(driver);
		
		task3 T3 = new task3(driver);
		
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T3.payuser();
		T3.book();
		T3.Emma();
		T3.amount();
		Thread.sleep(3000);
		T3.paynow();
		T3.paynow1();
		Thread.sleep(3000);
		T3.instalements();
		T3.des();
		T3.next();
		T3.Confirm();
		
	}
}

