package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_01 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(" http://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='finish']")));

		WebElement element = driver.findElement(By.cssSelector("div[id='finish']"));
		String getText = element.getText();
		if (getText.equals("Hello World!")) {
			System.out.println("Text is :" + getText);

		} else {
			System.out.println("Text is wrong");

		}
		driver.quit();
	}

}
