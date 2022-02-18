package stepDefinitions;

import java.io.IOException;
//import java.util.ArrayList;


import Core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.Utilities;

public class RetailPageStepDefinition extends Base {

	RetailPageObject retail = new RetailPageObject();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		retail.clickOnMyAccountTAB();
		logger.info("user successfully cliked on my account tab");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnLoginTab();
		logger.info("user successfully clicked on login Tab");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		retail.EnterUserName();
		retail.EnterPassword();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("user successfullty entere her/his user name and password");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retail.clickOnLoginButtonForLoginToAccount();
		logger.info("user successfully cliked on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {// i used assert to verification it passed
		retail.mayaccountDashboardItemsVerification();
		logger.info("user succussfully see my account dashboard");

		Utilities.highlightelementRedBorder(retail.getMyaAcountDashboardLeft());
		;
		try {
			Utilities.takeScreenShot("myaccountDashboard");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@When("User click on ‘Register for an Affiliate Account’ link") /// it don't work because by creating an account i
																	/// already have it
	public void user_click_on_register_for_an_affiliate_account_link() {// i have to create new member to test
		retail.clickOnRegisterForAffiliateAccountLink();
		logger.info("user successsfully clicked on Register for an affiliate account");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		retail.enterCompanyName();
		retail.enterCompanyWebsite();
		retail.enterTaxID();
		retail.PaymenyMethodRadioButton("");
		retail.enterCompanyName();////////// ?
		retail.enterPayeeName();
		logger.info("user successfully fill affiliate form");

	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.clickOnaboutUsCheckBox();
		logger.info("user successfully clicked on about us chckBox");
	}

	@When("User click on Continue button")
	public void user_clicked_on_continue_button() {
		retail.clickOnContinueButton();
		logger.info("user successfully cliked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retail.SuccessMessageforEditAffiliation();/// this method had same xpath for all
		logger.info("user can see success message");
	}
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {
		retail.clickOnEditYourAffilistrInformation();
		logger.info("user successfully clicked on eddit your affiliate information link");
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retail.clickOnBankTransferRadioButton();
		logger.info("user successfully cliked on Bank Transfer RadioButton ");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		retail.enterBankName();
		retail.enterABANumber();
		retail.enterswiftCode();
		retail.enterAccountName();
		retail.enterAccountNumber();
		logger.info("user successfully fill bank information ");
	}
/*io.cucumber.junit.UndefinedStepException: The step 'User click on 'Edit your account information' link' is undefined.
You can implement this step using the snippet(s) below:

@When("User click on {string} link")
public void user_click_on_link(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


*/
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retail.clickOneditYourAccountInformationLink();
		logger.info("user successfully click on edit your account information link");
	}

	@When("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) {
		retail.editFirstNameInMyAccountInformation();
		retail.editlastNameInMyAccountInformation();
		retail.editEmailInMyAccountInformation();
		retail.editTelephonNumberInMyAccountInformation();
		logger.info("user successfully modified his/herinformation");
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		retail.clickOnContinueButtonInEditAffiliateInformation();// the same xpath for all continue
		logger.info("user succussfully clicked on continue buttonn");
	}

	@Then("User should see a message Success: Your account has been successfully updated.")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
		retail.SuccessMessageforEditAffiliation();
		logger.info("user successfully see succuss message");

	}

}
