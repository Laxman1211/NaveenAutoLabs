package week1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestList {

	@BeforeMethod
	public void b1()
	{
		System.out.println(" Before Method b1..."); 
	}
	
	@BeforeMethod
	public void b2()
	{
		System.out.println(" Before Method b2..."); 
	}
	
	@BeforeTest
	public void bt1()
	{
		System.out.println(" Before Test bt1...");
	}
	
	@Test	
	public void test1()
	{
		System.out.println("test Method 1.... ");
	}
		
	@Test
	
	public void test2()
	{
		System.out.println("test Method 2.. ");
	}
	
	@AfterMethod
	public void a1()
	{
		System.out.println(" After Method a1...");
	}
	
	@AfterMethod
	public void a2()
	{
		System.out.println(" After Method a2...");
	}
	
	@AfterTest
	public void at1()
	{
		System.out.println(" After Test at1...");
	}
	
	@BeforeClass
	public void bc1()
	{
		System.out.println(" Before class ...");
	}
	
	@AfterClass
	public void ac1()
	{
		System.out.println(" After class ...");
	}
}