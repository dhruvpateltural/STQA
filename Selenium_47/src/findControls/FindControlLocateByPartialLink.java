package findControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindControlLocateByPartialLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("https://www.google.com/");
		
		
		WebElement partialLink = driver.findElement(By.partialLinkText("Ima"));
		partialLink.click();
	}

}
