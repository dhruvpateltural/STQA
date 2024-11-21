package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LinearScriptingTest {
	@Test
	public void loginTest() {
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		// create web driver instance
		WebDriver driver = new FirefoxDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("mercury");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		
		String expectedTitle = "Login: Mercury Tours";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Login Test Passed");
		}
		else System.out.println("Login Test Failed");
	}
	
}
