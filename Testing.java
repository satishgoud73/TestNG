package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing 
{ 
	@BeforeMethod
  public void Login()
  {
	  System.out.println("Login successfully");
	  
  }
	@Test(priority=2)
public void SetAmount()
{
	System.out.println("Enter Amount");
	
}
	@Test(enabled=false)
public void Transfer()
{
	System.out.println("Funds Transferred");
	
}
	@AfterMethod
public void Logout()
{
	System.out.println("Logout From The Page");
	
}

}
