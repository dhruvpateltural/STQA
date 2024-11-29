package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/Selectable.html");
		
		WebElement three = driver.findElement(By.name("three"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(three).moveByOffset(0, 0).click().perform();
		builder.keyDown(Keys.CONTROL).click(eleven).keyUp(Keys.CONTROL).perform();

	}

}
