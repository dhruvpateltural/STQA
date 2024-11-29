package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateIdNameLinkPartialLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		WebElement NameAndSlogan = driver.findElement(By.id("name-and-slogan"));
		System.out.println(NameAndSlogan.getAttribute("id"));
		
		WebElement Password = driver.findElement(By.name("password"));
		System.out.println(Password.getAttribute("name"));
		
		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		System.out.println(Register.getAttribute("href"));
		
		WebElement Support = driver.findElement(By.partialLinkText("REG"));
		System.out.println(Support.getAttribute("href"));
	}

}
