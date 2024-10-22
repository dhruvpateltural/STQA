package findControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindControlUsingFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		WebElement webElements = driver.findElement(By.name("q"));
		webElements.sendKeys("FAMT");
		
		WebElement searchElement = driver.findElement(By.name("btnK"));
		searchElement.submit();
		
			
		
	}

}
