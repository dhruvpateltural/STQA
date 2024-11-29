package prac;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		 driver.get("http://demo.guru99.com/test/simple_context_menu.html");

	        Actions builder = new Actions(driver);
	        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));

	        // Double click
	        builder.doubleClick(doubleClickButton).click().perform();
	        Alert simpleAlert = driver.switchTo().alert();
	        Thread.sleep(2000);
	        simpleAlert.accept();
	        Thread.sleep(3000);
	        // Right click
	        builder.contextClick(rightClickButton).click().perform();
	        Thread.sleep(3000);


	}

}
