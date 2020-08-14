package SeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class week_2_AlertHandling1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/lyazzatm/Documents/Drivers/chromedriver");
        WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		
		
		if(text.equals("I am an alert box!")){
			System.out.println("Correct:"+text);
		} else{
			System.out.println("Incorrect:"+text);
		}
		
		Thread.sleep(2000);
		alert.accept();
		driver.quit();
		
	
		

	}

}
