/**
 * 
 */
package naveenLab1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Laxman_Perumandla
 *
 */
public class DragAndDropTest {

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
		driver.manage().deleteAllCookies(); 
		
		driver.get("https://jqueryui.com/droppable/"); 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");		

		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']")); 
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']")); 
		
		Thread.sleep(3000); 
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(dest).release().build().perform(); 
		//a[@title='Books']
	} 

} 
