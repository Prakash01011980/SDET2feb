package Week3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSDET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		// TODO Auto-generated method stub E:\chromedriver_win32
		String exePath = "./Resource/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		//ChromeDriver object creation
		driver=new ChromeDriver();
		//Maximizing  window
//		driver.manage().window().maximize();
//		driver.get("http://www.google.com");

	}

}
