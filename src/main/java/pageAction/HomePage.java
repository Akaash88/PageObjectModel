package pageAction;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;
import pageLocators.HomePageLocators;

public class HomePage extends Page{
	
	HomePageLocators hpLoc;
	
	public HomePage() {
		this.hpLoc = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.hpLoc);
		}

	public void customerLogin() {
		click(hpLoc.customerLoginBtn);
		
	}
	
	public BankManagerPage bankManagerLogin()  {
		click(hpLoc.bankManagerLoginBtn);
		return new BankManagerPage();
	}
}
