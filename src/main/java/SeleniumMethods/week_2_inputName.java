package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week_2_inputName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(3000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
		
		Thread.sleep(2000);
   		  By input= By.xpath("//input[@id='user-message']");
		  ElementUtil.getElement(driver, input).sendKeys("Hello");
		  Thread.sleep(3000);
		  
		  
	
	      By showMessage = By.xpath("//button[contains(text(),'Show Message')]");
		  ElementUtil.clickOn(driver,showMessage);
		  
		  Thread.sleep(5000);
		 
		  String text = driver.findElement(By.xpath("//div[@id='user-message']")).getText();

			if (text.equals("Your Message: Hello")) {
				System.out.println("Text is corret");
			} else {
				System.out.println("Text is not correct ");
			}
		  
		 ElementUtil.quitBrowser(driver);
		  
	     
			
		
		

	}

}
