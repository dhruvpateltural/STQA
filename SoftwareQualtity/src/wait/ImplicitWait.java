package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		//open guru99home
		driver.get("https://demo.guru99.com/test/guru99home");
		
		//configure 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//print title of webpage
		System.out.println("Title of Webpage: "+ driver.getTitle());
	}

}
