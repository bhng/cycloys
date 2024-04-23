package testCases;

import org.testng.annotations.Test;

import pageObject.login;
import pageObject.task4;
import testBase.Baseclass1;

public class TC_04  extends Baseclass1 {
	@Test 
	public void register() throws InterruptedException {
		login L1=new login(driver);
		
		task4 T4 = new task4(driver);
		L1.click_register();
		L1.username();
		L1.password();
		L1.submit();
		Thread.sleep(2000);
		T4.payuser();
		Thread.sleep(2000);
		T4.book();
		Thread.sleep(2000);
		T4.Emma();
		Thread.sleep(2000);
		T4.amount();
		Thread.sleep(2000);
		T4.paynow();
		Thread.sleep(2000);
		T4.Recurring();
		Thread.sleep(2000);
		T4.futuredate();
		Thread.sleep(2000);
		T4.date();
		Thread.sleep(2000);
		T4.Fixednumberofoccurrences();
		Thread.sleep(2000);
		T4.Numberofoccurences();
		Thread.sleep(2000);
		T4.months();
		Thread.sleep(2000);
		T4.weeks();
		Thread.sleep(2000);
		T4.des();
		Thread.sleep(2000);
		T4.next();
		T4.Confirm();
}
}
