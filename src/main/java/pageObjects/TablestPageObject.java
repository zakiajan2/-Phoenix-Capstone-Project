package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;

public class TablestPageObject extends Base{
	public  TablestPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//ul[@class='dropdown-menu']")
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
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
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
	private WebElement mp3PlayersBatton;//////////////
	
	@FindBy(linkText=("//i[@class='fa fa-home']"))
	private WebElement backToHomePageButton;
	
	@FindBy(linkText=("Tablets"))
	private WebElement tabletsButton;
	
	@FindBy(tagName = "h2")
	private WebElement tabletsText;
	
	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement list;
	
	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement grid;
	
	
	
	
	@FindBy(xpath = "//select[@id='input-sort']//option")
	private WebElement sortBydropDown;
	
	@FindBy(xpath = "//img[@alt='Samsung Galaxy Tab 10.1']")
	private WebElement sumsungGalaxytabPicture;
	
	@FindBy(linkText=("Samsung Galaxy Tab 10.1"))
	private WebElement sumsungGalaxytabText;
	
	@FindBy(xpath = "//p[contains(text(),'Samsung')]")
	private WebElement sumsungGalaxyDescription;
	
	@FindBy(xpath = "//p[@class='price']")
	private WebElement priceSumsungGalaxy;
	
	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCartSumsungGalaxy;
	
	@FindBy(xpath = "(//i[@class='fa fa-heart'])[2]")
	private WebElement addToWishListSumsungGalaxy;
	
	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private WebElement compareSumsungGalaxy;
	
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
