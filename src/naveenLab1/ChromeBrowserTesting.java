package naveenLab1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expTitle;
		expTitle = "Navyug | Chughs Navyug Military - India's First Online Military Gear Store";
		// Firefox Browser
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Gecko_v0.23.0\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();*/ 
		
		// Chrome Browser 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		// driver.get("http://www.navyug.com"); 
		
		/*String actTitle = driver.getTitle(); 
		System.out.println("Page Title ###### "+actTitle); 
			
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title is same.. ");
		}
		else {
				System.out.println("Title is wrong.. ");
		}*/ 
			
		driver.get("https://demoqa.com/automation-practice-form");
		
		// -- For selecting Dropdown
		
		/*Select s = new Select(driver.findElement(By.xpath("//select[@name='_sacat']")));
		s.selectByVisibleText("Crafts");
		s.deselectByVisibleText("Crafts");
		s.selectByValue("2984");*/
		
		// -- For selecting Radio Button 
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		
		WebElement ele1 = driver.findElement(By.id("hobbies-checkbox-1"));
		WebElement ele2 = driver.findElement(By.id("hobbies-checkbox-2"));
		WebElement ele3 = driver.findElement(By.id("hobbies-checkbox-3"));
		
		jse.executeScript("arguments[0].click()", ele1); 
		jse.executeScript("arguments[0].click()", ele2); 
		jse.executeScript("arguments[0].click()", ele3); 
		
		Thread.sleep(3000);
		driver.close();

	}
}
