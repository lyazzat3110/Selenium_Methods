package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class week1_AlertHandling {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/Users/lyazzatm/Documents/Drivers/chromedriver");

			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
			
			
		driver.findElement(By.id("page")).click();
			Alert alert=driver.switchTo().alert();
//			
			String text = alert.getText();
			System.out.println(text);
//			if(text.equals("Please enter a valid user name")){
//				System.out.println("Correct text:"+text);
//			} else{
//				System.out.println("Incorrect text"+text);
//			}
//			
//			
//			//alert.dismiss(); //cancel
//			alert.accept(); //ok
			driver.quit();
			

	}

}
//Go to https://www.toolsqa.com/automation-practice-switch-windows/
//Find JavaScript Alert
//Handle alert
//Get text “Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.”
//Verify text