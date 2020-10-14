package jUnitTests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsam1 {
	
	WebDriver driver;
	@Before
	public void beforeTest()
	{
		System.out.println("Before Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
	}
	
	@After
	public void afterTest() throws InterruptedException
	{
		System.out.println("After Test");
		Thread.sleep(2000);
		driver.quit();
		System.out.println("browser closed..");
	}
	
	@Test
	public void gitLoginTest()
	{
		System.out.println("Test Method..");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("login_field")).sendKeys("p.laxman1211@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Satyam@123");
		driver.findElement(By.name("commit")).click();
		String text = driver.findElement(By.xpath("//h4[@class='f5 text-bold mb-1']")).getText();
		System.out.println(text);
		//assert
	
	}
	
}
