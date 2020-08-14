package SeleniumMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class week_2_screenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.com/");
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("/Users/lyazzatm/Desktop/Srceenshots/pic.png"));
        
        
        
        driver.get("https://siliconelabs.com/");
		
		File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot2, new File("/Users/lyazzatm/Desktop/Srceenshots/pic.png"));
        
        driver.get("https://udemy.com/");
		
		File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot3, new File("/Users/lyazzatm/Desktop/Srceenshots/pic.png"));
        
        driver.quit();
        

	}

}
