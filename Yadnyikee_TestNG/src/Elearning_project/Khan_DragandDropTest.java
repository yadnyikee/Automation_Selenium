package Elearning_project;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Khan_DragandDropTest {
	WebDriver driver;
	@Test
	
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Desktop\\Installation\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 
    driver.get("https://www.khanacademy.org/math/in-in-class-1st-math-cbse/xdedfdde82b722757:numbers-from-1-to-9/xdedfdde82b722757:counting/e/counting-out-1-20-objects");
	}
	
	@Test
	public void test() throws InterruptedException {
    Actions act = new Actions(driver);
    WebElement source= driver.findElement(By.xpath("//img[@src=\"https://cdn.kastatic.org/ka-perseus-graphie/b668589746b8c800c85843a2a994efff8d429786.png\"]"));
    WebElement dest = driver.findElement(By.xpath("//div[@class=\"card drag-hint\"]"));
    
   // int numberOfDrops = 5;
    
    // Number of times you want to drop the element
    //for (int i = 0; i < numberOfDrops; i++) {
    act.dragAndDrop(source, dest).build().perform();
	Thread.sleep(2000);

//    act.dragAndDrop(source, dest).build().perform();
//	Thread.sleep(2000);
//
//    
//    act.dragAndDrop(source, dest).build().perform();
//	Thread.sleep(2000);
//
//        act.dragAndDrop(source, dest).build().perform();
//        Thread.sleep(5000); // Add a small delay between drops (adjust as needed
       //act.dragAndDrop(source, dest).build().perform();
        
	Thread.sleep(2000);
    	 
	

	}
}