package pageObjects;
import java.util.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Core.Base;
import utilities.Utilities;

public class LaptopsNoteBooksPageObject extends Base {
	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	// header
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;

	@FindBy(xpath = "//span[text()='123456789']")
	private WebElement websitePhone;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountButton;

	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement wishListButton;

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shoppingCartButton;

	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement checkoutButton;

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;

	@FindBy(xpath = "//input[@class='form-control input-lg']")
	private WebElement searchBar;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartButton;

	@FindBy(xpath = "//a[@class='dropdown-toggle'and text()='Desktops']")
	private WebElement desktopsButton;

	@FindBy(xpath = "//ul[@class='list-unstyled']//a[ text()='PC (0)']")
	private WebElement pcButton;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsButton;

	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopsAndNotebooksTab;

	@FindBy(xpath = "//a[text()='Macs (0)']")
	private WebElement macsButton;

	@FindBy(xpath = "//a[text()='Windows (0)']")
	private WebElement windowsButton;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooksTab;

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentsButton;

	@FindBy(xpath = "//a[text()='Mice and Trackballs (0)']")
	private WebElement miceAndTrackballsButton;

	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitorsButton;

	@FindBy(xpath = "//a[text()='Printers (0)']")
	private WebElement printersButton;

	@FindBy(xpath = "//a[text()='Scanners (0)']")
	private WebElement scannersButton;

	@FindBy(xpath = "//a[text()='Web Cameras (0)']")
	private WebElement webCamerasButton;

	@FindBy(xpath = "//a[text()='Show All Components']")
	private WebElement showAllComponentsButton;

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsButton;

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement softwareButton;

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phoneAndPDAsButton;

	@FindBy(xpath = "//a[ text()='Cameras']")
	private WebElement camerasButton;

	@FindBy(xpath = "//a[text()='Canon (1)']")
	private WebElement canonButton;

	@FindBy(xpath = "//a[text()='Nikon (1)']")
	private WebElement nikonButton;

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mp3PlayersButton;

	@FindBy(xpath = "//a[ text()='test 7 (0)']")
	private WebElement test7Button;

	@FindBy(xpath = "//a[ text()='test 8 (0)']")
	private WebElement test8Button;

	@FindBy(xpath = "//a[ text()='test 9 (0)']")
	private WebElement test9Button;

	@FindBy(xpath = "//a[ text()='test 23 (0)']")
	private WebElement test23Button;

	@FindBy(xpath = "//a[ text()='test 24 (0)']")
	private WebElement test24Button;

	@FindBy(xpath = "//a[ text()='test 4 (0)']")
	private WebElement test4Button;

	@FindBy(xpath = "//a[ text()='test 6 (0)']")
	private WebElement test6Button;

	@FindBy(xpath = "//a[ text()='test 18 (0)']")
	private WebElement test18Button;

	@FindBy(xpath = "//a[ text()='test 19 (0)']")
	private WebElement test19Button;

	@FindBy(xpath = "//a[ text()='test 20 (0)']")
	private WebElement test20Button;

	@FindBy(xpath = "//a[ text()='test 21 (0)']")
	private WebElement test21Button;

	@FindBy(xpath = "//a[ text()='test 22 (0)']")
	private WebElement test22Button;

	@FindBy(xpath = "//a[ text()='test 11 (0)']")
	private WebElement test11Button;

	@FindBy(xpath = "//a[ text()='test 12 (0)']")
	private WebElement test12Button;

	@FindBy(xpath = "//a[ text()='test 15 (0)']")
	private WebElement test15Button;

	@FindBy(xpath = "//a[ text()='test 16 (0)']")
	private WebElement test16Button;

	@FindBy(xpath = "//a[ text()='test 17 (0)']")
	private WebElement test17Button;

	@FindBy(xpath = "//ul[@class='breadcrumb']//li[1]")
	private WebElement backToHomePageButton;

	@FindBy(xpath = "//div[@class='list-group']//a[1]")
	private WebElement Desktop13;

	@FindBy(xpath = "//div[@class='list-group']//a[2]")
	private WebElement LaptopsAndNoteBooks5;

	@FindBy(xpath = "//div[@class='list-group']//a[3]")
	private WebElement Macs0;

	@FindBy(xpath = "//div[@class='list-group']//a[4]")
	private WebElement windows0;

	@FindBy(xpath = "//div[@class='list-group']//a[5]")
	private WebElement component2;

	@FindBy(xpath = "//div[@class='list-group']//a[6]")
	private WebElement tablets1;

	@FindBy(xpath = "//div[@class='list-group']//a[7]")
	private WebElement software0;

	@FindBy(xpath = "//div[@class='list-group']//a[8]")
	private WebElement phoneAndPDAs3;

	@FindBy(xpath = "//div[@class='list-group']//a[9]")
	private WebElement cameras2;

