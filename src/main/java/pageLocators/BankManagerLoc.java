package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoc {
	
	@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
	public WebElement addCustomerBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	public WebElement openAccountBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Customers')]")
	public WebElement customersBtn;
	

}
