/**
 * 
 */
package googleSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingBetweenWindows {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///D:/Flight_Reservation/Window.html");
		
		String window1=driver.getWindowHandle();
		System.out.println("First window Handle is :"+window1);
		System.out.println("Title of first window is:"+driver.getTitle());
		
		WebElement link=driver.findElement(By.linkText("Google Search"));
		
		link.click();
		Set<String> winSet=driver.getWindowHandles();
		
		List<String> winList=new ArrayList<String>(winSet);
		
		String newTab=winList.get(winList.size()-1);
		//Switch to second window
		driver.switchTo().window(newTab);
		//Print ID of second window
		System.out.println("Second window handle is "+newTab);
		//Total Number of Windows
		System.out.println("Total Number of Windows "+winList.size());
		//Current URL pointed by driver
		System.out.println("URL of second page "+ driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.switchTo().window(window1);

	}

}
