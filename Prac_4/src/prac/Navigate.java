package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();	
		
		 driver.get("https://www.toolsqa.com/selenium-training/");
		 Thread.sleep(3000);
		// 2. Click on the 'Registration' button
		WebElement registeration = driver.findElement(By.className("enroll__heading"));
		registeration.click();
		 Thread.sleep(3000);
		// 3. Navigate back to the home page using 'back' command
		 driver.navigate().back();
		 Thread.sleep(3000);
		// 4. Go forward to the registration page using 'forward' command
         driver.navigate().forward();
         Thread.sleep(3000);
         // 5. Come back to the home page using 'get' command
         driver.navigate().to("https://www.toolsqa.com/selenium-training/");
         Thread.sleep(3000);
         // 6. Refresh the browser
         driver.navigate().refresh();
		 
			
	}

}
