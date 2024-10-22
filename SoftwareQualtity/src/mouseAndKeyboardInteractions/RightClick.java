package mouseAndKeyboardInteractions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/ContextClick.html");
		
		WebElement rightClick = driver.findElement(By.id("div-context"));
		WebElement itemFour = driver.findElement(By.id("ui-id-4"));
		
		Actions builder = new Actions(driver);
		
		builder.contextClick(rightClick).click(itemFour).perform();
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		simpleAlert.accept();
	}

}
