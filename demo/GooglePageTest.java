package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class GooglePageTest {
	WebDriver driver;
  @Test
  public void Validate() {
	  String expectedTitle = "Google";
	  String actualTitle = driver.getTitle();
	  
	  Assert.assertEquals(expectedTitle,actualTitle,"Page recived is not expected");
  }
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		// create web driver instance
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.google.com");
  }

 @AfterSuite
 public void tearDown() throws InterruptedException {
	 Thread.sleep(3000);
	  if(driver != null) {
		  driver.quit();
	  }
 }
 

}
