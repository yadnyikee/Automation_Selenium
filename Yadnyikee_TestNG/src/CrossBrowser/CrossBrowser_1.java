package CrossBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowser_1 {
	
	WebDriver driver;

	@Test
	public void OpenBrowser1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
				
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

	}

	@Test
	public void OpenBrowser2() {
		System.setProperty("webdriver.chrome.driver",
         "C:\\Users\\A\\Desktop\\Installation\\MicrosoftEdge\\edgedriver_win64\\edgedriver.exe");
		driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();

	}
	@Test
	public void OpenBrowser3() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\A\\Desktop\\Installation\\FireFox\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

		driver.findElement(
				By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"))
				.click();

	}

}


