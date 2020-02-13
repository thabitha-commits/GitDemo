package Intro;

import org.testng.annotations.Test;

public class Grouping {
	
	//Groups - Regression, Smoke, Functional
	//groups - parameter of Test annotation
	/*Created grouping of test annotation methods to run based 
	on the included groups and not run those test annotation methods which are part of excluded groups.*/
	//For grouping , need to run it from SUITE LEVEL only - create the TESTNG.XML file
	//Exclusion has higher hierarchy than inclusion
	
	
	@Test(priority = 1,groups = {"Functional", "Regression"})
	public void MethodB() {
		System.out.println("Executing Method B");
	}
	
	
	@Test(priority = 2,groups = {"Regression"})
	public void MethodA() {
		System.out.println("Executing Method A");
	}
	
	@Test(priority = 3,groups = {"Smoke"})
	public void MethodC() {
		System.out.println("Executing Method C");
	}
	
	@Test(priority = 4,groups = {"Smoke","Functional"})
	public void MethodD() {
		System.out.println("Executing Method D");
	}

}
