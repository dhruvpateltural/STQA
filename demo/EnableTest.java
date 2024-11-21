package demo;

import org.testng.annotations.Test;
@Test(enabled = true)
public class EnableTest {

  public void testMethodOne() {
	  System.out.println("Test Method One");
	  
  }
@Test(enabled =  true)
  public void testMethodTwo() {
	  System.out.println("Test Method Two");
  }
  @Test(enabled =  false)
  public void testMethodThree() {
	  System.out.println("Test Method Three");
  }
}
