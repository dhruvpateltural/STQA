package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NameAndIdLocatorStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("http://demo.guru99.com/test/login.html");
		
		WebElement username =driver.findElement(By.id("login_form"));
		System.out.println(username.getAttribute("id"));
		
		WebElement SubmitLogin = driver.findElement(By.name("SubmitLogin"));
		System.out.println(SubmitLogin.getAttribute("name"));
		
		

	}

}
