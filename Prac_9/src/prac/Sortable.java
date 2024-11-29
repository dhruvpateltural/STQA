package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/Sortable.html");
		
			Actions actions = new Actions(driver);
	        WebElement tile3 = driver.findElement(By.name("three")); // Adjust selector as needed
	        WebElement tile2 = driver.findElement(By.name("two")); // Adjust selector as needed

	        actions.dragAndDrop(tile3, tile2).perform();
	}

}
