import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Create_Lead 
{
static
{
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\Software\\Selenium\\chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException 
{
	// TODO Auto-generated method stub
	 WebDriver driver = new ChromeDriver();
		//to wait 5 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://distrigoboostqa.izdemosite.com/");
		//To login to Distrigo care
	    driver.findElement(By.name("_username")).sendKeys("P726647");
	    driver.findElement(By.name("_password")).sendKeys("ESTU@1652");
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    
	    Thread.sleep(5000);
	   //To navigate to the marketing menu by hovering
	   WebElement marketing =  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a"));
	   Actions act = new Actions(driver);
	   //to hove over and to click on the leads.
	   act.moveToElement(marketing).moveToElement(driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/ul/li[3]/a"))).click().build().perform();
	   //WebDri 
	   //to click on the create button
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div/a[@class='btn main-group btn-primary pull-right ']"))));
	   driver.findElement(By.xpath("//div[@class='btn-group']/a")).click();
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class='datepicker-input hasDatepicker']"))));
	   driver.findElement(By.xpath("//input[@class='datepicker-input hasDatepicker']")).click();

	    
		
				
		
		
		
		

}
}