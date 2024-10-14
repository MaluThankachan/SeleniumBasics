package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorFullExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");// this is used to get the
																								// specified chrome
																								// driver
		// we use webdriver for common for all drivers if we give chrome driver it only
		// uesd for chrome
		WebDriver driver = new ChromeDriver(); // run time polymorphism //connecting library with driver class
		// to go particular site
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement emailidfield = driver.findElement(By.id("email")); // to identify web element
		emailidfield.click();
		emailidfield.sendKeys("testdata");
		emailidfield.clear();
		WebElement passwordid = driver.findElement(By.name("pass"));
		passwordid.sendKeys("password123");
		// passwordid.clear();
		// uniqueness in locators id then name, classname(not trustable)

	}

}
