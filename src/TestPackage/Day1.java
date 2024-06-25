package TestPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterTest
	public void postmethod()
	{
		System.out.println("Execute last");
	}
	
	@Test(timeOut=4000)
	public void sample()
	{
		System.out.println("Hello");
	}
	
	@Test(enabled=false)
	public void suite()
	{
		System.out.println("Execute last for entrie folders");
	}
	
	@Test(dependsOnMethods= {"dummy","sample"})
	public void regular()
	{
		System.out.println("This is sample");
	}

	@Test
	public void dummy()
	{
		System.out.println("Second line");
	}
	
}
