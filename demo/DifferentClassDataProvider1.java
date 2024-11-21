package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferentClassDataProvider1 {
	@DataProvider(name = "testdata")
	public Object[][] dataProviderMethod(){
		return new Object[][] {{"data-one"},{"data-two"}};
	}
}
