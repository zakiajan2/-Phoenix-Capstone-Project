package pageObjects;

import org.junit.Assert;//we should import assert from j.unit
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Base;
import utilities.Utilities;

public class RetailPageObject extends Base {

	public RetailPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccountTAB;

	@FindBy(xpath = "//a[text()='Login'] ")
	private WebElement loginTab;

	@FindBy(id = "input-email")
	private WebElement enteUserName;

	@FindBy(id = "input-password")
	private WebElement enterPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginTab2;

	@FindBy(xpath = "//div[@id='content']//h2")
	private WebElement myaAcountDashboardLeft;

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateLink;

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformationLink;

	@FindBy(id = "input-company")
	private WebElement compaNyname;

	@FindBy(id = "input-website")
	private WebElement compWebsite;

	@FindBy(id = "input-tax")
	private WebElement taxId;

	@FindBy(id = "input-bank-name")
	private WebElement BankName;

	@FindBy(id = "input-bank-branch-number")
	private WebElement ABANumber;

	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftode;

	@FindBy(id = "input-bank-account-name")
	private WebElement accountName;

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNUmber;

	@FindBy(linkText = "Edit your account information")
	private WebElement acccountInformationLink;

	@FindBy(xpath = "//div[@class='col-sm-10']//div//label//input")
	private WebElement PamentMethod;

	@FindBy(xpath = "//input[@placeholder='Cheque Payee Name']") // it will change by each selection of
																	// pamentmethod
	private WebElement payeeName;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement abouUscheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	@FindBy(xpath = "//input[@value ='Continue']")
	private WebElement continueButtonEditAffiliate;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement continueButtonEditMyAccountInformation;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMassage;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement editFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editLastname;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement editPhoneNumber;

	public void clickOnMyAccountTAB() {
		Utilities.waitAndClickElement(myAccountTAB);
	}

	public void clickOnLoginTab() {
		Utilities.waitAndClickElement(loginTab);
	}

	public void EnterUserName() {
		enteUserName.sendKeys("abcd4@gmail.com");///////////// it should be new for each test running////////////////////

	}

	public void EnterPassword() {
		enterPassword.sendKeys("1234567");//
	}

	public void clickOnLoginButtonForLoginToAccount() {
		Utilities.waitAndClickElement(loginTab2);
	}

	public void mayaccountDashboardItemsVerification() {

		String actualText = getMyaAcountDashboardLeft().getText();
		String expectedText = "My Account";
		try {
			Assert.assertEquals(actualText, expectedText);// ASERT good it passed
		} catch (Exception e) {
			System.out.println("assertion failed ");
		}
	}

	public WebElement getMyaAcountDashboardLeft() {

		return myaAcountDashboardLeft;

	}

	public void clickOnRegisterForAffiliateAccountLink() {
		Utilities.waitAndClickElement(registerForAnAffiliateLink);
	}

	public void enterCompanyName() {
		compaNyname.sendKeys("Tekschool");
	}

	public void enterCompanyWebsite() {
		compWebsite.sendKeys("Tekschool.com");
	}

	public void enterTaxID() {
		taxId.sendKeys("23433");
	}

	public void PaymenyMethodRadioButton(String value) {
		String pm = PamentMethod.getCssValue("Cheque");

		if (pm.contains("Cheque")) {
			System.out.println("Cheque");
			PamentMethod.click();
		} else if (pm.contains("PayPal")) {
			System.out.println("PayPal");
			PamentMethod.click();
		} else {
			System.out.println("BankTransfer");
			PamentMethod.click();
		}
	}

	public void enterPayeeName() {
		payeeName.sendKeys("newPayeeName");
	}

	public void clickOnaboutUsCheckBox() {
		Utilities.waitAndClickElement(abouUscheckBox);

	}

	public void clickOnContinueButton() {
		Utilities.waitAndClickElement(continueButton);

	}

	public void clickOnEditYourAffilistrInformation() {
		Utilities.waitAndClickElement(editAffiliateInformationLink);

	}

	public void clickOnBankTransferRadioButton() {
		Utilities.waitAndClickElement(bankTransferRadioButton);
	}

	public void enterBankName() {
		BankName.sendKeys("wellsfargo");
	}

	public void enterABANumber() {
		ABANumber.sendKeys("1234567");
	}

	public void enterswiftCode() {
		swiftode.sendKeys("1234");
	}

	public void enterAccountName() {
		accountName.sendKeys("newAcccountName");
	}

	public void enterAccountNumber() {
		accountNUmber.sendKeys("123456");
	}

	public void clickOnContinueButtonInEditAffiliateInformation() {
		Utilities.waitAndClickElement(continueButtonEditAffiliate);
	}

	public void SuccessMessageforEditAffiliation() {
		String actuall=successMassage.getText();
		logger.info(actuall);
		
		String expected="Your account has been successfully updated.";
		logger.info(expected);
		
		Utilities.compareText(actuall, expected);
	}

	public void clickOneditYourAccountInformationLink() {
		Utilities.waitAndClickElement(acccountInformationLink);
	}

	public void editFirstNameInMyAccountInformation() {// edit
		editFirstname.clear();
		editFirstname.sendKeys("newFirstName");
	}

	public void editlastNameInMyAccountInformation() {// edit
		editLastname.clear();
		editLastname.sendKeys("newLastname");
	}

	public void editEmailInMyAccountInformation() {
		editEmail.clear();
		editEmail.sendKeys("abcd4@gmail.com");// it should be new in each test

	}

	public void editTelephonNumberInMyAccountInformation() {
		editPhoneNumber.clear();
		editPhoneNumber.sendKeys("1234567");
	}

}
