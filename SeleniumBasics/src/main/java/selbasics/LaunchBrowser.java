package selbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");// this is used to get the specified chrome driver
		//we use webdriver for common for all drivers if we give chrome driver it only uesd for chrome
		WebDriver driver = new ChromeDriver(); //run time polymorphism //connecting library with driver class
		//to go particular site
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		String title = driver.getTitle(); //return tab title of application
		System.out.println(title);
		// to get current url 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// to refresh the url
		driver.get("https://flipkart.com");
		System.out.println("Hello");

		
	}

}
