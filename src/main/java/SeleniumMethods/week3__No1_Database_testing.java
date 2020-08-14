package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3__No1_Database_testing {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.testandquiz.com/selenium/testing.html");

		WebElement dropDown = driver.findElement(By.xpath("//*[@id='testingDropdown']"));

		selectDropDownValueByText(dropDown, "Database Testing");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.id("database"));
		boolean isSelected = text.isSelected();

		if (isSelected) {
			System.out.println("Database is selected");
		} else {
			System.out.println("Database is not selected");
		}

		driver.close();
	}

	public static void selectDropDownValueByText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

}
