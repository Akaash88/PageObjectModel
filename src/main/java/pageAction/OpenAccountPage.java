package pageAction;



import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import base.Page;

import pageLocators.OpenAccountLoc;

public class OpenAccountPage extends Page {

	OpenAccountLoc oaLoc;
	public OpenAccountPage() {
		this.oaLoc = new OpenAccountLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.oaLoc);
		}

	public void openAccount(String customerName, String Currency) {
		click(oaLoc.openAccountBtn);
		select(oaLoc.customerSelect, customerName);
		select(oaLoc.currencySelect, Currency);
		click(oaLoc.processBtn);
	}

}
