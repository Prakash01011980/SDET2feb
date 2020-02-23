package Week6;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class FirstFlow {
	
  WebDriver driver;
  
  @Test
  public void LoginPageValidation() {
	  
	  
	  String exePath = "./Resource/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);
      driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  List<WebElement> MyLinks=driver.findElements(By.tagName("a"));
	  
	  for(int i = 0 ; i<MyLinks.size();i++)
	  {
		  System.out.print("--->"+MyLinks.get(i).getText());
	  
	  
	  }
	  
  for(WebElement a: MyLinks)
  {
	  System.out.print("--->"+a.getText());
  }
  
  }
  
  
  
  
  
  //@Test
  public void pagetitle() throws InterruptedException
  {
//	  String Title;	  
//	  Title = driver.getTitle();
//	  System.out.println("*Page title is*"+Title);
//	  //Assert.assertArrayEquals("OrangeHRM", Title);
//	  Assert.assertEquals("*Title is not matching*", "OrangeHRM", Title);
//	  
//	  Thread.sleep(10000);
//	  System.out.print("Debug1");
//	//  System.out.print("\frame count-->"+driver.findElement(By.tagName("iframe")).getSize());
//		 
//	 // driver.switchTo().frame(2);
//	 // driver.switchTo().defaultContent();	  
//	  
//	 // Thread.sleep(8000);
//	  
//	 // String str = driver.findElement(By.cssSelector("#MP_link")).getText();
//	  WebElement el = driver.findElement(By.cssSelector("#MP_link"));
//	  
//	  
//	  System.out.println("Button value--->"+el.getAttribute("value"));
//	  System.out.print("Debug2"); 
//	 
//	 //Define action class object
//	 Actions actions = new Actions(driver);
//	 System.out.print("Debug3"); 
//     WebElement menuOption = driver.findElement(By.xpath(".//a[@id='menu_admin_viewAdminModule']"));
//     System.out.print("Debug4");
//     
//     //Performed my action
//     actions.moveToElement(menuOption).perform();
//	  
  }
  
//  @Test
//  public void ActionClassExample() throws InterruptedException
//  {
//	 
//   
////   
//  }
//  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
