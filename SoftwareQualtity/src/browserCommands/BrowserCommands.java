package browserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		//open Google web page
		driver.get("https://www.google.com"); //use get method
		
		System.out.println("Title is: "+driver.getTitle()); //use title method
		
		System.out.println("URL of Page is: "+driver.getCurrentUrl()); //use current URL
		
		System.out.println("Page Source is: "+driver.getPageSource());  //use Page Source
		
		driver.close(); //closing window
		driver.quit(); //close all windows 
		
		
		
		

	}

}
