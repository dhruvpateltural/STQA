package takingScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.*;

public class TakingScreenShot{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Applications\\Selenium_Setup\\geckodriver.exe");

		// create web driver instance
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		//setting screenshot capability of browser
		TakesScreenshot srShot = ((TakesScreenshot)driver);
		
		//taking screenshot
		File srcFile = srShot.getScreenshotAs(OutputType.FILE);
		
		//print location of file
		System.out.println(srcFile.getAbsolutePath());
		
		File desFile = new File("D:\\Flight_Reservation");
		
		Files.copy(srcFile.toPath(), desFile.toPath());
		
	}
}
