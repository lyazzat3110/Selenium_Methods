package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_No6_Verizonwireless {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" https://www.verizonwireless.com/");
         System.out.println(driver.getTitle());
         Thread.sleep(3000);
		WebElement phoneMenu = driver.findElement(By.xpath("//button[text()='Phones list']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(phoneMenu).build().perform();

		By smartPhone = By.xpath("//a[@id='thirdLevel00']");
		WebElement locator = driver.findElement(smartPhone);
		locator.click();

		WebElement name = driver.findElement(By.xpath("//a[@aria-label='Apple iPhone 11']"));
		name.click();
		Thread.sleep(3000);
		String name2 = driver.findElement(By.cssSelector("span[role='text']")).getText();

		if (name2.equals("Apple iPhone 11")) {
			System.out.println("Text is corret");
		} else {
			System.out.println("Text is not correct ");
		}

	}

}
