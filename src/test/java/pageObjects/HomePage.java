package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver); // invokes parent class constructor
		
	}
	
	
	// Elements
	@FindBy(xpath="//span[text()='My Account']")WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")WebElement lnkRegister;
	
	@FindBy(linkText="Login")WebElement linkLogin;	//Login link added in step 6.
	
	
	// Action Methods
	public void clickMyAccount() {
		lnkMyaccount.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		linkLogin.click();
	}
}
