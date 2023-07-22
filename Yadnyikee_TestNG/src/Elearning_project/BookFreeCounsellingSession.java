package Elearning_project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookFreeCounsellingSession {
	WebDriver driver;

	@BeforeMethod
	public void Setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://byjus.com/btc/");
//		Thread.sleep(20000);
//		driver.findElement(By.xpath("//button[@type=\"button\"])[1]")).click();

}
	@Test
	public void loginbutton() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[contains(text(),\"Book A Free Counselling Session\")]")).click();
		
		driver.findElement(By.id("name-input")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("8855947443");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),\"Send OTP\")]")).click();
		Thread.sleep(10000);
		
		WebElement city = driver.findElement(By.xpath("//select[@name=\"cityname\"]"));
		Select S1= new Select(city);
		S1.selectByVisibleText("Delhi");
		
		WebElement center = driver.findElement(By.xpath("//select[@name=\"centername\"\"]"));
		Select S2= new Select(center);
		S2.selectByVisibleText("Delhi-Dabri Road");
		
		
		driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();
	    Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	    Thread.sleep(2000);

		
		
		
		
		

		 
		 
	}
}