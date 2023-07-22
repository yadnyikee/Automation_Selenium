package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class TC_NewRegistrationTestCases {
	public WebDriver driver;
	@BeforeMethod
	public void intialization() {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		
	    driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
	}
	@Test
public void Registration() {
		
		
		TC_NewRegistration TCN = new TC_NewRegistration(driver);
		
		TCN.Register();
		TCN.SelectGender();
		TCN.SetFirstname("Suraj");
		TCN.SetLastname("Both");
		
		String Name= RandomString.make(5); //Generates a random string to use in the email field for uniqueness
		TCN.SetEmail(Name+"sb@gmail.com"); //to generate a random email address to avoid duplicate entries during registration.
		TCN.SetPassword("123ABC");
		TCN.SetConfirmPassword("123ABC");
		TCN.ClickRegisterButton();
	
		
		
		
		
	}

}
