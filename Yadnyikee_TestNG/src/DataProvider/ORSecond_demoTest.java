package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ORSecond_demoTest {

	WebDriver driver;

	@Test(dataProvider = "Logindata", dataProviderClass = ORSecond_demoData.class)

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
	}
}
