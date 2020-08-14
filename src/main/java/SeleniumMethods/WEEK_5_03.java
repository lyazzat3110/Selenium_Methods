package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.JavaScriptUtil;
import io.github.bonigarcia.wdm.WebDriverManager;


public class WEEK_5_03 {

	public static void main(String[] args)  {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("  http://demo.guru99.com/payment-gateway/process_purchasetoy.php");
		JavaScriptUtil.specificScrollPageDown(driver);
		
		
		WebElement cardNo = driver.findElement(By.id("card_nmuber"));
		cardNo.sendKeys("1234567890");
		WebElement expirationMonth = driver.findElement(By.id("month"));
		expirationMonth.click();
		Select month = new Select(expirationMonth);
		month.selectByIndex(3);
		WebElement expirationYear = driver.findElement(By.id("year"));
		expirationYear.click();
		Select year = new Select(expirationYear);
		year.selectByIndex(5);
		WebElement cvvCode = driver.findElement(By.id("cvv_code"));
		cvvCode.sendKeys("234");
		
		driver.switchTo().frame(0);
		 driver.findElement(By.id("closeBtn")).click();
		  driver.switchTo().defaultContent();
		
		WebElement pressButton = driver.findElement(By.cssSelector("input[name='submit']"));
		pressButton.click();
		
       
		Alert alert=driver.switchTo().alert();
		String text = alert.getText();
		alert.accept();
		
		if(text.equals("Check card number is 16 digits!")){
			System.out.println("Correct text: "+text);
		} else{
			System.out.println("Incorrect text: "+text);		
		
		}
		
		driver.quit();
	   	
	}

}
