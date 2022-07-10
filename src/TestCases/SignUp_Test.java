package TestCases;

import org.testng.annotations.Test;

import Object_Repo.SignUp_Object;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SignUp_Test 
{
	String key = "webdriver.chrome.driver";
	 String value = "E:\\Software\\Selenium\\chromedriver.exe";
	 WebDriver driver;
	 String baseurl = "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
	 SignUp_Object s;
	 
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty(key, value);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseurl);
  }

  @Test (priority = 3)  
  public void signup()
{
   s = new SignUp_Object(driver);
   s.joinpage();
   s.email("nikhik123@gmail.com");
   s.password("test123");
   s.submit();
  
}

@Test (priority = 4)  
public void contiune()
{
	s = new SignUp_Object(driver);
	s.firstname("Nikhil");
	s.lastname("Ravi");
	s.contiune();
}
  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
