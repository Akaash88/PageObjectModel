package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountLoc {
	@FindBy(xpath = "//button[contains(text(),'Open Account')]")
	public WebElement openAccountBtn;

	
	@FindBy(xpath = "//select[@id='userSelect']")
	public WebElement customerSelect;
	
	@FindBy(xpath = "//select[@id='currency']")
	public WebElement currencySelect;
	
	@FindBy(xpath = "//button[contains(text(),'Process')]")
	public WebElement processBtn;
}
