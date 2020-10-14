package naveenLab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RepoExample {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		Properties pr = new Properties(); 
		
		FileInputStream fis = new FileInputStream("C:\\Users\\laxman_perumandla\\eclipse-workspace\\testNGprj\\src\\naveenLab3\\config.properties"); 
		pr.load(fis); 
		System.out.println(pr.getProperty("name")); 
		System.out.println(pr.getProperty("password")); 
		
		String browserName = pr.getProperty("browser"); 
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
			driver = new ChromeDriver(); 	
		}
		else 
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Gecko_v0.23.0\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize(); 		
		String url = pr.getProperty("URL"); 
		driver.get(url); 
		Thread.sleep(4000); 
		
		/*WebElement addOns = driver.findElement(By.xpath("//a[@id='highlight-addons']")); 
		
		Actions act = new Actions(driver); 

		act.moveToElement(addOns).build().perform(); 
		Thread.sleep(3000); 
		driver.findElement(By.linkText("MyFlexiPlan")).click(); 
		*/
		//driver.close(); 
		
	}
}
