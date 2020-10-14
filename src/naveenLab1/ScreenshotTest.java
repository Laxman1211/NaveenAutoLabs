package naveenLab1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Gecko_v0.23.0\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); 
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\laxman_perumandla\\Desktop\\scrnshot.png"));
		
	}

}
