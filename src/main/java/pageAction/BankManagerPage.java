package pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pageLocators.BankManagerLoc;


public class BankManagerPage extends Page {
	
	BankManagerLoc bnkmnanger;
	public BankManagerPage() {
		this.bnkmnanger = new BankManagerLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.bnkmnanger);
		}

	public AddCustomerPage gotoAddCustomer() {
		click(bnkmnanger.addCustomerBtn);
		return new AddCustomerPage();
		
	}
	
	public void gotoOpenAccount() {
		click(bnkmnanger.openAccountBtn);
	}
	
	
	public void gotoCustomers() {
		click(bnkmnanger.customersBtn);
	}
	

}
