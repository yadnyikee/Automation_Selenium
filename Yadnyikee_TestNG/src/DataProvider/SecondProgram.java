package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondProgram {
	WebDriver driver;

	@Test(dataProvider = "Logindata")

	public void Logintest(String Uname, String Pwd, String Expected) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Username1 = driver.findElement(By.xpath("//input[@name=\"Email\"]"));
		Username1.clear();
		Username1.sendKeys(Uname);

		WebElement Password1 = driver.findElement(By.xpath("//input[@name=\"Password\"]"));
		Password1.clear();
		Password1.sendKeys(Pwd);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		String Actual_Title = driver.getTitle();
		String Exception_Title = "Dashboard / nopCommerce administration";

		if (Expected.equals("Valid")) {

			if (Exception_Title.equals(Actual_Title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);

			} else if (Expected.equals("Invalid")) {
				if (Exception_Title.equals(Actual_Title)) {
					driver.findElement(By.linkText("Logout")).click();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);

				}
			}
			driver.quit();
		}

	}

	@DataProvider(name = "Logindata")
	public Object[][] LoginData() {
		Object LoginD[][] = { { "admin@yourstore.com", "admin", "Valid" },
				{ "admin@yourstore1.com", "admin", "Invalid" }, { "admin@yourstore.com", "admin1", "Invalid" },
				{ "admin@yourstore12.com", "admin1", "Invalid" } };
		return LoginD;

	}

}
