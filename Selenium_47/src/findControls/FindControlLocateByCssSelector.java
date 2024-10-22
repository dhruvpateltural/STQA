package findControls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//tagName[attributename='attributeValue']
//input[id='email']
//input[name='email'][type='text']

// . refers to class
// # refers to id

//<input required="" autocomplete="off" placeholder="First Name" type="text" id="firstName" class=" mr-sm-2 form-control">
//<input required="" autocomplete="off" placeholder="Last Name" type="text" id="lastName" class=" mr-sm-2 form-control">
//<textarea placeholder="Current Address" rows="5" cols="20" id="currentAddress" class="form-control"></textarea>

//<input autocomplete="off" pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" placeholder="name@example.com" type="text" id="userEmail" class="mr-sm-2 form-control">
//<input required="" autocomplete="off" pattern="\d*" minlength="10" maxlength="10" placeholder="Mobile Number" type="text" id="userNumber" class=" mr-sm-2 form-control">

//<input name="gender" required="" type="radio" id="gender-radio-1" class="custom-control-input" value="Male">
public class FindControlLocateByCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// Instance of Web Driver for FireFox
		WebDriver driver = new FirefoxDriver();

		// open automation practice  page
		driver.get("https://demoqa.com/automation-practice-form");
		
		//locate first name textbox using cssSelector and id attribute
		WebElement firstName = driver.findElement(By.cssSelector("input[id= 'firstName']"));
		
		//type name in firstName box 
		firstName.sendKeys("Dhruv");
		
		//locate last name textbox using cssSelector and ID attribute symbol
		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
		
		//type name in firstName box 
		lastName.sendKeys("Patel");
		
		//locate current Address textbox using cssSelector and class name
		
		WebElement address = driver.findElement(By.cssSelector("textarea[class='form-control']"));
//		WebElement address1 = driver.findElement(By.cssSelector("textarea.form-control"));
		
		
		address.sendKeys("Ratnagiri, Maharashtra");
		
		//locate email using cssSelector and placeholder attribute
		WebElement email = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));
		
		//type email in email box
		email.sendKeys("abc@gmail.com");
		
		//locate mobile number text by combing Id and placeholder atribute
		//WebElement mobileNumber = driver.findElement(By.cssSelector("input[id='userNumber'][placeholder='Mobile Number']"));
		WebElement mobileNumber = driver.findElement(By.cssSelector("input#userNumber[placeholder='Mobile Number']"));
		//type mobile number 
		mobileNumber.sendKeys("1234567890");
		
		//locate male radio button by combining class and value attribute
		// MaleRadioButton = driver.findElement(By.cssSelector("input[class='custom-control-input'][value='Male']"));
		
		
		
	}

}
