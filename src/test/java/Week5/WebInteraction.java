package Week5;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class WebInteraction extends Webdriverdefinition
{
	@Test(priority=1)
	public void login_OrangeHRM()
	{		
		getdriver().get("https://opensource-demo.orangehrmlive.com/");
		getdriver().findElement(By.cssSelector("[name=txtUsername]")).sendKeys("Admin");
		getdriver().findElement(By.cssSelector("[name=txtPassword]")).sendKeys("admin123");
		getdriver().findElement(By.cssSelector("[name='Submit']")).click();	
	}
	
	@Test(priority=2)
	public void loginHRM_GetTitle()
	{
		String Title;
		Title = getdriver().getTitle();
		System.out.print("Title--"+Title);		
		
	}
}