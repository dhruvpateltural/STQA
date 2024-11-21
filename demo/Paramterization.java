package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Paramterization {
  @Parameters({"suite-param"})
  @Test
  public void ParameterTestOne(String param) {
	  System.out.println("Test One - value of suite-level paramter is: "+param);
  }
  
  @Parameters({"test-two-param"})
  @Test
  public void ParameterTestTwo(String param) {
	  System.out.println("Test Two - value of test-level paramter is: "+param);
  
  }
  
  @Parameters({"suite-param","test-three-param"})
  @Test
  public void ParameterTestThree(String param,String param1) {
	  System.out.println("Test Three - value of test-level paramter is: "+param);
	  System.out.println("Test Three -value of test-suite parameter is: "+param1);
  }
}

