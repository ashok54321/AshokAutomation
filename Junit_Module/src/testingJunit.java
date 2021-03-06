import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testingJunit {

	
	public static boolean dbConnection() {
		return true;
	}
	@BeforeClass
	public static void SeleniumSetup() {
		System.out.println("setting up selenium server");
		Assume.assumeTrue(dbConnection());
	}
	@Before
	public void testOpenBrowser() {
		System.out.println("Opening browser");
	}
	
	@Test
	public void testNavigation() {
		System.out.println("opening the website");
	}
	
	@Test
	public void loginDetails() {
		System.out.println("login successfully..!");
	}
	
	@After
	public void testCloseBrowser() {
		System.out.println("Closing browser");
	}
	
	@AfterClass
	public static void SeleniumShutdown() {
		System.out.println("shutting down selenium server");
	}
}
