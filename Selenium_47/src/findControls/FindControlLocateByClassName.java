package findControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindControlLocateByClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		//open login page
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		//locate elements using class name locator strategy
		List<WebElement> elements = driver.findElements(By.className("inputtext"));
		
		//total number of elements in list having class input
		System.out.println(elements.size());
		
		
		//display value of id attribute of all elements in the list
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("id"));
		}
		
		elements.get(0).sendKeys("dhruv.dev@google.com");
		elements.get(1).sendKeys("admin123");
	}

}
