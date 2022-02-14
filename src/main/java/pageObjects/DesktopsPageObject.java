package pageObjects;

	import java.io.IOException;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Core.Base;
	import utilities.Utilities;
    
	public class DesktopsPageObject extends Base {
		public DesktopsPageObject() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']") 
		private WebElement testEnvironmentText;

		@FindBy(xpath = "//a[@class='dropdown-toggle'and text()='Desktops']") //////
		private WebElement desktopsTab;

		@FindBy(xpath = "//ul[@class='list-unstyled']//a[ text()='PC (0)']")
		private WebElement pc0Tab;
		@FindBy(xpath = "//a[ text()='Show All Desktops']")
		private WebElement showAllDesktopsButton;

		@FindBy(xpath = "//a[ text()='Tablets']")
		private WebElement tabletsButton;

		@FindBy(xpath = "//a[ text()='Software']")
		private WebElement softwareButton;

		@FindBy(xpath = "//a[ text()='Phones & PDAs']")
		private WebElement phoneAndPDAsButton;

		@FindBy(xpath = "//a[ text()='Cameras']")
		private WebElement camerasButton;

		@FindBy(xpath = "//a[ text()='Canon (1)']")
		private WebElement canonButton;

		@FindBy(xpath = "//a[ text()='Nikon (1)']")
		private WebElement nikonButton;

		@FindBy(xpath = "//ul[@class='breadcrumb']//li[1]")
		private WebElement backToHomePageButton;

		@FindBy(xpath = "//ul[@class='breadcrumb']//li[2]")
		private WebElement desktop2Button;

		@FindBy(xpath = "//div[@class='list-group']//a[1]")
		private WebElement desktop13Button;

		@FindBy(xpath = "//div[@class='list-group']//a[2]")
		private WebElement pc0Button;
		@FindBy(xpath = "//div[@class='list-group']//a[3]")
		private WebElement mac1Button;

		@FindBy(xpath = "//div[@class='list-group']//a[4]")
		private WebElement laptopsAndNoteBooks5Button;

		@FindBy(xpath = "//div[@class='list-group']//a[5]")
		private WebElement components2Button;

		@FindBy(xpath = "//div[@class='list-group']//a[6]")
		private WebElement tablets1Button;

		@FindBy(xpath = "//div[@class='list-group']//a[7]")
		private WebElement software0Button;

		@FindBy(xpath = "//div[@class='list-group']//a[8]")
		private WebElement phonesAndPADs3Button;

		@FindBy(xpath = "//div[@class='list-group']//a[9]")
		private WebElement cameras2Button;

		@FindBy(xpath = "//div[@class='list-group']//a[10]")
		private WebElement mp3Players4Button;

		@FindBy(xpath = "//h2[text()='Desktops']")
		private WebElement desktopsText;

		@FindBy(xpath = "//h3[text()='Refine Search']")
		private WebElement refineSearchText;

		@FindBy(xpath = "//div[@class='row']//div//ul//li[1]//a[text()='PC (0)']")
		private WebElement PCunderRefineSearchText;

		@FindBy(xpath = "//div[@class='row']//div//ul//li[2]//a[text()='Mac (1)']")
		private WebElement MacUnderRefineSearchText;

		@FindBy(xpath = "//i[@class='fa fa-th-list']")
		private WebElement ListButton;

		@FindBy(xpath = "//button[@id='grid-view']")
		private WebElement GridButton;

		@FindBy(xpath = "//a[text()='Product Compare (0)']")
		private WebElement ProductCompareText;

		@FindBy(xpath = "//label[@for='input-sort']")
		private WebElement sortByText;

		@FindBy(xpath = "//select[@id='input-sort']")
		private WebElement clickOnsortByDropdown;

		@FindBy(xpath = "//select[@id='input-sort']//option[1]")
		private WebElement selectDefault;

		@FindBy(xpath = "//select[@id='input-sort']//option[2]")
		private WebElement selectNamefromAtoZ;

		@FindBy(xpath = "//select[@id='input-sort']//option[3]")
		private WebElement selectNamefromZtoA;

		@FindBy(xpath = "//select[@id='input-sort']//option[4]")
		private WebElement selectfromLowerPrice;

		@FindBy(xpath = "//select[@id='input-sort']//option[5]")
		private WebElement selectfromHigherPrice;

		@FindBy(xpath = "//select[@id='input-sort']//option[6]")
		private WebElement selectRatingHighest;

		@FindBy(xpath = "//select[@id='input-sort']//option[7]")
		private WebElement selecRatingLowest;

		@FindBy(xpath = "//select[@id='input-sort']//option[8]")
		private WebElement selecModelAtoZ;

		@FindBy(xpath = "//select[@id='input-sort']//option[9]")
		private WebElement selectModelZtoA;

		@FindBy(xpath = "//label[@for='input-limit']")
		private WebElement showText;

		@FindBy(xpath = "//select[@id='input-limit']")
		private WebElement clickOnShowDropdown;

		@FindBy(xpath = "//select[@id='input-limit']//option[1]")
		private WebElement select15;

		@FindBy(xpath = "//select[@id='input-limit']//option[2]")
		private WebElement select25;

		@FindBy(xpath = "//select[@id='input-limit']//option[3]")
		private WebElement select50;
		@FindBy(xpath = "//select[@id='input-limit']//option[4]")
		private WebElement select75;

		@FindBy(xpath = "//select[@id='input-limit']//option[5]")
		private WebElement select100;

		@FindBy(xpath = "//img[@alt='HP Banner']")
		private WebElement pictureOfMonitorMouseandkeyboard;

		@FindBy(xpath = "//img[@alt='Apple Cinema 30\"']")
		private WebElement pictureOfAppleCinema30Inch;

		@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
		private WebElement AppleCinema30InchText;

		@FindBy(xpath = "//p[starts-with(text(),'The 30-inch Apple')]") ///////////////////////
		private WebElement AppleCinema30InchDescriptionText;

		@FindBy(xpath = "//div[@class='row']/div[1]/div/div[2]/div/p/span[@class='price-new']")
		private WebElement priceNewforAppleCinema30inch;

		@FindBy(xpath = "//div[@class='row']/div[1]/div/div[2]/div/p/span[@class='price-old']")
		private WebElement priceOldforAppleCinema30inch;

		@FindBy(xpath = "//div[@class='row']/div[1]/div/div[2]/div/p/span[@class='price-tax']")
		private WebElement priceTaxforAppleCinema30inch;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
		private WebElement addTocartApplecinemafromDesktop;

		@FindBy(xpath = "//div[@class='row'][4]//div[1]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListApplecinemafromDesktop;

		@FindBy(xpath = "//div[@class='row'][4]//div[1]//div//div[2]//div[2]//button[3]")
		private WebElement compareApplecinemafromDesktop;

		@FindBy(xpath = "//img[@alt='Canon EOS 5D Camera']") ////////
		private WebElement CanonEOS5DPicturefromDesktop;

		@FindBy(linkText = ("Canon EOS 5D"))
		private WebElement canonText;

		@FindBy(linkText = ("Reviews (0)"))
		private WebElement reviewTabInCanonPage;
		
		@FindBy(xpath = "//input[@name='name']")
		private WebElement enterNameForReviewForCanon;
		
		@FindBy(tagName = "textarea")
		private WebElement enterReviewForCanon;
		
		@FindBy(xpath = "//button[@id='button-review']")
		private WebElement continueButtonInCanonPage;
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]")///
		private WebElement RatingradioButton;
		
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input")///////////////////////////radiobutton
		private WebElement ratingForCanon;

		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[1]")///////////////////////////radiobutton
		private WebElement rate1ForCanon;
		
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[2]")///////////////////////////radiobutton
		private WebElement rate2ForCanon;
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[3]")///////////////////////////radiobutton
		private WebElement rate3ForCanon;
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[4]")///////////////////////////radiobutton
		private WebElement rate4ForCanon;
		
		@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[5]")///////////////////////////radiobutton
		private WebElement rate5ForCanon;
		
		@FindBy(xpath = "(//div[@class='alert alert-success alert-dismissible'])")
		private WebElement successMessageforReviewForCanon;
		
		@FindBy(xpath = "//p[contains(text(),'the EOS 5D')]")
		private WebElement canonDescriptionInDesktop;

		@FindBy(xpath = "//div[@class='row']//div[2]//div//div[2]//div//p[2]//span[1]")
		private WebElement priceNewforCannonDesktop;

		@FindBy(xpath = "//div[@class='row']//div[2]//div//div[2]//div//p[2]//span[2]")
		private WebElement priceOldforCanonDesktop;

		@FindBy(xpath = "//div[@class='row']//div[2]//div//div[2]//div//p[2]//span[3]")
		private WebElement priceTaxforCanonDesktop;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
		private WebElement addTocartCanonfromDesktop;

		@FindBy(xpath = "//div[@class='row'][4]//div[2]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListCanonfromDesktop;

		@FindBy(xpath = "//div[@class='row'][4]//div[2]//div//div[2]//div[2]//button[3]")
		private WebElement compareCanonfromDesktop;

		@FindBy(xpath = "//select[@id='input-option226']")
		private WebElement colorCanonAvailabeOptions;

		@FindBy(xpath = "//select[@id='input-option226']//option[1]")
		private WebElement pleaseSelectCanonColor;

		@FindBy(xpath = "//select[@id='input-option226']//option[2]")
		private WebElement RedCanon;

		@FindBy(xpath = "//select[@id='input-option226']//option[3]")
		private WebElement BlueCanon;

		@FindBy(xpath = "//select[@id='input-option226']//option[4]")
		private WebElement GreenCanon;

		@FindBy(xpath = "//input[@name='quantity']")
		private WebElement quantityOfCanon;
		
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addToCartfromCanonPage;
		
		
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessageForAddCanon;

		@FindBy(xpath = "//img[@alt='HP LP3065']") ///////////
		private WebElement HPLP3065Picture;

		@FindBy(linkText = ("HP LP3065"))
		private WebElement HPLP3056Text;

		@FindBy(xpath = "//p[starts-with(text(),'Stop your co-workers')]")
		private WebElement HPLP3065DescriptionInDesktop;

		@FindBy(xpath = "//div[@class='row']//div[3]//div//div[2]//div//p[@class='price']") // it will print bothprice and
																							// tax
		private WebElement priceforHPLP3065Desktop;

		@FindBy(xpath = "//div[@class='row']//div[3]//div//div[2]//div//p[2]//span")
		private WebElement priceTaxforHPLP3065Desktop;

		@FindBy(xpath = "//button[contains(@onclick,'47')][1]")////////my problem doesntwork
		private WebElement addTocartHPLP3065fromDesktop;

		@FindBy(xpath = ("//input[@id='input-quantity']"))
		private WebElement quantity1forHPLP3065InItsPage;

		@FindBy(xpath = ("//button[@id='button-cart']"))
		private WebElement addToCartButtonInHPLP3065Page;

		@FindBy(xpath = ("//div[@class='alert alert-success alert-dismissible']")) // @@@@@@@@@@@@@@@
		private WebElement sucessMessageforAddingHPLP3060;

		@FindBy(xpath = "//div[@class='row'][4]//div[3]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListHPLP3065fromDesktop;

		@FindBy(xpath = "//div[@class='row'][4]//div[3]//div//div[2]//div[2]//button[3]")
		private WebElement compareHPLP3065fromDesktop;

		@FindBy(xpath = "//img[@alt='HTC Touch HD']") ///////////////////////////////////////////////////////////
		private WebElement HTCTouchHDPicture;

		@FindBy(linkText = ("HTC Touch HD"))
		private WebElement HTCTouchHDText;

		@FindBy(xpath = "//p[starts-with(text(),'HTC Touch')]")
		private WebElement HTCTouchHDDescription;

		@FindBy(xpath = "//p[starts-with(text(),'HTC Touch')]//following-sibling::p[@class='price']") // it will print
																										// bothprice and tax
		private WebElement priceforHTCTouchHD;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[4]")
		private WebElement addTocartHTCTouchHD;

		@FindBy(xpath = "//div[@class='row'][4]//div[4]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListHTCTouchHD;

		@FindBy(xpath = "//div[@class='row'][4]//div[4]//div//div[2]//div[2]//button[3]")
		private WebElement compareHTCTouchHD;

		@FindBy(xpath = "//img[@alt='iPhone']") ////////////////////////////////////////////////////////////////////////////////////////
		private WebElement iphonePicture;

		@FindBy(linkText = ("iPhone"))
		private WebElement iphoneText;

		@FindBy(xpath = "//p[starts-with(text(),'iPhone is a revo')]")
		private WebElement iphoneDescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[5]")
		private WebElement addTocartIphone;

		@FindBy(xpath = "//div[@class='row'][4]//div[5]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListIphone;

		@FindBy(xpath = "//div[@class='row'][4]//div[5]//div//div[2]//div[2]//button[3]")
		private WebElement compareIphone;

		@FindBy(xpath = "//img[@alt='iPod Classic']") ///////////
		private WebElement ipodClasicPicture;

		@FindBy(linkText = ("iPod Classic"))
		private WebElement ipodClasicText;

		@FindBy(xpath = "//p[starts-with(text(),'More room to move')]")
		private WebElement ipodClasicDescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[6]")
		private WebElement addTocartIpodClassic;

		@FindBy(xpath = "//div[@class='row'][4]//div[6]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListIpodClassic;

		@FindBy(xpath = "//div[@class='row'][4]//div[6]//div//div[2]//div[2]//button[3]")
		private WebElement compareIpodClassic;

		@FindBy(xpath = "//img[@alt='MacBook']") ///////////
		private WebElement MacbookPictureInDesktop;

		@FindBy(linkText = ("MacBook"))
		private WebElement MacbookText;

		@FindBy(xpath = "//p[starts-with(text(),'Intel Core')]")
		private WebElement MacbookDescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[7]")
		private WebElement addTocartMacBook;

		@FindBy(xpath = "//div[@class='row'][4]//div[7]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListMacBook;

		@FindBy(xpath = "//div[@class='row'][4]//div[7]//div//div[2]//div[2]//button[3]")
		private WebElement compareMacBook;

		@FindBy(xpath = "//img[@alt='MacBook Air']") ///////////
		private WebElement macBookAirPicture;

		@FindBy(linkText = ("MacBook Air"))
		private WebElement MacBookAirText;

		@FindBy(xpath = "//p[starts-with(text(),'MacBook Air')]")
		private WebElement macBookAirDescription;

		@FindBy(xpath = "/(//span[text()='Add to Cart'])[8]")
		private WebElement addTocartmacBookAir;

		@FindBy(xpath = "//div[@class='row'][4]//div[8]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListMacBookAir;

		@FindBy(xpath = "//div[@class='row'][4]//div[8]//div//div[2]//div[2]//button[3]")
		private WebElement compareMacBookAir;

		@FindBy(xpath = "//img[@alt='Palm Treo Pro']") ///////////
		private WebElement PalmTreoProPicture;

		@FindBy(linkText = ("Palm Treo Pro"))
		private WebElement PalmTreoProText;

		@FindBy(xpath = "//p[starts-with(text(),'Redefine your')]")
		private WebElement PalmTreoProDescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[9]")
		private WebElement addTocartPalmTreoPro;

		@FindBy(xpath = "//div[@class='row'][4]//div[9]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListPalmTreoPro;

		@FindBy(xpath = "//div[@class='row'][4]//div[9]//div//div[2]//div[2]//button[3]")
		private WebElement comparePalmTreoPro;

		@FindBy(xpath = "//img[@alt='Product 8']") ///////////
		private WebElement product8Picture;

		@FindBy(linkText = ("Product 8"))
		private WebElement Product8Ptext;

		// we dont have text thanks god

		@FindBy(xpath = "(//span[text()='Add to Cart'])[10]")
		private WebElement addTocartProduct8;

		@FindBy(xpath = "//div[@class='row'][4]//div[10]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListProduct8;

		@FindBy(xpath = "//div[@class='row'][4]//div[10]//div//div[2]//div[2]//button[3]")
		private WebElement compareProduct8;

		@FindBy(xpath = "//img[@alt='Samsung SyncMaster 941BW']") ///////////
		private WebElement sunsungSyncMasterPicture;

		@FindBy(linkText = ("Samsung SyncMaster 941BW"))
		private WebElement SamsungSyncMaster941BWText;

		@FindBy(xpath = "//p[starts-with(text(),'Imagine')]")
		private WebElement SamsungSyncMaster941BWDescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[11]")
		private WebElement addTocartSamsungSyncMaster941BW;

		@FindBy(xpath = "//div[@class='row'][4]//div[11]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListSamsungSyncMaster941BW;

		@FindBy(xpath = "//div[@class='row'][4]//div[11]//div//div[2]//div[2]//button[3]")
		private WebElement compareSamsungSyncMaster941BW;

		@FindBy(xpath = "//img[@alt='Sony VAIO']") ///////////
		private WebElement sonyVAIOPicture;

		@FindBy(linkText = ("Sony VAIO"))
		private WebElement SonyVAIOText;

		@FindBy(xpath = "//p[starts-with(text(),'Unpr')]")
		private WebElement SonyVAIODescription;

		@FindBy(xpath = "(//span[text()='Add to Cart'])[12]")
		private WebElement addTocartSonyVAIO;

		@FindBy(xpath = "//div[@class='row'][4]//div[12]//div//div[2]//div[2]//button[2]")
		private WebElement addToWishListSonyVAIO;

		@FindBy(xpath = "//div[@class='row'][4]//div[12]//div//div[2]//div[2]//button[3]")
		private WebElement compareSonyVAIO;

		@FindBy(linkText = ("About Us")) //// footer
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

		@FindBy(xpath = "//div[2][@class='col-sm-3']//ul/li[1]/a")
		private WebElement contactUsText;

		public void validateHomePage() {
			String text = testEnvironmentText.getText();
			if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
				logger.info("Text verified!");
			} else {
				logger.info("Text does not match!");
			}
		}

		public void clickOnDesktopTab() {
			desktopsTab.click();
		}

		public void clickONShowAllDesktops() {
			showAllDesktopsButton.click();
		}

		public String desktopPageverification(){/////////////////////////////////////////////////////////////////////////////////
			String text= getDesktopsText().getText();
			return text;
		}

		public void addToCartHPLP3065FromDesktop() {
			addTocartHPLP3065fromDesktop.click();

		}

		public void quantityOfHPLP3065() {
			String text = quantity1forHPLP3065InItsPage.getAttribute("value");
			if (text.equalsIgnoreCase("1")) {
				logger.info("Text verified!");
			} else {
				logger.info("Text does not match!");
			}
		}

		public void addHPLP3065ToShoppingCartInItsPage() {
			addToCartButtonInHPLP3065Page.click();
		}

		public String successMessageforAddHPLP3065ToShoppingCart()   {
			String text=sucessMessageforAddingHPLP3060.getText();
			return text;
		}

		public void clickOnAddToCartCanonEOS5D() {
			addTocartCanonfromDesktop.click();
		}

		public void clickOnAvailableOptionsColorForCanon() {
			colorCanonAvailabeOptions.click();
		}

		public void selectColorFromDropdownForCanon(String color) {/////////////////////////////////////////////////////////////////////
			colorCanonAvailabeOptions.click();
			if (color.equalsIgnoreCase("Red")) {
				RedCanon.click();
				System.out.println(RedCanon.getText());
			} else if (color.equalsIgnoreCase("Blue")) {
				BlueCanon.click();
				System.out.println(BlueCanon.getText());
			} else if (color.equalsIgnoreCase("Green")) {
				GreenCanon.click();
				System.out.println(GreenCanon.getText());
			} else {pleaseSelectCanonColor.click();
				System.out.println(pleaseSelectCanonColor.getText());
			}
		}

		public void quantityOfCanon() {
			quantityOfCanon.sendKeys("1");//////////////////////////////////////////////////////////////////////////////////////////////
		}
		public void addToCartFromCanonPage() {
			addToCartfromCanonPage.click();
		}
		
		public void successMessageForAddCanon() {
			String text=getSuccessMessageForAddCanon().getText();
		
		}
		
		public void clickOnCanonEOSItemIndesktopPage() {
			CanonEOS5DPicturefromDesktop.click();
		}
		
		public void clickOnReviewTabOnCanonPage() {
			reviewTabInCanonPage.click();
		}
		
		public void enterAReviewForCanonEOS5D(String yourname,String yourReview, String Rating){
			
		}
		public void enterYourNameInreviewTab(String yourname) {
			enterNameForReviewForCanon.sendKeys(yourname);
		}
		public void enterYourReviewInCanonPage(String yourReview) {
			enterReviewForCanon.sendKeys(yourReview);
		}
		public void RatingByRadioButton(String Rating) {//////////////////////////////////////////////////////////////////////////////////////
		
			if(Rating.equalsIgnoreCase(Rating)) {
				rate1ForCanon.click();
				System.out.println(rate1ForCanon.getAttribute("value"));
			}else if( Rating.equalsIgnoreCase("2")) {
				rate2ForCanon.click();
				System.out.println(rate2ForCanon.getAttribute("value"));
			}else if (Rating.equalsIgnoreCase("3")) {
				rate3ForCanon.click();
				System.out.println(rate3ForCanon.getAttribute("value"));
			}else if(Rating.equalsIgnoreCase("4")) {
				rate4ForCanon.click();
				System.out.println(rate4ForCanon.getAttribute("value"));
			}else if (Rating.equalsIgnoreCase("5")) {
				rate5ForCanon.click();
				System.out.println(rate5ForCanon.getAttribute("value"));
			}
		}
		public void clickOnContinueButtonInCanonPage() {
			continueButtonInCanonPage.click();
		}
		
		public void successMessageForReviewOfCanon() {
			System.out.println(getSuccessMessageforReviewForCanon().getText());
		
		}

		public WebElement getSuccessMessageForAddCanon() {//getter method for webElement
			return successMessageForAddCanon;
		}

		public WebElement getSuccessMessageforReviewForCanon() {//getter method for webElement
			return successMessageforReviewForCanon;
		}

		public WebElement getDesktopsText() {
			return desktopsText;
		}

		public WebElement getSucessMessageforAddingHPLP3060() {
			return sucessMessageforAddingHPLP3060;
		}

		public WebElement getRate1ForCanon() {
			return rate1ForCanon;
		}

		public WebElement getRate2ForCanon() {
			return rate2ForCanon;
		}

		public WebElement getRate3ForCanon() {
			return rate3ForCanon;
		}

		public void setRate3ForCanon(WebElement rate3ForCanon) {
			this.rate3ForCanon = rate3ForCanon;
		}

		public WebElement getRate4ForCanon() {
			return rate4ForCanon;
		}

		public void setRate4ForCanon(WebElement rate4ForCanon) {
			this.rate4ForCanon = rate4ForCanon;
		}

		public WebElement getRate5ForCanon() {
			return rate5ForCanon;
		}

		public void setRate5ForCanon(WebElement rate5ForCanon) {
			this.rate5ForCanon = rate5ForCanon;
		}



}
