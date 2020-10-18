package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ElementUtil;


public class week_2_AlertHandling3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";

		By click = By.xpath("//button[contains(text(),'Click for Prompt Box')]");

		driver = ElementUtil.launchBrowser(driver, "chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		ElementUtil.launchURL(driver, url);
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clickOn(driver, click);
		Thread.sleep(3000);

		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Please enter your name")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		Thread.sleep(3000);
		ElementUtil.quitBrowser(driver);

	}
}
