package Practic;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest5 {
	
	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupllier.class)
	public void TestLogin(String username, String password) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadnyikee suresh kam\\Desktop\\ChromeDiver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		 JavascriptExecutor js= (JavascriptExecutor) driver;
//		 WebElement Uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
//		 js.executeScript("arguments[0].value='"+"userName"+"';",Uname);
//		 WebElement Pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
//	     js.executeScript("arguments[0].value='"+"password"+"';",Pass);
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
	    
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	    
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
		Thread.sleep(5000);
		//driver.quit();
	}

}
