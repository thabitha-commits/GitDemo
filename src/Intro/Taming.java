package Intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Taming {
	@Test(priority = 2, dependsOnMethods = {"Login"})
	public void SendingEmail() {

		System.out.println("Send Email fron Gmail");
	}

	@Test(priority = 1)
	public void Login() {

		System.out.println("Login");
		Assert.assertTrue(3>4, "Expected is true but actual is false");
	}

	@Test(priority = 3, dependsOnMethods = {"Login"})
	public void Logout() {

		System.out.println("Logout");
	}

}
