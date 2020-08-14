package SeleniumMethods;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week4_06 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();

		driver.get("https://www.designmantic.com/");

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String currentURL = driver.getCurrentUrl();
		if (currentURL.equals("https://www.designmantic.com/")) {
			System.out.println("URL is verified");
		} else {
			System.out.println("URL is not verified ");
		}

		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.id("username")).sendKeys("lyazzat3110@mail.ru");
		driver.findElement(By.id("password")).sendKeys("12345689");

		driver.findElement(By.xpath("//input[@type = 'submit']")).click();

		WebElement verification = driver.findElement(By.cssSelector("div[class = 'alert alert-danger']"));

		String text = verification.getText();
		if (text.equals("Bad credentials.")) {
			System.out.println("Text is right");
		} else {
			System.out.println("Text is wrong");
		}
		driver.close();
	}

}