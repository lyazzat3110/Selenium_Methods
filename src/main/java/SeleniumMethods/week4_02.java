package SeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class week4_02 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		Alert alert  = driver.switchTo().alert();
		      alert.accept();
	
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alert2  = driver.switchTo().alert();
		      alert2.dismiss();
		    
     	driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
		Alert alert3  = driver.switchTo().alert();
		      alert3.sendKeys("Lyazzat");
		      alert3.accept();
		     
		driver.close();
		
		
	}
	
}
