package alertAndPopupWindow;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertAndPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		
		//open train_reservation.html
		driver.get("file:///D:/Flight_Reservation/train_reservation.html");
		
		//locate trains hyperlink
		WebElement trains_link = driver.findElement(By.linkText("Trains"));
		
		//click on trains link
		trains_link.click();
		
		//Alert window opens
		//switch from main window to alert window
		Alert simpleAlert = driver.switchTo().alert(); // simpleAlert 
		
		//print alert text
		System.out.println("The Text inside alert window is: "+simpleAlert.getText());
		
		//perform action on clicking on simple alert
		Thread.sleep(2000);
		simpleAlert.accept(); //click OK button of alert window
		
		Thread.sleep(5000);
		
		//locate confirm details button
		WebElement confirmBtn = driver.findElement(By.cssSelector("input[value='Confirm Details']"));
		confirmBtn.click();

		//Alert window opens
		//switch from main window to alert window
		Alert promt_Alert = driver.switchTo().alert();
		//enter input
		promt_Alert.sendKeys("3");
		Thread.sleep(2000);
		promt_Alert.accept();
		Thread.sleep(5000);
		
		
		WebElement book_Tickets = driver.findElement(By.cssSelector("input[value='Book Tickets']"));
		book_Tickets.click();
		//Alert window opens
		//switch from main window to alert window
		Alert Confimation_alert = driver.switchTo().alert();
		
		//text retrieve from confirmation Text
		System.out.println("The Text inside window: "+Confimation_alert.getText());
		Thread.sleep(2000);
		Confimation_alert.accept();
		
		Thread.sleep(5000);
		WebElement book_tickiet_cancel = driver.findElement(By.cssSelector("input[value='Book Tickets']"));
		book_tickiet_cancel.click();
		
		Alert decline_alert = driver.switchTo().alert();
		Thread.sleep(2000);
		decline_alert.dismiss();
		

	}

}
