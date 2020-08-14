package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_No4_HandlingAlertBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.xpath("//*[contains(text(),'Generate Alert Box')]")).click();
		Thread.sleep(3000);
	     getAlert(driver);
	     Thread.sleep(3000);
		  driver.close();
	}

	public static void getAlert(WebDriver driver) {
		Alert alert  = driver.switchTo().alert();
		alert.accept();
		
		
}
}