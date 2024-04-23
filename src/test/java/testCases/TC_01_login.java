package testCases;

import org.testng.annotations.Test;
import pageObject.login;
import pageObject.task1;
import testBase.Baseclass1;

public class TC_01_login extends Baseclass1 {
@Test
	
public void register() throws InterruptedException {
		login L1=new login(driver);
		
		task1 T1 = new task1(driver);
	
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		 T1.payuser();
		 T1.book();
		 T1.Emma();
		 T1.amount();
		 Thread.sleep(2000);
		 T1.paynow();
		 T1.des();
		 T1.next();
		 T1.Confirm();
		 T1.print();
	}
}
