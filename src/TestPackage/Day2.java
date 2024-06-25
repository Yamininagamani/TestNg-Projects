package TestPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Parameters({"URL","APIKey"})
	@Test
	public void Loan(String urlname, String key)
	{
		System.out.println("Loan");
		System.out.println(urlname); 
		System.out.println(key); 
	}

	@Test(groups={"smoke"})
	public void approved()
	{
		System.out.println("approved");
	}
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Execute first");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Execute first for entire folders");
	}
}
