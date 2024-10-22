package findControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindControlLocateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Path of Browser Driver
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		driver.get("https://demo.guru99.com/test/login.html");
		
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("abcd@gmail.com");
		
		WebElement passdTextBox = driver.findElement(By.id("passwd"));
		passdTextBox.sendKeys("abcdefghlkjl");
		
		WebElement submitButton = driver.findElement(By.id("SubmitLogin"));
		submitButton.submit();
		
		
		driver.quit();
		
		

	}

}