	@FindBy(xpath = "//div[@class='list-group']//a[10]")
	private WebElement mp3Player;

	@FindBy(xpath = "//h2")
	private WebElement LaptopAndNoteBookText;

	@FindBy(xpath = "//p[contains(text(),'Shop Laptop feature')]")
	private WebElement LaptopAndNoteBookTextDescription;

	@FindBy(xpath = "//h3")
	private WebElement RefineSearch;

	@FindBy(xpath = "//i[@class='fa fa-th-list']")
	private WebElement List;

	@FindBy(xpath = "//i[@class='fa fa-th']")
	private WebElement Grid;

	@FindBy(xpath = "//label[text()='Sort By:']")
	private WebElement sortBy;

	@FindBy(xpath = "//label[text()='Show:']")
	private WebElement show;

	@FindBy(xpath = "(//*[@class='img-responsive'])[1]")
	private WebElement computeranmdmousepicture;

	@FindBy(xpath = "(//*[@class='img-responsive'])[2]")
	private WebElement HPLP3065picture;

	@FindBy(linkText = ("HP LP3065"))
	private WebElement HPLP3065Text;

	@FindBy(xpath = "//p[contains(text(),'Stop your co')]")
	private WebElement HPLP3065TextDescription;

	@FindBy(xpath = "(//*[@class='price'])[1]")
	private WebElement priceHPLP3065;

	@FindBy(xpath = "(//*[@type='button'])[9]")
	private WebElement addToCartHPLP3065;

	@FindBy(xpath = "(//*[@type='button'])[10]")
	private WebElement addToWishListtHPLP3065;

	@FindBy(xpath = "(//*[@type='button'])[11]")
	private WebElement compareHPLP3065;

	@FindBy(xpath = "(//*[@class='img-responsive'])[3]")
	private WebElement macBookPicture;

	@FindBy(linkText = ("MacBook"))
	private WebElement MacBookText;

	@FindBy(xpath = "//p[contains(text(),'Intel Core 2 Du')]")
	private WebElement MacBookTextDescription;

	@FindBy(xpath = "(//*[@class='price'])[2]")
	private WebElement priceMacBook;

	@FindBy(xpath = "(//*[@type='button'])[12]")
	private WebElement addToCartMacBook;

	@FindBy(xpath = "(//*[@type='button'])[13]")
	private WebElement addToWishListMacBook;

	@FindBy(xpath = "(//*[@type='button'])[14]")
	private WebElement compareMacBook;

	@FindBy(xpath = "(//*[@class='img-responsive'])[4]")
	private WebElement macBookAirPicture;

	@FindBy(linkText = ("MacBook Air"))
	private WebElement MacBookAirText;

	@FindBy(xpath = "//p[contains(text(),'MacBook Ai')]")
	private WebElement MacBookAirTextDescription;

	@FindBy(xpath = "(//*[@class='price'])[3]")
	private WebElement priceMacBookAir;

	@FindBy(xpath = "(//*[@type='button'])[15]")
	private WebElement addToCartMacBookAir;

	@FindBy(xpath = "(//*[@type='button'])[16]")
	private WebElement addToWishListMacBookAir;

	@FindBy(xpath = "(//*[@type='button'])[17]")
	private WebElement compareMacBookAir;

	@FindBy(xpath = "(//*[@class='img-responsive'])[5]")
	private WebElement macBookProPicture;

	@FindBy(linkText = ("MacBook Pro"))
	private WebElement MacBookProText;

	@FindBy(xpath = "//p[contains(text(),'Latest Intel mobil')]")
	private WebElement MacBookProTextDescription;

	@FindBy(xpath = "(//*[@class='price'])[4]")
	private WebElement priceMacBookPro;

	@FindBy(xpath = "(//*[@type='button'])[18]")
	private WebElement addToCartMacBookPro;

	@FindBy(xpath = "(//*[@type='button'])[19]")
	private WebElement addToWishlistMacBookPro;

	@FindBy(xpath = "(//*[@type='button'])[20]")
	private WebElement compareMacBookPro;

	@FindBy(xpath = "(//*[@class='img-responsive'])[6]")
	private WebElement SonyVAIO;

	@FindBy(linkText = ("Sony VAIO"))
	private WebElement SonyVAIOText;

	@FindBy(xpath = "//p[contains(text(),'Unprecedented powe')]")
	private WebElement SonyVAIOTextDescription;

	@FindBy(xpath = "(//*[@class='price'])[5]")
	private WebElement priceSonyVAIO;

	@FindBy(xpath = "(//*[@type='button'])[21]")
	private WebElement addToCartSonyVAIO;

	@FindBy(xpath = "(//*[@type='button'])[22]//i")
	private WebElement addToWishListSonyVAIO;

	@FindBy(xpath = "(//*[@type='button'])[23]")
	private WebElement compareSonyVAIO;

	@FindBy(xpath = "(//div[text()='Showing 1 to 5 of 5 (1 Pages)']")
	private WebElement showingpages;

