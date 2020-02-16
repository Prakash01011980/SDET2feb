package Week4;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Listeners(Week4.ListnerClass.class)
public class ListnerDemo {

	@Test
	public void Test1()
	{
		System.out.print("Test1");
	}
	
	@Test
	public void Test2()
	{
		//Assert.fail();
		//SoftAssert osft = new SoftAssert();
		
		Assert.assertEquals("Fail", "1", "2");
		Assert.assertEquals("Fail", "4", "2");
		
//		osft.assertEquals("2", "2");
//		
//		osft.assertEquals("3", "2");
//		osft.assertEquals("3", "3");
//		osft.assertAll();
		
				
	}
	
	@Test
	public void Test3()
	{
		System.out.print("Test3");
	}
}
