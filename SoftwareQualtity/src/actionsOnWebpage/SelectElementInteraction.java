package actionsOnWebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectElementInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();

		// open the web page
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

		
		//locate drop down box
		Select car_type = new Select(driver.findElement(By.tagName("select")));
		//Select Saab using selectByVisibleText
		car_type.selectByVisibleText("Saab");
		Thread.sleep(2000);
		//Select Opel using selectByValue
		car_type.selectByValue("Singapore");
		Thread.sleep(2000);
		//Select Audi uisng selectByIndex
		car_type.selectByIndex(3);
		
		//locate country list
		Select country_list = new Select(driver.findElement(By.name("FromLB")));
		//is multiple selection is allowed select usa greece and italy
		if(country_list.isMultiple()) {
			country_list.selectByVisibleText("USA");
			Thread.sleep(2000);
			country_list.selectByValue("GRC");
			Thread.sleep(2000);
			country_list.selectByIndex(6);
		}
		else System.out.println("List does not allow multiple selection");
		
		//deselect Greece using deselectByValue()
		Thread.sleep(2000);
		country_list.deselectByValue("GRC");
		Thread.sleep(2000);
		country_list.deselectAll();
	}

}
