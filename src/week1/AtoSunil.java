package week1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AtoSunil {
	
	WebDriver driver;
	
	@BeforeMethod
	public void before() throws InterruptedException
	{
	// Chrome Browser
	// System.setProperty("webdriver.chrome.driver", "C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\chromedriver_win32_V71\\Chromedriver.exe");
	// driver = new ChromeDriver();
	
	// Firefox Browser		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Gecko_v0.23.0\\geckodriver.exe");
	driver = new FirefoxDriver();
			
	driver.get("https://sunnetqa.anblicks.com/itoa");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	login();
	
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException
	{	
		Thread.sleep(8000);
		driver.close();
	}
	
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("daniel");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("WinterSun2018");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='loginForm_0']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Projects List")).click();
		//driver.findElement(By.linkText("Requests List")).click();
		driver.findElement(By.xpath("//*[@id=\"homeForm\"]/div[1]/li[3]/ul/li[1]/a")).click(); 
		Thread.sleep(5000);
		driver.navigate().to("driver.get(\"https://test.sncsw.com/itoatrunk/outage/view.htmlx?editedOutage.appId=6912");

	}
	
	String subWindowHandler;

	@Test
	public void test2() throws InterruptedException
	{
	System.out.println(" In Test...");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/button/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/div/ul/li[4]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/div/ul/li[4]/a/span")).sendKeys(Keys.RETURN);
	
	}
	
	@Test(enabled = false)
	public void test1()
	{
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/div/ul/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"collapseOne\"]/div/div/div[2]/div/ul/li[3]")).click();
		
		//for(int i = 0; i<=5; i++)
		//*[@id="projectList"]/tbody/tr["+i+"]/td[8]
	}
	
	@Test(enabled = false)
	public void test() throws InterruptedException, AWTException
	{
		// Thread.sleep(3000);
		
		// Click Project link
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/i[@class='fa fa-folder-open-o']")).click();
		// Project list
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[6]/ul/li/a")).click();
		// Export Dropdown
		driver.findElement(By.xpath("//a[@class='snc-mobile-width-100 btn btn-default dropdown-toggle']")).click();	
		// Click on Excel
		driver.findElement(By.xpath("//li/a[contains(text(),'Excel')]")).click();
		
		// Window handling code
		Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
         subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler); // switch to popup window
        System.out.println(driver.getTitle());      // perform operations on popup
        Thread.sleep(3000);        

        Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000);     
        // Click Down button
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);	
        // Click Enter button
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(10000);
 
 
		/*driver.findElement(By.xpath("//div/button[@id='addPersonnel']")).click();
		Thread.sleep(3000);
		//1st field
		driver.findElement(By.xpath("//div[@id='s2id_project.projectAssignee[0].personType']//span[1]")).click();
		//1st field value
		driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")).click();
		//2nd field
		driver.findElement(By.xpath("//div[@id='s2id_project.projectAssignee[0].personName']//span")).click();
		//2nd field value
		driver.findElement(By.xpath("//ul[@id='select2-results-7']/li[1]")).click();
		
		// 
		driver.findElement(By.xpath("")).click();*/
		
		
	}
			
}

/*
{

WebElement select2Product = driver.findElement(By.id("s2id_project.projPerson1"));
		select2Product.click();
		// Thread.sleep(3000);
		 driver.findElement(By.id("s2id_autogen3_search")).sendKeys("Ke");
		// Thread.sleep(3000);
		 driver.findElement(By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable select2-highlighted']")).click();
		 System.out.println("absolute path1");
		//String subContainerClass = "#select2-drop:not([style*='display: none'])";
		//driver.findElement(By.id("s2id_autogen3_search")).sendKeys("Aaron biddle");
		System.out.println("absolute path2");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[6]/ul[1]/li[1]/div[1]")).click();
		// GFObj.Movetoelements(driver, driver.findElement(By.xpath("/html[1]/body[1]/div[6]/ul[1]/li[1]/div[1]")));

		System.out.println("absolute path3");
		//Thread.sleep(5000);
		//driver.findElement(By.id("select2-chosen-3")).click();
		// driver.findElement(By.id("s2id_autogen3_search")).sendKeys("Aaron biddle");
		// Thread.sleep(3000);
		//driver.findElement(By.id("select2-result-label-7045")).click();
		/* WebElement pi=driver.findElement(By.xpath("//div[@id='select2-drop']"));
		List<WebElement>items=pi.findElements(By.tagName("li"));
		for(WebElement ds:items) {
		System.out.println(ds.getText());
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("document.getElementById('s2id_autogen3_search').value = 'ashok';");

		// driver.findElement(By.id("s2id_autogen3_search")).sendKeys("WAYNE TAYLOR");
//		     driver.findElement(By.id("s2id_autogen3_search")).sendKeys(Keys.ARROW_DOWN);
		// driver.findElement(By.id("s2id_autogen3_search")).sendKeys(Keys.ENTER);
		// Thread.sleep(5000);
		driver.findElement(By.id("s2id_project.projPerson2")).click();
		System.out.println("print the line1");
		//Thread.sleep(3000);
		driver.findElement(By.id("s2id_autogen4_search")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("s2id_autogen4_search")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='panel-footer']//button[@id='addPersonnel']")).click();
		driver.findElement(By.cssSelector("body.skin-blue.top-menu.sidebar-collapse.pace-done:nth-child(2) div.content-wrapper:nth-child(8) div.container-fluid.form-horizontal.marginFlex:nth-child(10) div.rowNoMar:nth-child(2) div.row.rowNoMar.respWrapper:nth-child(8) div.panel.panel-default table.table.table-condensed.table-bordered.panel-bordered tbody:nth-child(2) tr:nth-child(3) td:nth-child(1) div.select2-container.form-control.span2:nth-child(2) > a.select2-choice.select2-default")).click();
		System.out.println("element identified1");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@id='s2id_autogen1103_search']"));
		driver.findElement(By.cssSelector("#s2id_autogen2141_search")).sendKeys("Field Contact");
		driver.findElement(By.cssSelector("#s2id_autogen2141_search")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/form[1]/div[5]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/a[1]")).click();
		driver.findElement(By.cssSelector("html body.skin-blue.top-menu.sidebar-collapse.pace-done div#select2-drop.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active.select2-drop-above div.select2-search input#s2id_autogen2142_search.select2-input")).sendKeys("CMS USER");
		//*[@id="s2id_autogen3243_search"] #s2id_autogen3243_search
		//System.out.println("chek the click");
		//driver.findElement(By.xpath("//*[@id=\"s2id_autogen2142_search\"]")).sendKeys("CMS USER");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("html body.skin-blue.top-menu.sidebar-collapse.pace-done div#select2-drop.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active.select2-drop-above div.select2-search input#s2id_autogen2142_search.select2-input")).sendKeys(Keys.TAB);

	}
*/

