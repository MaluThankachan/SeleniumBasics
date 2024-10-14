package selbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");// this is used to get the specified chrome driver
		//we use webdriver for common for all drivers if we give chrome driver it only uesd for chrome
		WebDriver driver = new ChromeDriver();
		//if we use get the data will be cleared but if we use navigate previous cache ll be saved
		driver.navigate().to("https://www.flipkart.com/");//got to flipkart
		driver.navigate().to("https://www.ebay.com");// from flipkart go to new ebay window
		driver.navigate().back();//back to flipkart
		driver.navigate().forward();//back to ebay
		driver.navigate().refresh();
		driver.quit();//all tabs will be closed
		driver.close();//only current tab will be closed if multiple tabs are there
	}

}
