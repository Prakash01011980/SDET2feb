package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void Login()
	{
		String exePath = "./Resource/chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", exePath);
	      driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		 	  
		  driver.findElement(By.cssSelector("[name='txtUsername']")).sendKeys("Admin");	
		  driver.findElement(By.cssSelector("[name='txtPassword']")).sendKeys("admin123");
		  driver.findElement(By.cssSelector("[id='btnLogin']")).click();
		  
			wait =new WebDriverWait(driver, 20);

			WebElement webelementlink; 

			webelementlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[alt='OrangeHRM']")));
			
			driver.getTitle();
	}
	
	@Test
	public void Dashboard()
	{
		//Explicitwait on Image
//		wait =new WebDriverWait(driver, 20);
//
//		WebElement webelementlink; 
//
//		webelementlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[alt='OrangeHRM']")));
//		
//		driver.getTitle();
	}

}
