package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Parameters({ "URL" })
	@Test()
	public void LogintoCarLoan(String urlname)
	{
		System.out.println("this logincar");
		System.out.println(urlname);
	}
	@Test(groups={"smoke"})
	public void smokeTesting()
	{
		System.out.println("smoke");
	}
	@Test
	public void LoginWebsite()
	{
	System.out.println("LoginWEbsite");
	}
	@Test
	public void ManageApplication()
	{
		System.out.println("this is manage application");
	}
}
