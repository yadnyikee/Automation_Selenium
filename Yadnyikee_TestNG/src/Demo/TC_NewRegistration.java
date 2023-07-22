package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_NewRegistration {
	
	private WebDriver driver;


	public TC_NewRegistration (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	@FindBy(xpath="//a[@href=\"/register?returnUrl=%2F\"]")
	public WebElement Login;
	
	@FindBy(id="gender-female")
	public WebElement GenderFemale;
	
	@FindBy(id="FirstName")
	public WebElement Firstname;
	
	@FindBy(id="LastName")
	public WebElement Lastname;
	
	@FindBy(xpath="//input[@type=\"email\"]")
	public WebElement Email;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	public WebElement ConfirmPassword;
	
	@FindBy(xpath="//button[@id=\"register-button\"]")
	public WebElement RegisterButton;


	public void Register() {
		Login.click();
	}

	public void SelectGender() {
		GenderFemale.click();
	}

	public void SetFirstname(String FName) {
		Firstname.sendKeys(FName);
	}

	public void SetLastname(String LName) {
		Lastname.sendKeys(LName);
	}

	public void SetEmail(String EmailID) {
		Email.sendKeys(EmailID);
	}

	public void SetPassword(String PassWord) {
		Password.sendKeys(PassWord);
	}

	public void SetConfirmPassword(String ConfirmPassWord) {
		ConfirmPassword.sendKeys(ConfirmPassWord);
	}

	public void ClickRegisterButton() {
		RegisterButton.click();
	}
}
