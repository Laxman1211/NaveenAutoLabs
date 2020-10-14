package naveenLab1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\AllJars\\AllJars\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.spicejet.com/default.aspx");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no.of links are..."+ links.size());
		
		for(int i = 0; i<links.size(); i++)
		{ 
			System.out.println(links.get(i).getAttribute("href"));
		} 
		
		driver.close();
	}

}
