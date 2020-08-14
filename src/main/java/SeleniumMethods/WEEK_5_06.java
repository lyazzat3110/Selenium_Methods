package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WEEK_5_06 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		JavaScriptUtil.specificScrollPageDown(driver);
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Lyazzat");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Mukhamadiyeva");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("12387654");
		driver.findElement(By.id("userName")).sendKeys("Lyazzat3110");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("3080 Voorhies ave.");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Brooklyn");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("New York");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("11235");

		WebElement country = driver.findElement(By.cssSelector("select[name='country']"));
		Select select = new Select(country);
		select.selectByVisibleText("UNITED STATES");
		driver.findElement(By.id("email")).sendKeys("Lyazzat3110");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("112345678");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("112345678");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		System.out.println(
				"Dear Lyazzat Mukhamadiyeva,Thank you for registering. You may now sign-in using the user name and password you've just entered.");
		driver.close();
	}

}
