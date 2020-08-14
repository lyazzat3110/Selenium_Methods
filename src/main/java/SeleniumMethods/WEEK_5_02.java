package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WEEK_5_02 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" http://demo.guru99.com/payment-gateway/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavaScriptUtil.specificScrollPageDown(driver);

		WebElement getPrice = driver.findElement(By.cssSelector("h3[style]"));
		String price = getPrice.getText();
		if (price.equals("Price: $20")) {
			System.out.println("price is correct");
		} else {
			System.out.println("Price is not correct");
		}

		WebElement select = driver.findElement(By.cssSelector("select[name='quantity']"));
		select.click();
		Select quantity = new Select(select);
		quantity.selectByIndex(2);

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		String finalPrice = driver.findElement(By.cssSelector("div[class='6u 12u$(xsmall)']")).getText();
		System.out.println(finalPrice);

		if (finalPrice.equals("Pay Ammount $60.00")) {
			System.out.println("Text is correct");
		} else {
			System.out.println("Text is not correct");
		}
		driver.close();

	}

}
