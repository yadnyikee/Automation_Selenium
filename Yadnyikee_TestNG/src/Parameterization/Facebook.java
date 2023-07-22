package Parameterization;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Facebook {
	
	WebDriver driver;
	@BeforeClass
	public void SetUp() {
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("WebDriver,Chrome,driver", "C:\\Users\\yadnyikee suresh kam\\Desktop\\installer\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Parameters("URL")
	@Test
	public void OpenURL(String URL) {
	 driver.get(URL);	
	}
	
	@Parameters({"email","password"})
	@Test
	public void loginPage(String email, String password) {
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
	}
	}
