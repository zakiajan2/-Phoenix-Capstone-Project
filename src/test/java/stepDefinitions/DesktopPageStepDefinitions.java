package stepDefinitions;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import Core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.Utilities;

public class DesktopPageStepDefinitions extends Base {
	DesktopsPageObject desktop = new DesktopsPageObject();
	

@When("User click on Desktops tab")
public void user_click_on_desktops_tab() {
   desktop.clickOnDesktopTab();
   logger.info("user clicked on desktop tab successfully");
}

@When("User click on Show all desktops")
public void user_click_on_show_all_desktops() {
    desktop.clickONShowAllDesktops();
    logger.info("user clicked on show all desktops tab successfully");
}

@Then("User should see all items are present in Desktop page")
public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
 String text=  desktop.desktopPageverification();
	Utilities.highlightelementBorderAndBackground(desktop.getDesktopsText());
   Utilities.takeScreenShot(text);
	Assert.assertEquals("Desktops", text);//i used assert equall to verify text in desktop page
	logger.info("user can see can see all items are present in DesktopPage succusfully");
}

@When("User click  ADD TO CART option on ‘HP LP3065’ item")
public void user_click_add_to_cart_option_on_hp_lp3065_item() {
    desktop.addToCartHPLP3065FromDesktop();
    logger.info("user successfully clicked on add to cart option HPLI3065 item");
}

@When("User select quantity1")
public void user_select_quantity1() {
   desktop.quantityOfHPLP3065();
   logger.info("user succesfully select item 1");
}

@When("User click add to Cart button")
public void user_click_add_to_cart_button() {
   desktop.addHPLP3065ToShoppingCartInItsPage();
   logger.info("user successfully clicked add to cart button");
}

@Then("User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’")
public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart()  throws IOException {
  String text= desktop.successMessageforAddHPLP3065ToShoppingCart() ;
  if (text.contains("HP LP3065")) {
	  logger.info("success message match");}
  else {
	  logger.info("success message doesnot match");
  }
	Utilities.highlightelementRedBorder(desktop.getSucessMessageforAddingHPLP3060());
		Utilities.takeScreenShot("success message for HPLP3065");
	
   logger.info("user successfully see massage 'success: you have added hp lp 3065 to your shoppingcart!");
   
}

@When("User click  ADD TO CART option on ‘Canon EOS 5D’ item")
public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
    desktop.clickOnAddToCartCanonEOS5D();
    logger.info("user successfully add to cart option on canon EOS 5D item");
}

@When("User select color from dropdown ‘Red’")
public void user_select_color_from_dropdown_red() {/////////////////////////////////////////////////////////////////////////////////////////////
    
	
	desktop.selectColorFromDropdownForCanon("Red");
    logger.info("user sucessfully select color red from dropdown");
}

@When("User select quantity {int}")
public void user_select_quantity(Integer int1) {////////////////////////
    desktop.quantityOfCanon();
    logger.info("user succussfully select quantity 1 ");
    
}
@When("User click add to Cart button here")
public void User_click_add_to_Cart_button_here() {
    desktop.addToCartFromCanonPage();
    logger.info("user succussfully add canon in canon page ");
    
}


@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart()throws IOException {
    desktop.successMessageForAddCanon();
    String text=desktop.getSuccessMessageForAddCanon().getText();
	Utilities.highlightelementRedBorder(desktop.getSuccessMessageForAddCanon());
		
		try {
			Utilities.takeScreenShot("success message for canon");
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		if (text.contains("â€˜Success: You have added Canon EOS 5D to your shopping cart!â€™")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	

    logger.info("verify user see massage:'you have added Canon EOS %D to your shopping cart'");
    
}

@When("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
    desktop.clickOnCanonEOSItemIndesktopPage();
    logger.info("user successfully cllikesd on Canon EOS 5D.");
}

@When("User click on write a review link")
public void user_click_on_write_a_review_link() {
    desktop.clickOnReviewTabOnCanonPage();
}

@When("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {/////////////enter Data
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	desktop.enterYourNameInreviewTab(data.get(0).get("yourname"));//we dont enter actuall data here 
	desktop.enterYourReviewInCanonPage(data.get(0).get("yourReview"));//we just write keys (here instead of parameters)
	
	
	desktop.RatingByRadioButton(data.get(0).get("Rating"));
//	//String Rating= desktop.RatingByRadioButton("Rating");
//	if("Rating".equalsIgnoreCase("1")) {
//		desktop.getRate1ForCanon().click();
//		//logger.info(desktop.getRate1ForCanon().getAttribute("value"));
//	}else if( "Rating".equalsIgnoreCase("2")) {
//		desktop.getRate2ForCanon().click();
//		//logger.info(desktop.getRate2ForCanon().getAttribute("value"));
//	}else if ("Rating".equalsIgnoreCase("3")) {
//		desktop.getRate3ForCanon().click();
//		//logger.info(desktop.getRate3ForCanon().getAttribute("value"));
//	}else if("Rating".equalsIgnoreCase("4")) {
//		desktop.getRate4ForCanon().click();
//		//logger.info(desktop.getRate4ForCanon().getAttribute("value"));
//	}else if ("Rating".equalsIgnoreCase("5")) {
//		desktop.getRate5ForCanon().click();
//		//logger.info(desktop.getRate5ForCanon().getAttribute("value"));
//	}
	
	
	logger.info("verify user successfully fill the review information ");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {//i put this exception to see if data is correctly intered
		e.printStackTrace();
	}
}

@When("User click on Continue Button")
public void user_click_on_continue_button() {
   desktop.clickOnContinueButtonInCanonPage();
   logger.info("user successfully click on continue button");
}

@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.’")
public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
    desktop.successMessageForReviewOfCanon();
    Utilities.highlightelementRedBorder(desktop.getSuccessMessageforReviewForCanon());
	try {
		Utilities.takeScreenShot("canonsuccessMessage");
	} catch (IOException e) {
		e.printStackTrace();
	}
    logger.info("user can see success message for adding review");
}

}
