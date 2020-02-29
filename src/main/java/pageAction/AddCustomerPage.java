package pageAction;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import base.Page;
import pageLocators.AddCustomerLoc;


public class AddCustomerPage extends Page{
	AddCustomerLoc acLoc;
	public AddCustomerPage() {
		this.acLoc = new AddCustomerLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.acLoc);
		}

	public OpenAccountPage addCustomer(String firstName, String  lastName, String pincode) {
		type(acLoc.firstName, firstName);
		type(acLoc.lastName, lastName);
		type(acLoc.pincode, pincode);
		click(acLoc.addCustBtn);
		alert_accept();
		return new OpenAccountPage();
		}
	}

