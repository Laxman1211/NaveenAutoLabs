package naveenLab1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expTitle;
		expTitle = "Navyug | Chughs Navyug Military - India's First Online Military Gear Store";
		
		// Firefox Browser 
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\laxman_perumandla\\Softwares\\SeleniumJars\\Gecko_v0.23.0\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver(); 
			driver.manage().window().maximize(); 
			driver.get("http://www.navyug.com"); 
			
			String actTitle = driver.getTitle(); 
			System.out.println("Page Title ###### "+actTitle); 
			
			System.out.println("The Currnet URL ### "+ driver.getCurrentUrl()); 
			
			System.out.println("The Page Source ### "+ driver.getPageSource()); 
			
			
			
			
			// Title Validation 
			/*if(actTitle.equals(expTitle))
			{
				System.out.println("Title is same.. ");
			}
			else {
					System.out.println("Title is wrong.. ");
			}*/
			
			driver.close();
	}
	
}
