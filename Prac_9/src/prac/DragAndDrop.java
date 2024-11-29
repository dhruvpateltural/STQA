package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");

        Actions actions = new Actions(driver);
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement debitSide = driver.findElement(By.className("placeholder")); // Adjust as necessary

        actions.dragAndDrop(bank, debitSide).perform();
	}

}
