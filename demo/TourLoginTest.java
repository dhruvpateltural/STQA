package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TourLoginTest {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		// create web driver instance
		driver = new FirefoxDriver();
		
		 driver.get("https://demo.guru99.com/test/newtours/");
	}
	
  @Test
  public void f() {
  }
}
