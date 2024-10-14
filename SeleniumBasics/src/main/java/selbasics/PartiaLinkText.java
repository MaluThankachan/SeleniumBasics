package selbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiaLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		WebElement forgetPasswordPartialLinkText = driver.findElement(By.partialLinkText("Forgot p"));
		forgetPasswordPartialLinkText.click();
	}

	

}
