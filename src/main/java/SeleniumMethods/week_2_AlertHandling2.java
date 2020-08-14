package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ElementUtil;


public class week_2_AlertHandling2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		String url = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";

		By click = By.xpath("//button[@class='btn btn-default btn-lg']");

		driver = ElementUtil.launchBrowser(driver, "chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		ElementUtil.launchURL(driver, url);
		System.out.println(ElementUtil.getPageTitle(driver));
		ElementUtil.clickOn(driver, click);
		Thread.sleep(3000);

		String text = ElementUtil.getAlertText(driver);
		if (text.equals("Press a button!")) {
			System.out.println("Correct");
		} else {
			System.out.println("Incorrect");
		}
		Thread.sleep(3000);
		ElementUtil.quitBrowser(driver);

	}

}
