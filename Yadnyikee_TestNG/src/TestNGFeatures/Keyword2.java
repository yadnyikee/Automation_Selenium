package TestNGFeatures;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword2 {
//	WebDriver driver;
//	@BeforeMethod
//	public void SetUp() {
//		WebDriverManager.chromedriver().setup();
//		//System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
//	 driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
//	}
//	
//	@Test(priority=1)
//	public void B() {
//	driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]")).sendKeys("Admin");
//	System.out.println("entd valuse sucessfully");
//	}
//	
//	@Test(priority=2)
//	public void demo2() {
//		System.out.println("tset2 execution");
//	}
//	@Test(priority=-1)
//	public void C(){
//		boolean logo= driver.findElement(By.xpath("//img[@src=\"/web/images/ohrm_branding.png?v=1683010990518\"]")).isDisplayed();
//		
//	   System.out.println(logo);
//	   System.out.println("B execution");
//	}
//	
//	@Test
//	public void A() {
//		String Title= driver.getTitle();
//		System.out.println(Title);
//		System.out.println("A Method");
//	}
//	@Test(priority=3)
//	public void Z() {
//		String URL= driver.getCurrentUrl();
//		System.out.println(URL);
//		System.out.println("Z Method");
//	}
//	@Test(priority=-2)
//	public void H() {
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
//		System.out.println("H Method");
//	}
//	
//	@AfterMethod
//	public void ZEnd() {
//		System.out.println("End Method");// we write this statement in aftermethod thts why this will print in evry methgod
//		//driver.quit();
//	}

}
