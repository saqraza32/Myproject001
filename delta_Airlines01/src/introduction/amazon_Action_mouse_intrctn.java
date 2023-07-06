package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class amazon_Action_mouse_intrctn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		Actions w = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		w.moveToElement(move).keyDown(Keys.DOWN).click().build().perform();
		w.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
