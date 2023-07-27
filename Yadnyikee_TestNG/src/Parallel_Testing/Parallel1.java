package Parallel_Testing;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel1 {
	//WebDriver driver;
	@Test
	public void openBrowser1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadnyikee suresh kam\\Desktop\\ChromeDiver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Test
	public void openBrowser2() {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");

		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}