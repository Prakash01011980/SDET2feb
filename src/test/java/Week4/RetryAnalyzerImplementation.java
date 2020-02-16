package Week4;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class RetryAnalyzerImplementation {
	
	
	@Test(retryAnalyzer=Week4.RetryTest.class)
	public void Test1()
	{		
		Assert.fail();
	}

}
