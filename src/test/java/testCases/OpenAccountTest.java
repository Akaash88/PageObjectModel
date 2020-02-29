package testCases;

import org.testng.annotations.Test;

import base.Page;
import pageAction.OpenAccountPage;

public class OpenAccountTest {
	Page obj = new Page();
	
	@Test(dataProviderClass = base.Page.class,dataProvider = "dp")
	public void openAccountTest(String customerName, String Currency) throws Exception {
		OpenAccountPage oap = new OpenAccountPage();
		oap.openAccount(customerName, Currency);
		Thread.sleep(3000);
		
	}

}
