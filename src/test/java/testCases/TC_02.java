package testCases;

import org.testng.annotations.Test;

import pageObject.login;
import pageObject.task2;
import testBase.Baseclass1;

public class TC_02 extends Baseclass1 { 
	@Test 
	public void register() throws InterruptedException {
		login L1=new login(driver);
		
		task2 T2 = new task2(driver);
		
		L1.click_register();
		Thread.sleep(2000);
		L1.username();
		Thread.sleep(2000);
		L1.password();
		Thread.sleep(2000);
		L1.submit();
		Thread.sleep(2000);
		T2.payuser();
		Thread.sleep(2000);
		T2.book();
		Thread.sleep(2000);
		T2.Emma();
		Thread.sleep(2000);
		T2.amount();
		Thread.sleep(3000);
		T2.paynow();
		Thread.sleep(2000);
		T2.paynow1();
		Thread.sleep(2000);
		T2.date();
		Thread.sleep(2000);
		T2.des();
		Thread.sleep(3000);
		T2.next();
		Thread.sleep(2000);
		T2.Previous();
		Thread.sleep(3000);
		T2.changeamount();
		Thread.sleep(2000);
		T2.next1();
		Thread.sleep(2000);
		T2.Confirm1();
		Thread.sleep(2000);
		T2.print();

}
}
