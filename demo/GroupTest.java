package demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeGroups(groups= {"group-1"})
	public void beforeGroupOne() {
		System.out.println("Before Group-1 Test methods are executed");
	}
	
	@AfterGroups(groups = {"group-1"})
	public void afterGroups() {
		System.out.println("After Group-1 Test methods are executed");
	}
	
  @Test(groups = {"group-1"})
  public void testMthodOne() {
	  System.out.println("Test Method Belongs to Group-1");
  }
  
  @Test(groups = {"group-2"})
  public void testMethodTwo() {
	  System.out.println("Test Method Belongs to Group-2");
  }
  @Test(groups = {"group-1"})
  public void testMethodThree() {
	  System.out.println("Test Method Belongs to Group-1");
  }
}
