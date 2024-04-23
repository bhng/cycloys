package testCases;

import org.testng.annotations.Test;

import pageObject.login;
import pageObject.task5;
import testBase.Baseclass1;

public class TC_05 extends Baseclass1 {
	@Test 
	public void register() throws InterruptedException {
		login L1=new login(driver);
		task5 T5 = new task5(driver);
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		T5.payuser();  
		Thread.sleep(3000);
		T5.qrcode();
		Thread.sleep(3000);
		T5.amount();
		Thread.sleep(3000);
		T5.gqrcode();
		Thread.sleep(3000);
		T5.GNQRcode();
}
}
