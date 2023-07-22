package TestNGFeatures;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled2_XMLFile {
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass    
	public void  SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	@Test
	public void B() {
		boolean logo= driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
		
		   System.out.println(logo);
	}
	@Test
	public void A() {
		String Title= driver.getTitle();
		System.out.println(Title);
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@Test
	public void Test3() {
		Assert.assertEquals(true, false);
		System.out.println("Test3");
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		System.out.println("End Execution");
		Thread.sleep(4000);
		driver.quit();
	}
	
	
	

}
