package SeleniumMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;


public class WEEK4_03 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		 WebElement option = driver.findElement(By.name("dropdown-class-example"));
		 option.click();
		  Select select = new Select(option);
		         select.selectByVisibleText("Option2");
		   driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		   
		   boolean isMultiple = select.isMultiple();

			if (isMultiple) {
				System.out.println("Multiple");
			} else {
				System.out.println("Single");
			}
		  
		 driver.close();
		
		
	}

}
