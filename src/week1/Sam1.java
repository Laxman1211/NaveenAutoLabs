package week1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sam1 {
	
	@Test
	public void test()
	{
		System.out.println("Hello TestNG Test..");
	}

	@BeforeMethod
	public void beforeTest()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterTest()
	{
		System.out.println("After method");
	}
}
