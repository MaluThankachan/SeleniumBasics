package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorAmazonTag {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");// this is used to get the specified chrome driver
		//we use webdriver for common for all drivers if we give chrome driver it only uesd for chrome
		WebDriver driver = new ChromeDriver(); //run time polymorphism //connecting library with driver class
		//to go particular site
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement AllDropdown = driver.findElement(By.tagName("select"));
		AllDropdown.click();

	}

}
