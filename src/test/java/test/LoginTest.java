package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import page.AssertionPage;
import page.Loginpage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void userAbeltologin() {
		//we call using object
		//BrowserFactory log = new BrowserFactory();
		//log.init();
		//we can call also using calss name by making those methods static
		driver = BrowserFactory.init();
		//Loginpage  logpage = new Loginpage();
		//this object reachout the driver but the previous can't
		Loginpage logpage1 = PageFactory.initElements(driver, Loginpage.class);
		logpage1.insertUSER_NAME("demo@techfios.com");
		logpage1.insertPASSWORD("abc123");
		logpage1.clikLOGIN();
		//to call the assertion method
		AssertionPage validate = PageFactory.initElements(driver, AssertionPage.class);
		validate.verifyDashboard();
		BrowserFactory.teardown();
	}

}
