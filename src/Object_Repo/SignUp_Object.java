package Object_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp_Object 
{
  WebDriver driver;
  
  By join=By.id("join_now");
  By email = By.name("email-or-phone");
  By password = By.id("password");
  By submit = By.id("join-form-submit");
  By firstname = By.name("first-name");
  By lastname = By.id("last-name");
  By contiune = By.id("join-form-submit");  
   
  public SignUp_Object(WebDriver driver)
  {
	this.driver=driver;  
  }
  
  
  public void joinpage() {
	  driver.findElement(join).click();
  }
  
  public void email(String emailid) {
	  driver.findElement(email).sendKeys(emailid);
	  
  }
  
  public void password(String pass) {
  driver.findElement(password).sendKeys(pass);
  }
  
  
  public void firstname(String first) {
	  driver.findElement(firstname).sendKeys(first);
	  
  }
  
  public void lastname(String last) {
  driver.findElement(lastname).sendKeys(last);
  }
  
  public void submit() 
  {
	   driver.findElement(submit).click();
  }
  
  public void contiune() 
  {
	 driver.findElement(contiune).click();
}
}


