package findControls;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindControlLocateByTagName {
	
	//<input id="persist_box" type="checkbox" name="persistent" value="1" tabindex="3" class="uiInputLabelCheckbox">

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");
		//Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();		
		
		driver.get("http://demo.guru99.com/test/facebook.html");
		
		List<WebElement> textboxes = driver.findElements(By.tagName("input"));
		System.out.println(textboxes.size());
		
		for(int i=0;i<textboxes.size();i++)
		{
			System.out.println(textboxes.get(i).getAttribute("name"));
		}
//		
//		WebElement Click = driver.findElement(By.cssSelector("iput[id='persist_box']"));
//		Click.click();
	}

}
