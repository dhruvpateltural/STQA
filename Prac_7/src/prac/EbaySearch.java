package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class EbaySearch {
    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver
    	System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();

        // Browse to eBay India export website
		driver.get("https://www.ebay.com/");

        // Enter search query for 'Apple Watches'
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Apple Watches");

        // Locate the categories dropdown
        Select categories = new Select(driver.findElement(By.id("gh-cat")));
        
        // Select the 'Consumer Electronics' category (value is '293')
        categories.selectByValue("293");

        // Click on the search button
        WebElement submit = driver.findElement(By.id("gh-btn"));
        submit.click();

        // Wait for the results page to load (optional sleep)
        Thread.sleep(3000);

        // Fetch and print the list of product titles
        System.out.println("Results for 'Apple Watches':");
        List<WebElement> productTitles = driver.findElements(By.cssSelector(".s-item__title"));
        for (WebElement title : productTitles) {
            System.out.println(title.getText());
        }
        
        
        
      
 

    }
}
