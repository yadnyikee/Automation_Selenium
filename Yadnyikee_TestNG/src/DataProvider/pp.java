package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pp {
	WebDriver driver;

	@Test(dataProvider = "Logindata")
	public void Logintest(String Uname, String PWD) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement USD = driver.findElement(By.name("username"));
		USD.sendKeys(Uname);
		WebElement Pass = driver.findElement(By.name("password"));
		Pass.sendKeys(PWD);
	}

	@DataProvider(name = "Logindata")
	public Object[][] LoginData() {
		Object data[][] = new Object[5][2];
		// correctUN & password
		data[0][0] = "Admin";
		data[0][1] = "admin123";

		// correctUN &Ip
		data[1][0] = "Admin";
		data[1][1] = "admin1234";

		// incorrectUN & correctPSW

		data[2][0] = "Admini";
		data[2][1] = "admin123";

		// incorrectUN & incorrectPSW
		data[3][0] = "Admini";
		data[3][1] = "admin1234";

		// EMPTYUN &CPWD
		data[4][0] = "Admin";
		data[4][1] = "admin1234";
		return data;
	}
}
