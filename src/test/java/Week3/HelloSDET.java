package Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSDET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver ;
//		// TODO Auto-generated method stub E:\chromedriver_win32
//		String exePath = "./Resource/chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", exePath);
//		//ChromeDriver object creation
//		driver=new ChromeDriver();
//		//Maximizing  window
//		driver.manage().window().maximize();
//		driver.get("http://www.google.com");
//		driver.findElement(By.name("q")).sendKeys("Prakash");
		
		 WebDriver driver ;
	        // TODO Auto-generated method stub E:\chromedriver_win32
	        String exePath = "./Resource/chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", exePath);
	        //ChromeDriver object creation
	        driver=new ChromeDriver();
	        //Maximizing  window
	    driver.manage().window().maximize();    
	    driver.get("http://www.google.com");
	    
	    WebElement element;
	    element = driver.findElement(By.name("n"));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '" + "Test" +"')", element);
	    try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    //driver.findElement(By.name("q")).sendKeys("Prakash");

	}

}
