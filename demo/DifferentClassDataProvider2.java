package demo;

import org.testng.annotations.Test;

public class DifferentClassDataProvider2 {
	 @Test(dataProvider = "testdata",dataProviderClass = demo.DifferentClassDataProvider1.class)
	  public void testMethod(String data) {
		  System.out.println("Data is: "+data);
	  }
}
