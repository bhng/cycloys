package testCases;

import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import pageObject.Registrationconfirmation;
import testBase.BaseClass;

public class Tc_001_NewRegistration extends BaseClass {
	@Test
	public void registrationAccout() throws InterruptedException {
		HomePage hp=new HomePage(driver);
		RegistrationPage rp=new RegistrationPage(driver);
		Registrationconfirmation rc=new Registrationconfirmation(driver);
		hp.click_register();
		Thread.sleep(3000);
		rp.setname();
		rp.setloginName();
		rp.setEmail();
		rp.setwebsite();
		rp.setGender();
		rp.withoutselectFromDropdown();
		rp.setMobilephone();
		rp.setLandlinephone();
		rp.clickNext();
		Thread.sleep(3000);
		rc.psd();
		rc.cpsw();
		rc.cb();
		rc.capcha();
		rc.submit();
	}
}
