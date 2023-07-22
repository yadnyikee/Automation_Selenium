package TestNGFeatures;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@BeforeMethod
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void C() {
		String title1= driver.getTitle();
		System.out.println(title1);
		System.out.println("aplle");
		
	}
	@Test
	public void A() {
		String URL1= driver.getCurrentUrl();
		System.out.println(URL1);
		System.out.println("uyhfgfg");
		
	}
	@Test
	public void ABC() {
		boolean logo1=driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
		System.out.println(logo1);
		
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}
