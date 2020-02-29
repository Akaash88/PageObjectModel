package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	@FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
	public WebElement bankManagerLoginBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
	public WebElement customerLoginBtn;
}
