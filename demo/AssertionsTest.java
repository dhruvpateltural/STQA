package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {
  @Test
  public void verifyTitle() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle,"Title is not as expected");
		
  }
}
