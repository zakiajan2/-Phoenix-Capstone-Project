package stepDefinitions;

import java.io.IOException;

import Core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class HomePageStepDefinitions extends Base {
	
	HomePageObject home= new HomePageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws IOException {
    home.validateHomePage();
    logger.info("Homepage validated successfully");
	Utilities.takeScreenShot("Homepage");
   
}


	@When("User click on Currency")
	public void user_click_on_currency()  {
    home.clickOnCurrencyButton();
    logger.info("currency button was clicked successfully");
}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
    home.clickOnEuro();
    logger.info("user clicked on Euro successfully");
	
}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
   home.choosecurrencyverification();
   logger.info("currency value changed to Euro successfully");
}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
   home.ClickOnShoppigCart();
   logger.info("User clicked on shopping cart successfully");
}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
   home.shoppingCartIsEmptyMesssage();


	}

}
