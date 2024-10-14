package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement emailidfield = driver.findElement(By.id("email")); // to identify web element
		emailidfield.click();
		emailidfield.sendKeys("testdata");
		//Am adding a new statement
		driver.close();
	}

}
