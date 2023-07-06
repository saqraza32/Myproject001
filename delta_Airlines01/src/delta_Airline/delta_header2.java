package delta_Airline;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class delta_header2 {
	@Test
	public void travel_info() {
		
		WebDriverManager.chromedriver().setup(); 
		 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://google.com");
			driver.manage().window().maximize();
			driver.get("http://delta.com");
			
	Actions m = new Actions (driver);
	WebElement move=driver.findElement(By.xpath("//a[@id='headSectab1']"));
		m.moveToElement(move).build().perform();
	
	
	}

}
