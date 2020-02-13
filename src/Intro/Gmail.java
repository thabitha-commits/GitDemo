package Intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {

	// Sending mail
	// Saving Mail

	@Test(priority = 1)
	public void GmailMailSend() {
		System.out.println("Sending mail from Gmail Application");
	}

	@Test(priority = 2)
	public void GmailMailSave() {
		System.out.println("Saving mail to Gmail Application");
	}

	@BeforeMethod
	public void Login() {
		System.out.println("Login to Gmail App");
	}

	@AfterMethod /* (dependsOnMethods = {"Login"}) */
	public void Logout() {
		System.out.println("Logout from Gmail App");
	}

	// We can use Before class and After class in this class file once
	// Before class and After class can be used once in the class tag of TestNG.xmlk
	// file

	@BeforeClass
	public void NavigateGmail() {
		System.out.println("Navigate to Gmail App");
	}

	@AfterClass
	public void CloseBrowser() {
		System.out.println("Close Browser Gmail");
	}

	@BeforeTest
	public void ConnectDBGmail() {
		System.out.println("Connect to db of Gmail");
	}

	@AfterTest
	public void DisconnectDBGmail() {
		System.out.println("Disconnect DB Gmail");
	}

	@AfterSuite
	public void ObjectRepoUnLoading() {
		System.out.println("UnLoad the object repo for Yahoo and Gmail");
	}

	// Load the object repo for Yahoo and Gmail - Before Suite
	// Connect to db of Gmail - Before Test
	// Navigate to Gmail App - BeforeClass
	// Login to Gmail App - BeforeMethod
	// Sending mail from Gmail Application
	// Logout from Gmail App - After Method
	// Login to Gmail App - BeforeMethod
	// Saving mail to Gmail Application
	// Logout from Gmail App - After Method
	// Close Browser Gmail -BeforeClass
	// Disconnect DB Gmail - After Test//Connect to db of Yahoo
	// Navigate to Yahoo App
	// Login to Yahoo App
	// Sending mail from Yahoo Application
	// Logout from Yahoo App
	// Login to Yahoo App
	// Saving mail to Yahoo Application
	// Logout from Yahoo App
	// Close Browser Yahoo
	// Disconnect DB Yahoo
	// UnLoad the object repo for Yahoo and Gmail - AfterSuite

}
