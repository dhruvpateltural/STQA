package mouseAndKeyboardInteractions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/DoubleClick.html");
		
		WebElement clickMe = driver.findElement(By.name("dblClick"));
		
		Actions builder = new Actions(driver);
		//builder.moveToElement(clickMe).doubleClick().perform();
		builder.doubleClick(clickMe).perform();
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
	}

}
