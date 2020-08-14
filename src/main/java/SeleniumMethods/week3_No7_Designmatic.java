package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week3_No7_Designmatic {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.designmantic.com/");
		WebElement step1 = driver.findElement(By.id("selectservice"));
		WebElement step2 = driver.findElement(By.id("company_name"));
		WebElement step3 = driver.findElement(By.id("details_categories"));

		Select select1 = new Select(step1);
		select1.selectByVisibleText("Business Card");
		Thread.sleep(3000);
		step2.sendKeys("SiliconeLabs");
		Thread.sleep(3000);
		Select select3 = new Select(step3);
		select3.selectByVisibleText("Information Technology");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='btnlogo2']")).click();
		Thread.sleep(3000);
		driver.close();

	}
}
