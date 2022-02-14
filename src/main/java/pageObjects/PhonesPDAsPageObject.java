package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class PhonesPDAsPageObject  extends Base{
	public   PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//footer
	
	@FindBy(linkText=("About Us"))
	private WebElement abouUsFooter;
	
	@FindBy(linkText=("Delivery Information"))
	private WebElement deliveryInformationButtonFooter;
	
	@FindBy(linkText=("Terms & Conditions"))
	private WebElement termAndConditionButtonFooter;
	
	@FindBy(linkText=("Contact Us"))
	private WebElement contactUsButtonFooter;
	
	@FindBy(linkText=("Returns"))
	private WebElement reternsButtonFooter;
	
	@FindBy(linkText=("Site Map"))
	private WebElement siteMapButtonFooter;
	
	
	@FindBy(linkText=("Brands"))
	private WebElement brandButtonFooter;
	
	@FindBy(linkText=("Gift Certificates"))
	private WebElement giftCertificationButtonFooter;
	
	@FindBy(linkText=("Affiliate"))
	private WebElement affiliateButtonFooter;
	
	@FindBy(linkText=("Specials"))
	private WebElement specialsButtonFooter;
	
	@FindBy(xpath=("//a [text()='My Account']"))
	private WebElement myAccountButtonFooter;
	@FindBy(linkText=("Order History"))
	private WebElement orderHistoryButtonFooter;
	
	@FindBy(linkText=("Wish List"))
	private WebElement wishListFooter;
	
	@FindBy(linkText=("Newsletter"))
	private WebElement newslettertFooter;
	
	@FindBy(xpath = "//p[contains(text(),'Powered By ')]")
	private WebElement poweredByText;
}
