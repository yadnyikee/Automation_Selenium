package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram2 {
	WebDriver driver;

	@Test(dataProvider = "Logindata")

	public void Logintest(String Uname, String Pwd) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Username1 = driver.findElement(By.xpath("//input[@id='email']"));

		Username1.sendKeys(Uname);

		WebElement Password1 = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Password1.sendKeys(Pwd);

		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();

		String Actual_Title=driver.getTitle();
		String Exception_Title = "Facebook - log in or sign up";
		
	}

	@DataProvider(name = "Logindata")
	public String[][] LoginData() {   // here we put object datatype also 
		String LoginD[][] = { { "abc@gmail.com", "admin" }, { "xyz@gmail.com", "admin" },
				{ "pal@gmail.com", "admin123" } };

		return LoginD;

	}

}
