package actionsOnWebpage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();

		// open the web page
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");

		// locate web element	
		WebElement test = driver.findElement(By.cssSelector("h3[itemprop='name']"));
		WebElement fname = driver.findElement(By.id("fname"));
		WebElement lname = driver.findElement(By.name("lname"));

		List<WebElement> checkboxes = driver.findElements(By.name("vehicle"));
		WebElement male_rb = driver.findElement(By.cssSelector("input[value='male']"));
		//WebElement female_rb = driver.findElement(By.cssSelector("input[value='female']"));

		// get attribute method
		System.out.println("Value of name attribute of First name box is " + fname.getAttribute("name"));

		// using sendKeys()
		fname.sendKeys("dhruv");

		// wait for some time
		Thread.sleep(3000);

		// using clear()
		fname.clear();

		fname.sendKeys(Keys.chord(Keys.SHIFT, "dhruv"));

		// get cssValue() text-align: left;
		System.out.println("Aligment of firstname textboxes is: " + fname.getCssValue("text-align"));

		// using getLocation()
		System.out.println("Location of firstname textbox is: " + fname.getLocation());

		// using getSize()
		System.out.println("Size of firstname textbox is: " + fname.getSize());

		// using getText() --MyTest
		System.out.println("Text: " + test.getText());

		// using getTagname
		System.out.println("TagName: " + test.getTagName());

		// using isDisplayed()
		if (fname.isDisplayed()) {
			Thread.sleep(3000);
			fname.clear();
			fname.sendKeys("Dhruv");
		} else
			System.out.println("First name is not displayed on web page");

		// using isEnabled()
		if (lname.isEnabled()) {
			lname.sendKeys("Patel");
		} else
			System.out.println("Last name textbox is not enabled");
		
		//using Click select I have Car check box
		checkboxes.get(1).click();
		
		//using click
		checkboxes.get(2).click();
		
		//using isSelected() Bike
		if(checkboxes.get(0).isSelected())
		{
			System.out.println("Bike checkbox is Selected ");
		}
		else System.out.println("Bike checkbox is Not Selected");
		
		//verify Boat check box is Selected or not
		if(checkboxes.get(2).isSelected())
		{
			System.out.println("Boat checkbox is Selected ");
		}
		else System.out.println("Boat checkbox is Not Selected");
		
		//un check boat check box
		Thread.sleep(3000);
		checkboxes.get(2).click();
		
		//select Radio button
		male_rb.click();
		
		if(male_rb.isSelected())
		{
			System.out.println("Male Radio button is Selected ");
		}
		else System.out.println("Male Radio button is Not Selected");
		
		//locate drop down box
		Select car_type = new Select(driver.findElement(By.tagName("select")));
		car_type.selectByVisibleText("Saab");
		Thread.sleep(3000);
		//car_type.selectByIndex(2)
	}

}
