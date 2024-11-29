package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleAlertQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		//locate web page
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//double click me too see alert
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions dClick = new Actions(driver);
		dClick.doubleClick(doubleClick).perform();	;
	}

}
