package SeleniumMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3__No2_printOutAllValues {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" https://www.testandquiz.com/selenium/testing.html");

		selectAllValue();
		driver.close();

	}

	public static void selectAllValue() {

		List<WebElement> dropList = driver.findElements(By.xpath("//*[@id='testingDropdown']"));
		for (int i = 0; i < dropList.size(); i++) {

			String text = dropList.get(i).getText();
			System.out.println(text);
		}

	}
}
