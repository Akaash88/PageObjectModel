package rough;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Page;
import pageAction.AddCustomerPage;
import pageAction.HomePage;

public class BankMangerLoginTest {
	 
	public static void main(String[] args) {
		Page obj = new Page();
		obj.init_Browser();
		HomePage hp = new HomePage();
		AddCustomerPage acp = hp.bankManagerLogin().gotoAddCustomer();
		acp.addCustomer("Akash", "R", "562107");
		
	}
	
}
	

		
	
