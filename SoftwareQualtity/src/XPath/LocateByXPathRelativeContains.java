package XPath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateByXPathRelativeContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//create webdriver instance
		WebDriver driver = new FirefoxDriver();
		
		//open webpage in browser
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		List<WebElement> testing  = driver.findElements(By.xpath("//*[contains(@id, 'message')]"));
		for(int i=0;i<testing.size();i++)
		{
			System.out.println(testing.get(i).getText());
		}
		
	}

}
