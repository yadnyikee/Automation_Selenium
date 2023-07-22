package Elearning_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Book_Base_POM {
	@Test
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    Book_POM BP= new Book_POM(driver);
    
    String path = "C:\\Users\\A\\eclipse-workspace\\Pallavi_TestNG\\Data\\Book_Session.xlsx";
    FileInputStream file = new FileInputStream(path);
    
    Sheet Data = WorkbookFactory.create(file).getSheet("Sheet1");
    BP.Goto();
 
    BP.Login1();
    
    
    //name
    String Name = Data.getRow(1).getCell(0).getStringCellValue();
    BP.Name1(Name);

    //phone number
    double PhoneNo = Data.getRow(1).getCell(1).getNumericCellValue();
    long phoneNoLong = (long) PhoneNo; // convert to long if needed
    BP.Phone(String.valueOf(phoneNoLong));
    
    driver.findElement(By.xpath("//button[contains(text(),'×')]")).click(); 
    Thread.sleep(10000);

    
    //click otp
    BP.OTP_Click();
    Thread.sleep(20000);
    
    //city
    BP.CityClick();
//  WebElement city = driver.findElement(By.id("formCity"));
//	city.click();
//	Select select = new Select(city);
//	select.selectByValue("Ambala");
	Thread.sleep(3000);

	//center
	BP.CenterClick();
//	WebElement center = driver.findElement(By.id("formCenter"));
//	center.click();
//	Select select1 = new Select(center);
//	select1.selectByValue("344");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id=\"class-five\"]")).click();

	driver.findElement(By.xpath("//button[@class=\"btn modal-form-submit-btn\"]")).click();
    
}}

