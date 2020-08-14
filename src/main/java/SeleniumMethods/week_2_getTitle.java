package SeleniumMethods;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week_2_getTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(2000);

		By name = By.name("name");
		ElementUtil.getElement(driver, name).sendKeys("Lyazzat");
		Thread.sleep(3000);
		By input2 = By.className("validate[required,custom[email]]");
		ElementUtil.getElement(driver, input2).sendKeys("lyazzat3110@gmail.com");
		Thread.sleep(3000);
		By input3 = By.name("telephone");
		ElementUtil.getElement(driver, input3).sendKeys("7865904378");
		Thread.sleep(3000);

		By input4 = By.xpath("//a[@class='dt-btn dt-btn-m dt-btn-submit']");
		ElementUtil.clickOn(driver, input4);
		Thread.sleep(3000);

		String text = driver.findElement(By.className("formErrorContent")).getText();

		if (text.equals("Feedback has been sent to the administrator")) {
			System.out.println("Text is corret");
		} else {
			System.out.println("Text is not correct ");
		}

		driver.quit();

	}

}
