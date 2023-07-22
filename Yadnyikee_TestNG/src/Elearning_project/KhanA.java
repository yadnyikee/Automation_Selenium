package Elearning_project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KhanA {
	WebDriver driver;
	 
	@BeforeTest
	public void OpenBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\\\chromedriver.exe");

		    driver= new ChromeDriver();
		    
		    driver.get("https://www.khanacademy.org/");
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // Thread.sleep(3000);
		  
	}
	

	@Test
	public void clickonLogin() throws InterruptedException {
		 driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();
	
		 driver.findElement(By.xpath("//input[@data-test-id=\"identifier-field\"]")).sendKeys("bothalepallu@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@data-test-id=\"password-field\"]")).sendKeys("Pallavi@2551");
		 
		 driver.findElement(By.xpath("//button[@data-test-id=\"log-in-submit-button\"]")).click();
		 
	
		// driver.findElement(By.xpath("//span[@class=\"empty-field pure-hidden-xs\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"_19lfck2n\"]")).click();
		   Thread.sleep(5000);
	
	
		  //String ActualName=driver.findElement(By.xpath("//*[@id=\"top-header-container\"]/nav/div/div[3]/div[1]/button/span/span")).getText();
	String username=driver.findElement(By.xpath("//input[@id=\"nickname\"]")).getText();
		
	String nickname=driver.findElement(By.xpath("//input[@id=\"username\"]")).getText();
	
		    
		    if(username.equals(nickname)) {
		    	
		    	System.out.println("user is correct");
		    }
		    else {
		    	System.out.println("user not is not correct");
		    }
		
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();    
		    
	
	//to print all the links in course field
	
	
		driver.findElement(By.xpath("//span[@data-test-id=\"learn-menu-button\"]")).click();
		Thread.sleep(5000);
		List<WebElement>alllinks=driver.findElements(By.xpath("//ul[@class=\"_121xeo4\"]//li"));
	    System.out.println(alllinks.size());
	    for(int i=0;i<alllinks.size();i++) 
	    	System.out.println(alllinks.get(i).getText());
	    
	    
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Class 5')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=\"_1lrvdlvw\"]")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//input[@id=\"input-with-examples-bnVtZXJpYy1pbnB1dCAx\"]")).sendKeys("561");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@data-test-id=\"exercise-check-answer\"]")).click();
//		
//		String massage=driver.findElement(By.xpath("class=\"_ly8ffo\"")).getText();
//		System.out.println(massage);
	
		
	}

}