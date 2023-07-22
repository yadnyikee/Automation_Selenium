package Elearning_project;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookClass {
	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
	}

	@Test
	public void LoginTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Pallavi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("8855947443");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Send OTP\"]")).click();
		Thread.sleep(20000);
		WebElement States = driver.findElement(By.xpath("//select[@name=\"state\"]"));

		Select SC = new Select(States);
		SC.selectByValue("Maharashtra");
		Thread.sleep(2000);

		WebElement grade = driver.findElement(By.xpath("//select[@name=\"grade\"]"));
		Select SC2 = new Select(grade);
		SC2.selectByVisibleText("Class 5");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"ftcOfflineScheduleClass\"]")).click();
		Thread.sleep(5000);

		WebElement city = driver.findElement(By.xpath("//select[@name=\"city-offline\"]"));
		Select SC3 = new Select(city);
		SC3.selectByVisibleText("Pune");
		Thread.sleep(3000);

		WebElement Center = driver.findElement(By.xpath("//select[@name=\"center-offline\"]"));
		Select SC4 = new Select(Center);
		SC4.selectByVisibleText("Pune-Baner");
		Thread.sleep(10000);

//			
		WebElement Dateselect = driver.findElement(By.xpath("//select[@name=\"slot-offline\"]"));
		Select SCC = new Select(Dateselect);
		SCC.selectByVisibleText("12 PM - 2 PM");

//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			WebElement datePickerWidget = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select Date']")));

//			WebElement desiredDate = datePickerWidget.findElement(By.xpath("//input[@placeholder='Select Date']"));
//	        desiredDate.click();

		// driver.findElement(By.cssSelector("//input[placeholder='Select
		// Date']")).click();

		driver.findElement(By.xpath("//button[contains(text(),\"Schedule a Free Offline Class\")]")).click();

		String ActualText = "Your Doubt Session is Booked!";
		String ExpectedText = driver.findElement(By.xpath("//span[contains(text(),\"Your Doubt Session is Booked!\")]"))
				.getText();
		if (ActualText.equals(ExpectedText)) {
			System.out.println("Correct Text");
		} else {
			System.out.println("incorrect Text");
		}

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		// driver.quit();
	}
}
