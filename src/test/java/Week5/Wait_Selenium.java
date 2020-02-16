package Week5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import Week5.CustomWait;

public class Wait_Selenium {
	
 WebDriver driver = null;
 //WebDriverWait wait = null;
 CustomWait CW = new CustomWait();
 
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
	
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  
	  String exePath = "./Resource/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);				
	  driver = new ChromeDriver();
	
	  driver.get("https://opensource-demo.orangehrmlive.com/");

	  CW.isElementPresnt(driver, ".//*[@name='txtUsername']", 20).sendKeys("Admin");
	  
	  driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("admin123");
	  driver.findElement(By.cssSelector("[id='btnLogin']")).click();
 
  

}
}

