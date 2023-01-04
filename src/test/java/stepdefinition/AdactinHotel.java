package stepdefinition;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import cucumberproject.cucumber001.Base;
import cucumberproject.cucumber001.POM;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotel extends Base {
	
	
	@Given("the user launch the browser")
	public void the_user_launch_the_browser() {
		BrowserLaunch("Chrome");
	}

	@Given("the user opens the login page")
	public void the_user_opens_the_login_page() throws IOException {
		
		Url("https://adactinhotelapp.com");
		Maximize();
	}
	

	@Given("the user enters username and password")
	public void the_user_enters_username_and_password(DataTable dataTable) {
		PageFactory.initElements(driver, POM.class);
		InputValue(POM.username,dataTable.cell(0, 0));
		InputValue(POM.password,dataTable.cell(0,1 ));
	}
	
	@When("the user clicks login button and it navigates to search hotel page")
	public void the_user_clicks_login_button_and_it_navigates_to_search_hotel_page() {
		Click(POM.login);
	}
	
	
	@Given("the user selects location, hotels, room type,number of rooms")
	public void the_user_selects_location_hotels_room_type_number_of_rooms() {
		Select drop = select(POM.location);
	    drop.selectByValue("London");  
	    Select drop1 = select(POM.hotels);
	    drop1.selectByIndex(3);  
	    Select drop2 = select(POM.roomtype);
		drop2.selectByVisibleText("Deluxe"); 
		Select drop3= select(POM.numberofrooms);
	    drop3.selectByValue("2");
	}
	@Then("the user clears check in date and check out date")
	public void the_user_clears_check_in_date_and_check_out_date() {
		Clear(POM.datain);
		Clear(POM.dateout);
	}
	@Then("the user enters valid check in date and check out date")
	public void the_user_enters_valid_check_in_date_and_check_out_date() {
		InputValue(POM.datain, "17/12/2022");
		InputValue(POM.dateout, "18/12/2022");
	}
	@Then("the user selects adults per room and children per room")
	public void the_user_selects_adults_per_room_and_children_per_room() {
		Select drop4 =select(POM.adultperroom);
		drop4.selectByValue("3");  
		Select drop5 = select(POM.childrenperroom);
		drop5.selectByValue("3");  
	}
	
	@When("the user clicks search button and it navigates to select hotel page")
	public void the_user_clicks_search_button_and_it_navigates_to_select_hotel_page() {
		 Click(POM.search);
	}

	@Given("the user clicks valid hotel")
	public void the_user_clicks_valid_hotel() {
		Click(POM.radiobutton);
	}
	
	@When("the user clicks continue button and it navigates to book a hotel page")
	public void the_user_clicks_continue_button_and_it_navigates_to_book_a_hotel_page() {
		Click(POM.continue1);
		   
	}
	
	@Given("the user enters first name, last name, billing address, credit card number")
	public void the_user_enters_first_name_last_name_billing_address_credit_card_number() {
		InputValue(POM.firstname, "DEEPA");
		InputValue(POM.lastname, "ROBIN");
		InputValue(POM.address, "ANNA NAGAR,CHENNAI");
		InputValue(POM.creditcardnumber, "1345698864350534");
	}
	@Given("the user selects credit card type, expiry month , expiry year")
	public void the_user_selects_credit_card_type_expiry_month_expiry_year() {
		 Select drop6 = select(POM.creditcardtype);
		 drop6.selectByValue("VISA");  
		 Select drop7 =  select(POM.ccexpirymonth);
		 drop7.selectByValue("12");  
		 Select drop8 =  select(POM.ccexpiryyear);
		 drop8.selectByValue("2022");  
	}
	@Then("the user enters cvv number")
	public void the_user_enters_cvv_number() {
		InputValue(POM.ccvnumber, "564");
	}
	@When("the user clicks book now button and it navigates to booking confirmation page")
	public void the_user_clicks_book_now_button_and_it_navigates_to_booking_confirmation_page() {
		Click(POM.booknow);
	}











}
