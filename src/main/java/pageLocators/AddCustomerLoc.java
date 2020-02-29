package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerLoc {

	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@placeholder='Post Code']")
	public WebElement pincode;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement addCustBtn;

}
