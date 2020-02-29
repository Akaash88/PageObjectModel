package testCases;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;
import pageAction.AddCustomerPage;
import pageAction.HomePage;

public class BankMangerLoginTest {
	 Page obj = new Page();
	@BeforeTest
	public void setUp() {
		
		obj.init_Browser();
	}
	
	@Test(dataProviderClass = base.Page.class,dataProvider = "dp")
	public void bankManagerLogin(String firstName , String lastName,String pincode) {
		HomePage hp = new HomePage();
		AddCustomerPage acp = hp.bankManagerLogin().gotoAddCustomer();
		acp.addCustomer(firstName, lastName, pincode);
		
		
	}
	
	@AfterTest
	public void tearDown() {
		obj.tearDown();
	}
	
	
}
