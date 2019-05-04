import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class LearningAssertions {

	@Rule
	public ErrorCollector ec=new ErrorCollector();
	
	@Test
	public void testTitle() {
		
		String actual_Title="Google.com";
		String expected_Title="Google Inc";
		
		System.out.println("starts comparing");
		
		try {
			Assert.assertEquals(actual_Title, expected_Title);
		} catch(Throwable t) {
			
			System.out.println("Error captured");
			ec.addError(t);
		} 
		
		
		System.out.println("End Comparing");
		
	}
}
