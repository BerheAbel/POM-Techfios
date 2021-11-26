package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AssertionPage {
	WebDriver driver;
	public AssertionPage(WebDriver driver) {
//to create a relation b/n global WebDriver driver we need to use key word this
		this.driver = driver;
	}

	// for POM we don't use those storing variables we use @FindBy
	
	//WebElement USER_NAME = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USER_NAME1 = By.xpath("//*[@id=\"username\"]");
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_ELEMENT;

	public void verifyDashboard() {
		Assert.assertEquals(DASHBOARD_ELEMENT.getText(), "Dashboard", "Wrong page!!!");
	}
}
