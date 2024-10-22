package findControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Applications\\Selenium_Setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//locate google search
		WebElement searchElemenet = driver.findElement(By.name("q"));
		
		//type  FAMT in search Element
 		searchElemenet.sendKeys("FAMT");
 		
 		//locate google search button
 		WebElement searchButton = driver.findElement(By.name("btnK"));
 		searchButton.submit();
 		
 		
 		driver.quit();
	}

}