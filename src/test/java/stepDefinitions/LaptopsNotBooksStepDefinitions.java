package stepDefinitions;

import java.io.IOException;

import Core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utilities;

public class LaptopsNotBooksStepDefinitions extends Base {
	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab") // 1
	public void user_click_on_laptop_note_book_tab() {
		laptop.userClickOnLaptopAndNoteBookTab();
		logger.info("user successfully clicked on Laptop And NoteBook tabS");
	}

	@When("User click on Show all Laptop &NoteBook option") // 2
	public void user_click_on_show_all_laptop_note_book_option() {
		laptop.clickOnShowAllLaptopsAndNoteBooksTab();
		logger.info("user successfully click on Show all laptop and noteBook tab");
	}

	@When("User click on MacBook  item") // 3
	public void user_click_on_mac_book_item() {
		laptop.userclickOnMacNooktext();
		logger.info("user successfully click on MacBook item in mackbook item in LAN page");
	}

	@When("User click add to Cart button for MacBook") // 4
	public void user_click_add_to_cart_button_for_mac_book() {
		laptop.addToCartInMacBookPage();
		logger.info("user successfully clicked add to cart in mackbook page");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {/////////////////////////////////////l5amin
		System.out.println("sysout string from step definition"+ string);//raminmethod
		laptop.verifysuccessMassageForaddToCartMacBook(string);//raminmathod
		//laptop.successMassageForaddToCartMacBook();
		//logger.info("user successfully see success message ");
		//String success = laptop.getSuccessMessageforAddMacBookinMacBookPage().getText();
		//if (success.equalsIgnoreCase("Success: You have added MacBook to your shopping cart")) {
		//logger.info("text success is passed");
		//} else {
			//logger.info("text didnt pass????????");
		//}
		try {
			Utilities.highlightelementRedBorder(laptop.getSuccessMessageforAddMacBookinMacBookPage());
			Utilities.takeScreenShot("MacBook success message");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Then("User should see {string} showed to the cart")/////////////////Ramin changed
	public void user_should_see_showed_to_the_cart(String string) {// 6-->602$

		laptop.PriceOnShoppingCartforMacBookP();

		String oneItem = laptop.getPrice602text().getText();/////////////////////////////
		if (oneItem.equalsIgnoreCase("1 item(s) - $602.00")) {
			logger.info("mac price verifyed");
		} else {
			logger.info("price doesnt match"+ laptop.getPrice602text().getText());
		}
		logger.info("user successfully price $602.00");
		Utilities.highlightelementRedBorder(laptop.getPrice602text());
		try {
			Utilities.takeScreenShot(oneItem);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Then("User click on cart option") // 7
	public void user_click_on_cart_option() {
		laptop.clickOnShoppingCartOnMacBookPage();
	}

	@Then("user click on red X button to remove the item from cart") // 8
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptop.clickOnRedXInMacBookPage();
		logger.info("user successfully clicked on red button");}
	
	
	@Then("item should be removed and cart should show {string}")///ramin cahanges
	public void item_should_be_removed_and_cart_should_show(String string) {

		laptop.emptyCartAfterclickOnXSeen();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		laptop.PriceOnShoppingCartforMacBookP();
		logger.info("user successfully price .00");
		String empty = laptop.getPrice602text().getText();// catr is the same as this cart no change in xpath
		if (empty.equalsIgnoreCase("0 item(s) - $0.00")) {
			logger.info("empty cart  text verifyed");
		} else {
			logger.info("empty cart text doesNot verifyed"+ laptop.getPrice602text().getText());
		}
		logger.info("user successfully see empty cart after click onx");
		Utilities.highlightelementRedBorder(laptop.getPrice602text());/////////////////////////////////////////// price
		try {
			Utilities.takeScreenShot("empty cart");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptop.clickOnComparMacBookonDesktopPage();
		logger.info("user successfully click on product comparison Macbook");
	}

	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptop.clickOnComparMacBookonLaptopNoteBookPage();
		logger.info("user successfully clicked on product comparison icon on MacBppkAir");
	}

	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {
		laptop.successMassageforaddingMacBookAironNotebookPage();
		logger.info("user see success masssage for adding macBookAir to product comparison");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptop.clickOnproductComparisonLink();
		logger.info("user successfully clicked on product comparison link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();}
		laptop.productComparisonchrtVerification();
		logger.info("user successfully see product comparison chart");
	}
	
	

	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptop.clickOnWishListSonyVAIO();
	}

	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
		laptop.mustCreateAnAccountMessageVerification();
		Utilities.highlightelementBackground(laptop.getCreatAnAccountMassage());// i create getter method to access
																				// private elament here for highlight
																				// method
		try {
			Utilities.takeScreenShot("massage for creating account");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
		laptop.clickOnMacBookProItem();
	}

	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
		laptop.ValidationmackBookProPrice2000();
//		String p2000 = laptop.getMacBookProPrice2000().getText();
//		if (p2000.equalsIgnoreCase("$2,000.00")) {
//			logger.info("price match");
//		} else {
//			logger.info("price Doesnot match");
//		}
		Utilities.highlightelementRedBorder(laptop.getMacBookProPrice2000());
		try {
			Utilities.takeScreenShot("pric 2000$ for macBookPro");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
