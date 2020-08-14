package SeleniumMethods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WEEK_5_05 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(" http://demo.guru99.com/test/ajax.html");
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
    	driver.findElement(By.id("yes")).click();
        driver.findElement(By.cssSelector("input[type='reset']")).click();
        driver.findElement(By.id("no")).click();
        driver.findElement(By.id("buttoncheck")).click();
        
        driver.quit();
	}

}