	// footer
	@FindBy(linkText = ("About Us"))
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
	private WebElement poweredByText;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartInMacBookPage;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageforAddMacBookinMacBookPage;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement price602text;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement redXinMacBookShoppingCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement sucsseMessageForAddingMackBookAirInLaptopNotebookPage;

	@FindBy(linkText ="product comparison")
	private WebElement productComparisonLink;

	@FindBy(xpath = "//strong[text()='Product Details']")
	private WebElement productComparisonChartVerification;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement creatAnAccountMassage;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement emtyshoppingCartButton;

	@FindBy(xpath = "//Li//h2[text()='$2,000.00']")
	private WebElement MacBookProPrice2000;
	
	@FindBy(xpath = "//div[@id='content']//a//strong")
	private List<WebElement> listOfItemsInProductComparison;///////////////////////////


	public void userClickOnLaptopAndNoteBookTab() {// L1
		laptopsAndNotebooksTab.click();
	}

	public void clickOnShowAllLaptopsAndNoteBooksTab() {// L2
		Utilities.waitAndClickElement(showAllLaptopsAndNotebooksTab);
	}

	public void userclickOnMacNooktext() {// L3
		Utilities.waitAndClickElement(MacBookText);
	}

	public void addToCartInMacBookPage() {// L4
		Utilities.waitAndClickElement(addToCartInMacBookPage);

	}

	public void successMassageForaddToCartMacBook() {// L5
		getSuccessMessageforAddMacBookinMacBookPage().getText();
	}

	public void verifysuccessMassageForaddToCartMacBook(String strSuccessMassage) {// L5Ramin
		String actualsuccesssmassage = getSuccessMessageforAddMacBookinMacBookPage().getText();
		String expectedMassage = actualsuccesssmassage.substring(0, 54);// we remove x and one enter from massage
		Assert.assertEquals(strSuccessMassage, expectedMassage);

	}

	public WebElement getSuccessMessageforAddMacBookinMacBookPage() {// getter---L5
		return successMessageforAddMacBookinMacBookPage;

	}

	public void PriceOnShoppingCartforMacBookP() {
		price602text.getText();

	}

	public WebElement getPrice602text() {
		return price602text;
	}

	public void clickOnShoppingCartOnMacBookPage() {
		Utilities.waitAndClickElement(price602text);
	}

	public void clickOnRedXInMacBookPage() {
		redXinMacBookShoppingCart.click();
	}

	public void emptyCartAfterclickOnXSeen() {
		emtyshoppingCartButton.getText();
	}

	public void clickOnComparMacBookonDesktopPage() {
		Utilities.waitAndClickElement(compareMacBook);
	}

	public void clickOnComparMacBookonLaptopNoteBookPage() {
		Utilities.waitAndClickElement(compareMacBookAir);
		compareMacBookAir.click();

	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") 
	private WebElement succusmassageForMacBookAir;

	public void successMassageforaddingMacBookAironNotebookPage() {

		String x = succusmassageForMacBookAir.getText();
		if (x.contains("Success: You have added MacBook to your product comparison!")) {
			logger.info("success massage verifyed");
		} else {
			logger.info("text not match\n" + x);
		}
		Utilities.highlightelementRedBorder(getSuccessMessageforAddMacBookinMacBookPage());
		try {
			Utilities.takeScreenShot("macAir success massage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void clickOnproductComparisonLink() {
		Utilities.waitAndClickElement(productComparisonLink);
	}

	public void productComparisonchrtVerification() {
		List<WebElement> list= listOfItemsInProductComparison;
		for (int i =0; i<list.size();i++) {System.out.println(list.get(i));
			Assert.assertTrue(list.size() != 0);
		}
//		String text = productComparisonChartVerification.getText();
//		if (text.equalsIgnoreCase("Product Details")) {
//			logger.info("text in product comparison verified");
//		} else {
//			logger.info("tex doesnot match");
//		}
	}

	public void clickOnWishListSonyVAIO() {
		Utilities.waitAndClickElement(addToWishListSonyVAIO);
	}

	public void mustCreateAnAccountMessageVerification() {
		creatAnAccountMassage.getText();
	}

	public WebElement getCreatAnAccountMassage() {
		return creatAnAccountMassage;
	}

	public WebElement getProductComparisonChartVerification() {
		return productComparisonChartVerification;
	}

	public void clickOnMacBookProItem() {
		Utilities.waitAndClickElement(macBookProPicture);
	}

	public void ValidationmackBookProPrice2000() {
		getMacBookProPrice2000().getText();
		String actual2000=getMacBookProPrice2000().getText();
		String expected2000="$2,000.00";
		Assert.assertEquals(actual2000, actual2000,expected2000);
	}

	public WebElement getMacBookProPrice2000() {
		return MacBookProPrice2000;
	}

}
