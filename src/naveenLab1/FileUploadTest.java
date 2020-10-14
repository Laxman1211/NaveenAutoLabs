/**
 * 
 */
package naveenLab1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Laxman_Perumandla
 *
 */
public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException { 
		// TODO Auto-generated method stub 

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://html.com/input-type-file/"); 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(8000); 

		driver.findElement(By.linkText("Don't Allow")).click();
		
		/*Alert a = driver.switchTo().alert();
		
		a.dismiss();*/
		
		driver.findElement(By.name("fileupload")).sendKeys("//Documents//UIP MBI3 fulfillment.docx");
		
				
		// Frame handling 
		driver.switchTo().frame("Frame_id or index"); 
		Thread.sleep(3000); 
		driver.findElement(By.xpath("xxxxx")).click(); 
		
	} 
} 
