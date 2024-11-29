package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateUsingTagName {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		List<WebElement> textboxes = driver.findElements(By.tagName("input"));
		
		for(int i=0;i<textboxes.size();i++)
		{
			System.out.println(textboxes.get(i).getAttribute("name"));
		}
		
		
	}

}
