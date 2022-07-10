package TestCases;

import org.testng.annotations.Test;

import Object_Repo.Login_Object;
import Object_Repo.SignUp_Object;

import org.testng.annotations.BeforeTest;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class LoginTest {
 String key = "webdriver.chrome.driver";
 String value = "E:\\Software\\Selenium\\chromedriver.exe";
 WebDriver driver;
 String baseurl = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
 Login_Object l;
 
	
  @BeforeTest
  public void beforeTest()
  {
	  ChromeOptions options = new ChromeOptions();

	  options.setExperimentalOption("excludeSwitches",

	       Arrays.asList("disable-popup-blocking"));
  
	  System.setProperty(key, value);
	  driver = new ChromeDriver(options);
	  driver.manage().window().maximize();
	  driver.get(baseurl);
	  driver.manage().deleteAllCookies();
	 
  }
  
  
  
  @Test (priority = 2) 
  public void Login() 
  {
     l = new Login_Object(driver);	

	 l.login("Nikhiravi9847@gmail.com", "{Bc130075}");
	 l.submit();
	 System.out.println(driver.getTitle());
  }
  
  @Test (priority = 1)
  public void Title() {
	  
	  l = new Login_Object(driver);	
	  l.checktitle();
  }
 
  

  @AfterTest
  public void afterTest() 
  {
	  
//   driver.quit();
  }

}
