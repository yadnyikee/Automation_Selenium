package Elearning_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BYJS_Test_POM {
	WebDriver driver;

	public  BYJS_Test_POM(WebDriver driver) { // this driver is used to access the webelement
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"primary-login-btn\"]")
	public WebElement LoginButton;
	
//
//	@FindBy(xpath = "//input[@placeholder=\"Enter your mobile number\"]")
//	public WebElement PhoneNo;
	
	
	
	public void Goto() {
		driver.get("https://byjus.com/btc/");
	}
	public void LoginButton() {
		LoginButton.click();
	}
	
}
