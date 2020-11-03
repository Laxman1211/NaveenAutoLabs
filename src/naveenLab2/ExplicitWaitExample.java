package naveenLab2; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.spicejet.com/default.aspx"); 
		
		WebElement locator = driver.findElement(By.xpath("//*[@id=\"home_banner\"]/div[3]/div[1]/div[3]/a/img")); 
		
		WebDriverWait wait = new WebDriverWait(driver, 20); 

		wait.until(ExpectedConditions.elementToBeClickable(locator)); 
		
		locator.click();
		
		driver.close();
	}
}
