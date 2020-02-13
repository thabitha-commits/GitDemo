package Intro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LearningTestNg {
  @Test(priority = 1)
  public void MethodB() {
	  
	  System.out.println("Executing Method B");
  }
  
  @Test(priority = 2)
  public void MethodA() {
	  
	  System.out.println("Executing Method A");
  }
  

}
