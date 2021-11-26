package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver) {
//to create a relation b/n global WebDriver driver we need to use key word this
		this.driver = driver;
	}

	// for POM we don't use those storing variables we use @FindBy
	
	//WebElement USER_NAME = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USER_NAME1 = By.xpath("//*[@id=\"username\"]");
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SIGN_IN;
	public void insertUSER_NAME(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}
	public void insertPASSWORD(String password) {
		PASSWORD.sendKeys(password);
	}
	public void clikLOGIN() {
		SIGN_IN.click();
	}
	//OR OTHER TECHNIQUE DECLARE IT IN ONE METHOD
	/*
	 * public void LaunchPage(String username,String password){
	 * USER_NAME_ELEMENT.sendKeys(username); PASSWORD.sendKeys(password);
	 * SIGN_IN.click(); }
	 */
}
