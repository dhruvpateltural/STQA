package seleniumscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Path of Browser Driver
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();
		
		//Open google.com
		driver.get("https://www.google.com/");
	}

}
