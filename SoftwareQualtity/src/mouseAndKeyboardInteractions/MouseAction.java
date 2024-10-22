package mouseAndKeyboardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/Selectable.html");
		
		WebElement two = driver.findElement(By.name("two"));
		System.out.println("X coordinates of two are: "+two.getLocation().getX());
		System.out.println("Y coordinates of two are: "+two.getLocation().getY());
		
		Actions builder = new Actions(driver);
		
		//The mpveByOffset
		builder.moveByOffset(two.getLocation().getX()+1, two.getLocation().getY()+1).click();
		builder.perform();
		
		
		//move to element action
		Thread.sleep(2000);
		driver.navigate().refresh();
		//use moveToElement
		WebElement nine = driver.findElement(By.name("nine"));
		builder.moveToElement(nine).click();
		builder.perform();
		
		
		//click on web element
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		WebElement seven = driver.findElement(By.name("seven"));
		WebElement eight = driver.findElement(By.name("eight"));
		WebElement ten = driver.findElement(By.name("ten"));
		
		builder.click(seven).click(eight).click(ten);
		builder.perform();
		
	}

}
