package SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week1_BackAndForward {
	public static void main(String[] args) throws InterruptedException{
	
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(200);
		driver.navigate().to("https://www.learnsdet.com");
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().forward();
		Thread.sleep(300);
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().refresh();
		Thread.sleep(300);
		driver.close();
		
		
	}
}
//Starts from google.com
//Navigate learnsdet.com
//Go back to Google
//Forward to learnsdet.com
//Go back to Google again and refresh the page
//Close the browser