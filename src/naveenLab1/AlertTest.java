/**
 * 
 */
package naveenLab1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Laxman_Perumandla
 */
public class AlertTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert(); 
		
		System.out.println(a.getText()); 
		
		a.dismiss();
		
		//close 
		driver.close(); 
	}

}
