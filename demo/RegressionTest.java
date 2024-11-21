package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RegressionTest {
	WebDriver driver;
  @BeforeTest
  public void setup() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		// create web driver instance
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://demo.guru99.com/test/newtours/");
		 Thread.sleep(3000);
  }
  @Test(priority = 1, groups = {"regression"})
  public void verifyTitle() {
	  String pageTitle = driver.getTitle();
	  Assert.assertEquals(pageTitle, "Welcome: Mercury Tours", "Page Title dosen't match");
	  
  }
  
  @Test(priority = 2, groups = {"regression"})
  public void verifyLogin() throws InterruptedException {
	   WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("mercury");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement submit = driver.findElement(By.name("submit"));
		
		Thread.sleep(6000);
		submit.click();
  }
  
  @AfterSuite
  public void tearDown() throws InterruptedException {
	  Thread.sleep(6000);
	  if(driver != null) {
		  driver.quit();
	  }
  }
}
