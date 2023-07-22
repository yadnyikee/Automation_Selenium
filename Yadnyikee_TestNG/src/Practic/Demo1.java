package Practic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@aria-label=\"First name\"]")).sendKeys("pal");
    	driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys("both");
    	driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
    	driver.findElement(By.name("reg_passwd__")).sendKeys("123xzv");
    	// Select the Month		
    	
    	Actions act = new Actions(driver);

    			WebElement day =driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));// for date
              act.click(day);
              act.sendKeys("10").perform();
      		act.sendKeys(Keys.ENTER).perform();
      		
//    			Select SC3 = new Select(day);
//    			SC3.selectByVisibleText("April");
//    			Thread.sleep(3000);
}
}