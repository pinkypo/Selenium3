package stepdef;

import Config.Common;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	// anatation
	@Before
	public void beforeScenario() throws Exception 
	{
		System.out.println("*********Before scenario******");
		Common.launchBrowser();
	}
	@After
	public void afterScenario()
	{
		System.out.println("*********After scenario******");
		Common.closeBrowser();
	}

}
