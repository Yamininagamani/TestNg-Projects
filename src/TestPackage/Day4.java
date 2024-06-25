package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day4 {
	
	@BeforeClass
	public void befClass()
	{
		System.out.println("Execute data before this entrie class");
	}
	@Test(dataProvider="getData")
	public void AskforFam(String username, String password)
	{
		//System.out.println("Asking money for family emergency");
		System.out.println("username");
		System.out.println("password");
	}

	@BeforeMethod
	public void beforemeth()
	{
		System.out.println("It will execute before every method in day4 class");
	}
	@AfterMethod
	public void aftermeth()
	{
		System.out.println("It will execute after every method in day4 class");
	}
	@AfterClass
	public void aftClass()
	{
		System.out.println("Execute data after this entrie class");
	}
	@Test
	public void famEmergency()
	{
		System.out.println("Please contact");
	}
	
	@DataProvider
	public  Object[][] getData()
	{
	    //We declare 3 rows 2 columns for username and password
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}
}
