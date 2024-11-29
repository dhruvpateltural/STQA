package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateUsingClassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		List<WebElement> elements = driver.findElements(By.className("inputtext"));
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("name"));
		}
	}

}
