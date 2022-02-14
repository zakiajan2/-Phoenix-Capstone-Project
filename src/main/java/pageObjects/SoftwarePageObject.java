package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class SoftwarePageObject extends Base {
	public   SoftwarePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='dropdown-menu']")//completed
	private WebElement currencyButton;
	
	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement websitePhone;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountButton;
	
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishListButton;
	
	@FindBy(xpath= "//span[text()='Shopping Cart']")
	private WebElement shoppingCartButton;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkoutButton;
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartButton;
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement desktopButton;
	
	@FindBy(xpath="//a[text()='PC (0)']")
	private WebElement pcButton;
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	private WebElement macButton;
	
	@FindBy(xpath="//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsButton;
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")///////////////////////
	private WebElement laptopsAndNotebooksButton;
	
	
	
	@FindBy(xpath="//a[text()='Components']")
	private WebElement componentsBatton;
	
	@FindBy(xpath="//a[text()='Tablets']")
	private WebElement tabletsBatton;
	
	@FindBy(xpath="//a[text()='Software']")
	private WebElement softwareBatton;
	
	@FindBy(xpath="//a[text()='Phones & PDAs']")
	private WebElement phoneAndPDAsBatton;
	
	@FindBy(xpath="//a[text()='Cameras']")
	private WebElement camerasBatton;
	
	@FindBy(xpath="//a[text()='MP3 Players']")
	private WebElement mp3PlayersBatton;///////////
	
	@FindBy(tagName = "h2")
	private WebElement softwareText;
	
	@FindBy(xpath = "//p[contains(text(),'There')]")
	private WebElement thereAreNoproductText;
	
	@FindBy(linkText=("Continue"))
	private WebElement continueButton;
	//leftbar
	
	@FindBy(xpath = "//div[@class='list-group']//a[1]")
	private WebElement desktop13;
	
	@FindBy(xpath = "//div[@class='list-group']//a[2]")
	private WebElement LaptopsAndNotebooks5;
	@FindBy(xpath = "//div[@class='list-group']//a[3]")
	private WebElement Components2;
	
	
	@FindBy(xpath = "//div[@class='list-group']//a[4]")
	private WebElement Tablets1;
	
	@FindBy(xpath = "//div[@class='list-group']//a[5]")
	private WebElement Software0;
	
	@FindBy(xpath = "//div[@class='list-group']//a[6]")
	private WebElement PhonesAndPDAs3;
	
	@FindBy(xpath = "//div[@class='list-group']//a[7]")
	private WebElement Cameras2;
	
	@FindBy(xpath = "//div[@class='list-group']//a[8]")
	private WebElement MP3Players4;
	
	@FindBy(xpath = "//div[@class='swiper-viewport']")
	private WebElement picture;
	
	
	
	////footer
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
	private WebElement footageText;
	
}
