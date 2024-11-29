package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAndOpenFlightFinder {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		WebElement Username = driver.findElement(By.name("userName"));
		WebElement Password = driver.findElement(By.name("password"));
		
		Username.sendKeys("Aniket");
		Password.sendKeys("1234");
		
		Thread.sleep(5000);
		WebElement flights = driver.findElement(By.linkText("Flights"));
		flights.click();
		
		Thread.sleep(3000);
		Select pasanger = new Select(driver.findElement(By.name("passCount")));
		pasanger.selectByValue("2");
		
		Select fromPort = new Select(driver.findElement(By.name("fromPort")));
		fromPort.selectByIndex(2);
		
		Select fromMonth = new Select(driver.findElement(By.name("fromMonth")));
		fromMonth.selectByIndex(3);
			
		Select fromDay = new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByIndex(4);
		
		Select toPort = new Select(driver.findElement(By.name("toPort")));
		toPort.selectByIndex(5);
		
		
		Select toMonth = new Select(driver.findElement(By.name("toMonth")));
		toMonth.selectByIndex(4);
		
		
		Select toDay = new Select(driver.findElement(By.name("toDay")));
		toDay.selectByIndex(2);
			
		WebElement Service = driver.findElement(By.cssSelector("input[value='Business']"));
		Service.click();
		
		Select airline = new Select(driver.findElement(By.name("airline")));
		airline.selectByIndex(2);
		
		
		Thread.sleep(3000);	
		WebElement bookTickiet = driver.findElement(By.name("findFlights"));
		bookTickiet.click();
		
		
		
		
	}

}
