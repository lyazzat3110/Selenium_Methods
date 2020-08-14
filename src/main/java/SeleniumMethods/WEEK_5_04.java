package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEEK_5_04 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" http://demo.guru99.com/test/upload/");
		driver.findElement(By.name("uploadfile_0")).sendKeys("/Users/lyazzatm/Desktop/ISTQB.pdf");
		WebElement accept = driver.findElement(By.id("terms"));
		accept.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		driver.quit();
	}

}
