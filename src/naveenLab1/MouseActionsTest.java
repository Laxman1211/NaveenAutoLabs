/**
 * 
 */
package naveenLab1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Laxman_Perumandla
 *
 */
public class MouseActionsTest {

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
		driver.get("https://www.spicejet.com/default.aspx");
		
		WebElement addOns = driver.findElement(By.xpath("//a[@id='highlight-addons']"));
		
		Actions act = new Actions(driver); 

		act.moveToElement(addOns).build().perform(); 
		Thread.sleep(3000); 
		driver.findElement(By.linkText("MyFlexiPlan")).click(); 
		
		//driver.close(); 
		
	}
}