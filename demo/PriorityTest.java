package demo;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority = 2)
  public void FirstMethod() {
	  System.out.println("This is First Method");
  }
  @Test(priority = 3)
  public void SecondMethod() {
	  System.out.println("This is Second Method");
  }
  @Test(priority = 1)
  public void ThirdMethod() {
	  System.out.println("This is Third Method");
  }
}
