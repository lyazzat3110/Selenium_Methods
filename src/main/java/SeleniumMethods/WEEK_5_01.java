package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WEEK_5_01 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://demo.guru99.com/insurance/v1/index.php");

		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login = driver.findElement(By.name("submit"));

		JavaScriptUtil.flash(email, driver);
		email.sendKeys("Lyazzat3110@mail.ru");
		JavaScriptUtil.flash(password, driver);
		password.sendKeys("12345678");
		JavaScriptUtil.flash(login, driver);
		login.click();

		WebElement GetText = driver
				.findElement(By.xpath("//b[text()='Enter your Email address and password correct']"));

		JavaScriptUtil.drawBorder(GetText, driver);
		String text = GetText.getText();

		if (text.equals("Enter your Email address and password correct")) {
			System.out.println("Text is correct");
		} else {
			System.out.println("Text is not correct");
		}
		driver.close();
	}

}
