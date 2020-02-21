package Week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterfaceExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String exePath = "./Resource/chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", exePath);
	      driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");	
		
	    
        driver.findElement(By.name("cusid")).sendKeys("13920");					
        driver.findElement(By.name("submit")).submit();	
        System.out.println("Git Change");
        		
        // Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
         System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
       // alert.accept();	
        
        alert.dismiss();

	}

}
