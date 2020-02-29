package pageAction;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import base.Page;

import pageLocators.TopNavigationLocators;

public class TopNavigation   {
	TopNavigationLocators topNav;
	
	public TopNavigation(WebDriver driver) {
		this.topNav = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.topNav);
		}
	public  void gotoHomePage() {
		Page.click(topNav.home);
	}
	
	
}