package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
			// create web driver instance
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Applications\\Selenium_Setup\\chromedriver.exe");
//			driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origns=");
			driver = new ChromeDriver(options);
		} else {
			throw new Exception("Incorrect Browser");
		}
	}
	
	@Test
	public void PrintTitle() {
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		System.out.println("The Title is: "+actualTitle);
	}
}
