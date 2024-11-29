package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		//open webpge
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
		
		WebElement showAlert =  driver.findElement(By.cssSelector("input[value='Show Me Alert']"));
		showAlert.click();
		
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		simpleAlert.accept();
		
	}

}
