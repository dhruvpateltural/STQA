package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateByXPathRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//create webdriver instance
		WebDriver driver = new FirefoxDriver();
		
		//open webpage in browser
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		
		WebElement testing = driver.findElement(By.xpath("//div[@class='featured-box cloumnsize1']//h4[3]//b"));
		System.out.println(testing.getText());
	}

}
