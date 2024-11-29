	package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlertsQ2 {

    public static void main(String[] args) throws InterruptedException {
        // Set the system property for the GeckoDriver
        System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

        // Create a new instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to the demoqa.com/alerts page
        driver.get("https://demoqa.com/alerts");

        WebElement btn = driver.findElement(By.id("alertButton"));

		 btn.click();
		 Thread.sleep(5000);
		 Alert simple_alert = driver.switchTo().alert();
		 System.out.println("the alert message is "+ simple_alert.getText());
		 simple_alert.accept();
		 
		 Thread.sleep(5000);
		 WebElement btn2 = driver.findElement(By.id("timerAlertButton"));

		 btn2.click();
		
		 Thread.sleep(5000);
		 Alert wait_alert = driver.switchTo().alert();
		 System.out.println("the wait alert message is "+ wait_alert.getText());
		 Thread.sleep(5000);
		 wait_alert.accept();
		 
		 
		 //confirm box alert handling
		 Thread.sleep(2000);
		 WebElement btn3 = driver.findElement(By.id("confirmButton"));
		 btn3.click();
		 Thread.sleep(5000);
		 Alert text_alert = driver.switchTo().alert();
		 
		 System.out.println("the confirm box alert  message is "+ text_alert.getText());
		 
		 text_alert.accept();
	 
		 // prompt alert box handling
		 Thread.sleep(2000);
		 WebElement btn4 = driver.findElement(By.id("promtButton"));
		 btn4.click();
		 
		 Alert prompt_alert = driver.switchTo().alert();
		 prompt_alert.sendKeys("Hi From Selenium");
		 Thread.sleep(5000);
		 prompt_alert.accept();

       
    }
}