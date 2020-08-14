package SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week_2_setValues {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(3000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        
        By input1= By.xpath("//input[@id='sum1']");
		  ElementUtil.getElement(driver, input1).sendKeys("2");
		  Thread.sleep(3000);
	    By input2= By.xpath("//input[@id='sum2']");
		  ElementUtil.getElement(driver, input2).sendKeys("1");
		  Thread.sleep(3000);
	    By getTotal = By.xpath("//button[contains(text(),'Get Total')]");
		  ElementUtil.clickOn(driver, getTotal);
		  
		  
		  String text = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
	
			if (text.equals("3")) {
				System.out.println("Text is corret");
			} else {
				System.out.println("Text is not correct ");
			}
		  ElementUtil.quitBrowser(driver);
		

	}

}
