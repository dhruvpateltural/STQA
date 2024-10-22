package browserNavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		//opens web page in browser
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		
		//display title
		System.out.println("Current Page title: "+driver.getTitle());
		
		//navigate pairs wikipedia page
		driver.navigate().to("https://en.wikipedia.org/wiki/Paris");
		
		//display title
		System.out.println("Current Page title: "+driver.getTitle());
		
		Thread.sleep(3000);
		
		//come back to google.com
		driver.navigate().back();
		
		//display title
		System.out.println("Current Page title: "+driver.getTitle());
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		//display title
		System.out.println("Current Page title: "+driver.getTitle());
		
		//refresh page
		driver.navigate().refresh();


	}

}
