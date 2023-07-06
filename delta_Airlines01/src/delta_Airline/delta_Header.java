package delta_Airline;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;




public class delta_Header {
@Test
@Epic(value="Smoke Suite")
@Feature(value="Menu Module")
@Story(value="ID-003 - This is Story ID")
	public void book() throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		 WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://google.com");
			driver.manage().window().maximize();
			driver.get("http://delta.com");
		driver.findElement(By.xpath("//a[@id='headPrimary1']")).click();
		driver.findElement(By.xpath("//a[@id='fromAirportName']")).click();
		driver.findElement(By.cssSelector("input[id='search_input']")).clear();
		driver.findElement(By.cssSelector("input[id='search_input']")).sendKeys("Bwi");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Baltimore, MD ']")) );
		driver.findElement(By.cssSelector("input[id='search_input']")).sendKeys(Keys.ENTER);

		
		//driver.findElement(By.xpath("//a[@id='toAirportName']")).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='toAirportName']")).sendKeys("IAD");
		
		driver.findElement(By.xpath("//a[@id='toAirportName']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//button[contains(@class,'search-flyout-close float-right d-none d-')]")).click();
		
		driver.findElement(By.xpath("//span[@id='selectTripType-val']")).click();
		driver.findElement(By.xpath("//li[@id='ui-list-selectTripType1']")).click();
		driver.quit();
	
}@Test
	public void checkin() 

{
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.get("http://delta.com");
	driver.findElement(By.id("headPrimary2")).click();
	driver.findElement(By.id("searchType-val")).click();
	driver.findElement(By.id("ui-list-searchType1")).click();
driver.findElement(By.cssSelector("input[id='creditcardNumber']")).sendKeys("1236459874136");
driver.findElement(By.id("lastName")).sendKeys("Naresh");
driver.findElement(By.id("departureAirportLink")).click();
//WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("BWI");
//driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys(Keys.ENTER);
//Actions obj = new Actions(driver);
//obj.click(driver.findElement(By.xpath("//span[text()=' Baltimore, MD ']")))
//.build().perform();
driver.findElement(By.xpath("//span[text()=' Baltimore, MD ']")).click();
driver.quit();
}
@Test
public void myTrips() {
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.get("http://delta.com");
	driver.findElement(By.xpath("//a[@id='headPrimary3']")).click();
driver.findElement(By.cssSelector("span[class='select-ui-wrapper focusable-element']")).click();
	driver.findElement(By.xpath("//li[@id='ui-list-searchOption2']")).click();
	driver.findElement(By.xpath("//input[@id='eTicketNo']")).click();
	
	driver.findElement(By.xpath("//input[@id='eTicketNo']")).sendKeys("12365412365");
	driver.findElement(By.xpath("//input[@id='firstName']")).click();
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Naresh");
driver.findElement(By.xpath("//input[@id='lastName']")).click();
driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Bolay to Bhai log");
driver.quit();


}@Test
public void flight_Status() {
	
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://google.com");
	driver.manage().window().maximize();
	driver.get("http://delta.com");
	driver.findElement(By.xpath("//a[@id='headPrimary4']")).click();
	driver.findElement(By.cssSelector("div[id='input_departureDate_1']")).click();
driver.findElement(By.xpath("//a[contains(@class,'dl-state-default dl-selected-date dl-departure')]")).click();
driver.findElement(By.xpath("//button[@class='donebutton']")).click();
driver.findElement(By.cssSelector("input[id='flightNo']")).click();

driver.findElement(By.cssSelector("input[id='flightNo']")).sendKeys("102");
driver.findElement(By.xpath("//button[@id='btn-flight-sts-submit']")).click();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='errorMassage']"))).getText());

//System.out.println(driver.findElement(By.xpath("//div[@id='errorMassage']")).getText());
System.out.println("hello From Naresh");
driver.quit();
	
	
	
	
}
	
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//delta_Header header= new delta_Header();
		//header.book();
       // header.checkin();
      //  header.myTrips();
      // header.flight_Status();
     // delta_header2 hdr =new delta_header2();
	//hdr.travel_info();
	}


