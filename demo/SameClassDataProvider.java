package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameClassDataProvider {
	@DataProvider(name = "testdata")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"data-one"},{"data-two"}};
	}
	
  @Test(dataProvider = "testdata")
  public void testMethod(String data) {
	  System.out.println("Data is: "+data);
  }
}
