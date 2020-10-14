package naveenLab1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://demoqa.com/automation-practice-form"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		Select sObj = new Select(driver.findElement(By.xpath("//*[@id='state']/div/div[1]/div[1]")));
		sObj.selectByIndex(2);	
		
		//close 
		driver.close(); 

	} 
	
} 
