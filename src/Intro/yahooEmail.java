package Intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class yahooEmail {
	
	@Test(priority = 1)
	public void SendYahooMail() {
		System.out.println("Sending mail from Yahoo Application");
	}
	
	@Test(priority = 2)
	public void SavingYahooMail() {
		System.out.println("Saving mail to Yahoo Application");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Login to Yahoo App");
	}
	
	@AfterMethod/*(dependsOnMethods = {"Login"})*/
	public void Logout() {
		System.out.println("Logout from Yahoo App");
	}
	
	@BeforeClass
	public void NavigateYahoo() {
		System.out.println("Navigate to Yahoo App");
	}
	
	@AfterClass
	public void CloseBrowser() {
		System.out.println("Close Browser Yahoo");
	}
	
	@BeforeTest
	public void ConnectDBYahoo() {
		System.out.println("Connect to db of Yahoo");
	}
	
	@AfterTest
	public void DisconnectDBYahoo() {
		System.out.println("Disconnect DB Yahoo");
	}
	
	@BeforeSuite
	public void ObjectRepoLoading() {
		System.out.println("Load the object repo for Yahoo and Gmail");
	}
	
	
	

}
