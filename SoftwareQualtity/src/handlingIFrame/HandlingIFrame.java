package handlingIFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingIFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/flight_reservation.html");
		
		//switch to iFrame-1
		driver.switchTo().frame(0);
		
		//locate header inside iFrame
		WebElement iFrameHeading = driver.findElement(By.id("heading1"));
		System.out.println("Heading of First iFrame is: "+iFrameHeading.getText());
		
		
		//switch back to main document
		driver.switchTo().defaultContent();
		
		//Switch to iFrame2
		
		driver.switchTo().frame("IF2");
		WebElement iFrameHeading_2 = driver.findElement(By.id("heading2"));
		System.out.println("Heading of Second IFrame is:  "+iFrameHeading_2.getText());
		
		driver.switchTo().frame(0);
		WebElement childIframe = driver.findElement(By.id("heading3"));
		System.out.println("Heading of Child IFrame is: "+childIframe.getText());
		
		System.out.println(driver.getTitle());
		
		
	}

}
