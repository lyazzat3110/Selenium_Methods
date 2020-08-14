package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3__No3_MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" https://www.testandquiz.com/selenium/testing.html");

		WebElement dropDown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select select = new Select(dropDown);
		boolean isMultiple = select.isMultiple();

		if (isMultiple) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
