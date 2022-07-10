package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_Object
{
   WebDriver driver;
   By username = By.id("username");
   By passwod = By.id("password");
   By submit = By.xpath("//button[@type='submit']");   
   String title = "LinkedIn Login, Sign in | LinkedIn";
   
   public Login_Object(WebDriver driver)
   {
	   this.driver=driver;
   }
		   
   public void login(String user, String pass)
   {
	   driver.findElement(username).sendKeys(user);
	   driver.findElement(passwod).sendKeys(pass);
	   
   }
   
   public void submit() 
   {
	   driver.findElement(submit).click();
   }

   public void checktitle() 
   {
         String Title = driver.getTitle().trim();
         Assert.assertEquals(title, Title);
   }
}
