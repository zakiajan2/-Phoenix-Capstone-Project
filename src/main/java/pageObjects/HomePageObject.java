package pageObjects;



	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Core.Base;
   
	public class HomePageObject extends Base {
		public HomePageObject() {
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//span[text()='Currency']")
		private WebElement currencyButton;

		@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
		private WebElement EuroButton;

		@FindBy(xpath = "//ul[@class='dropdown-menu']//li[2]")
		private WebElement poundButton;

		@FindBy(xpath = "//ul[@class='dropdown-menu']//li[3]")
		private WebElement DollarButton;

		@FindBy(xpath = "//strong[text()='€']")
		private WebElement currencySymbol;

		@FindBy(xpath = "//span[text()='123456789']")
		private WebElement websitePhone;

		@FindBy(xpath = "//span[text()='My Account']")
		private WebElement MyAccountButton;

		@FindBy(xpath = "//span[text()='Wish List (0)']")
		private WebElement wishListButton;

		@FindBy(xpath = "//span[text()='Shopping Cart']")
		private WebElement shoppingCartButton;

		@FindBy(className = "text-center")
		private WebElement shoppingCartEmptymessage;

		@FindBy(xpath = "//span[text()='Checkout']")
		private WebElement checkoutButton;

		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		private WebElement testEnvironmentText;

		@FindBy(xpath = "//input[@name='search']")
		private WebElement searchBar;

		@FindBy(xpath = "//span[@id='cart-total']") // ###
		private WebElement cartButton;

		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktopButton;

		@FindBy(xpath = "//a[text()='PC (0)']")
		private WebElement pcButton;

		@FindBy(xpath = "//a[text()='Mac (1)']")
		private WebElement macButton;

		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement showAllDesktopsButton;

		@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
		private WebElement laptopsAndNotebooksButton;

		@FindBy(xpath = "//a[text()='Components']")
		private WebElement componentsBatton;

		@FindBy(xpath = "//a[text()='Tablets']")
		private WebElement tabletsBatton;

		@FindBy(xpath = "//a[text()='Software']")
		private WebElement softwareBatton;

		@FindBy(xpath = "//a[text()='Phones & PDAs']")
		private WebElement phoneAndPDAsBatton;

		@FindBy(xpath = "//a[text()='Cameras']")
		private WebElement camerasBatton;

		@FindBy(xpath = "//a[text()='MP3 Players']")
		private WebElement mp3PlayersBatton;//////////////

		@FindBy(tagName = "h3")
		private WebElement featuredText;

		@FindBy(xpath = "//img[@title='MacBook']")
		private WebElement macBookImage;

		@FindBy(linkText = "MacBook")
		private WebElement macBookButton;

		@FindBy(xpath = "//p[contains(text(), 'Intel Core 2 Duo processor')]")
		private WebElement macBookDescriptionText;

		@FindBy(xpath = "//p[contains(text(), '$602')]")
		private WebElement macBookPrice;

		@FindBy(xpath = "//span[contains(text(), 'Ex Tax: $500.00')]")
		private WebElement macBooktax;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[1]")
		private WebElement addToCartMacBook;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[2]")
		private WebElement addToWishListMacBook;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div[3]//button[3]")
		private WebElement compareThisProductMacBook;

		@FindBy(xpath = "//img[@title='iPhone']")
		private WebElement iphoneImage;

		@FindBy(linkText = ("iPhone"))
		private WebElement iphoneButton;

		@FindBy(xpath = "//p[contains(text(), 'iPhone is a revolutionary new ')]")
		private WebElement iphoneButtonDescription;

		@FindBy(xpath = "//p[contains(text(), '123.20')]")
		private WebElement iphonePrice;

		@FindBy(xpath = "//span[contains(text(), 'Ex Tax: $101.00')]")
		private WebElement iphonetax;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div[3]//button[1]")
		private WebElement addToCartIphpne;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div[3]//button[2]")
		private WebElement addToWishListIphpne;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div[3]//button[3]")
		private WebElement compareThisProductiphone;

		@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
		private WebElement appleCinema30InchImage;

		@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
		private WebElement appleCinema30inchButton;

		@FindBy(xpath = "//span[contains(text(), '$110.00')]")
		private WebElement AppleCinema30InchNewPrice;

		@FindBy(xpath = "//div[3]//div//div[2]//p//span[contains(text(), '$122.00')]")
		private WebElement AppleCinema30InchOldPrice;

		@FindBy(xpath = "//span[contains(text(), '$90.00')]")
		private WebElement AppleCinema30InchTax;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div[3]//button[1]")
		private WebElement addToCartAppleCinema30Inch;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div[3]//button[2]")
		private WebElement addTowishListAppleCinema30Inch;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div[3]//button[3]")
		private WebElement compareThisProductAppleCinema30Inch;

		@FindBy(xpath = "//img[@title='Canon EOS 5D']")
		private WebElement CanonESO5DImage;

		@FindBy(xpath = "//a[text()='Canon EOS 5D']")
		private WebElement canonEOS5DButton;

		@FindBy(xpath = "//p[contains(text(),' new D-SLR categor')]")
		private WebElement CanonEOS5DDescriptionText;

		@FindBy(xpath = "//span[contains(text(), '$98.00')]")
		private WebElement canonEOS5DNewPrice;

		@FindBy(xpath = "//div[4]//div[2]//p[2]//span[contains(text(), '$122.00')]") // so difficult
		private WebElement canonEOS5DOldPrice;

		@FindBy(xpath = "//span[contains(text(), '$80.00')]")
		private WebElement canonEOS5DTax;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div[3]//button[1]")
		private WebElement addToCartCanonEOS5D;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div[3]//button[2]")
		private WebElement addToWhishListAppleCinema30inch;

		@FindBy(xpath = "//div[contains(@class,'product-layout')][4]//div//div[3]//button[2]")
		private WebElement addToWishListCanonEOS5D;
		
		@FindBy(linkText = ("About Us"))////footer
		private WebElement abouUsFooter;

		@FindBy(linkText = ("Delivery Information"))
		private WebElement deliveryInformationButtonFooter;

		@FindBy(linkText = ("Terms & Conditions"))
		private WebElement termAndConditionButtonFooter;

		@FindBy(linkText = ("Contact Us"))
		private WebElement contactUsButtonFooter;

		@FindBy(linkText = ("Returns"))
		private WebElement reternsButtonFooter;

		@FindBy(linkText = ("Site Map"))
		private WebElement siteMapButtonFooter;

		@FindBy(linkText = ("Brands"))
		private WebElement brandButtonFooter;

		@FindBy(linkText = ("Gift Certificates"))
		private WebElement giftCertificationButtonFooter;

		@FindBy(linkText = ("Affiliate"))
		private WebElement affiliateButtonFooter;

		@FindBy(linkText = ("Specials"))
		private WebElement specialsButtonFooter;

		@FindBy(xpath = ("//a [text()='My Account']"))
		private WebElement myAccountButtonFooter;
		@FindBy(linkText = ("Order History"))
		private WebElement orderHistoryButtonFooter;

		@FindBy(linkText = ("Wish List"))
		private WebElement wishListFooter;

		@FindBy(linkText = ("Newsletter"))
		private WebElement newslettertFooter;

		@FindBy(xpath = "//p[contains(text(),'Powered By ')]")
		private WebElement footageText;

		public void validateHomePage() {
			String text = testEnvironmentText.getText();
			if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
				logger.info("Text verified!");
			} else {
				logger.info("Text does not match!");
			}
		}

		public void clickOnCurrencyButton() {
			currencyButton.click();
		}

		public void clickOnEuro() {
			EuroButton.click();
		}

		public void clickOnPound() {
			poundButton.click();
		}

		public void clickOnDollar() {
			DollarButton.click();
		}

		public void choosecurrencyverification() {
			String text = currencySymbol.getText();
			if (text.equalsIgnoreCase("Â£")) {
				System.out.println("Â£ Pound Sterling");
			} else if (text.equalsIgnoreCase("â‚¬")) {
				System.out.println("â‚¬ Euro");
			} else {
				System.out.println("$ US Dollar");
			}
		}

		public void clickOnphoneNumber() {
			websitePhone.click();
		}

		public void clickOnMyAcccount() {
			MyAccountButton.click();
		}

		public void clickOnWishList() {
			wishListButton.click();
		}

		public void ClickOnShoppigCart() {/////////////////////////////
			shoppingCartButton.click();
		}

		public void shoppingCartIsEmptyMesssage() {
			System.out.println(shoppingCartEmptymessage.getText());
		}

		public void clickOnCheckout() {
			checkoutButton.click();
		}

		public void testEnvironmentText() {
			System.out.println(testEnvironmentText.getText());
		}

		public void sendKeysInSearchBar(String string) {
			searchBar.sendKeys(string);
		}

		public void clickOncart() {
			cartButton.click();
		}

		public void clickOnDesktopButton() {
			desktopButton.click();
		}

		public void clickOnPC() {
			pcButton.click();
		}

		public void clickOnMac() {
			macButton.click();
		}

		public void showAllDesktops() {
			showAllDesktopsButton.click();
		}

		public void clickOnLaptopsAndNoteBooks() {
			laptopsAndNotebooksButton.click();
		}

	

}
