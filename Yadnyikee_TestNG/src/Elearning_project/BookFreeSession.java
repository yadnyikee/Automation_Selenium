package Elearning_project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFreeSession {
	WebDriver driver;

	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(3000);
	}

	@Test
	public void Info() throws InterruptedException {
		JavascriptExecutor JS = (JavascriptExecutor) driver;

		WebElement Element = driver.findElement(By.xpath("//h2[contains(text(), \"Watch video lessons\")]"));
		JS.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(5000);

		// select class
		WebElement ClassDropdown = driver.findElement(By.xpath("//select[@class=\"form-control video-selection\"]"));
		Select S1 = new Select(ClassDropdown);
		S1.selectByVisibleText("Class 10");

		driver.findElement(By.cssSelector("div[class='row row-inline'] div:nth-child(1) a:nth-child(1)")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type=\"button\"])[14]")).click();
		Thread.sleep(5000);

		// Actions act = new Actions(driver);
		// act.contextClick(ClickVideo).build().perform();

	}

	@AfterMethod
	public void quitemethod() {

		driver.quit();

	}
}