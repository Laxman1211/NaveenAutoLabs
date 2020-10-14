package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MsnTwittert {

	WebDriver driver;
	
	@Test
	public void twitterlink() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.msn.com/");
		driver.manage().window().maximize();		
		// Task
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(2000);
		WebElement we = driver.findElement(By.xpath("//ul[@id='social-plugins']"));
		we.findElement(By.xpath("//li[@id='twcount']//iframe")).click();
	}	
}
