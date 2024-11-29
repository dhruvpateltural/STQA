package prac;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateUsingCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		WebElement Username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		System.out.println(Username.getAttribute("id"));
		

		WebElement Lastname = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		System.out.println(Lastname.getAttribute("id"));
		
		
		List<WebElement> gender = driver.findElements(By.cssSelector("input[class='custom-control-input']"));
		
		for(int i=0;i<gender.size();i++)
		{
			System.out.println(gender.get(i).getAttribute("id"));
		}
	}

}
