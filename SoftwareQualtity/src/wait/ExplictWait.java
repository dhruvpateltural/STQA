package wait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		//open demoqa.com/alerts
		driver.get("https://demoqa.com/alerts");
		
		
		//locate TimerAlert button
		WebElement alertBtn = driver.findElement(By.id("timerAlertButton"));
		
		//click on button
		alertBtn.click();
		
		//create new WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//created conditional wait
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
		
		//switch to alert
		driver.switchTo().alert();
		
		myAlert.accept();
	}

}
