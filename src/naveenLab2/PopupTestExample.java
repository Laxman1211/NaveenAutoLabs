package naveenLab2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTestExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("http://www.popuptest.com/goodpopups.html"); 
		
		driver.findElement(By.linkText("Good PopUp #3")).click(); 
		
		Set<String> handler = driver.getWindowHandles(); 
		
		Iterator<String> it = handler.iterator(); 
		
		String parent =  it.next(); 
		
		//driver.findElement(By.linkText("Good PopUp #1")).click(); 		
		System.out.println("Parent Window Id "+parent); 

		Thread.sleep(4000);
		String childId =  it.next(); 
		
		System.out.println("Child Window Id "+ childId ); 
		
		driver.switchTo().window(childId);
		
		System.out.println("Child Window title id "+driver.getTitle()); 

		driver.close();		
		driver.switchTo().window(parent);
		
		System.out.println("parent window id "+parent); 
		System.out.println("Parent Window title id "+driver.getTitle());
		driver.close(); 
	} 
} 