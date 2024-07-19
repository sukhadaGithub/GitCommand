package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.RegistrPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterTest {
	
	public static RegistrPage rp;
	
	@Given("User on  registration page")
	public void user_on_registration_page() {
		BaseClass.initilization();
	  
	}

	@When("Enter general details")
	public void enter_general_details() {
		rp=new RegistrPage();
	   rp.enterDetails("Sukhada", "Thane","MAHARASHTRA", "India", "THANE", "sukhada.naik@gmail.com", "9632587410");
	}

	@When("Enter Questions and ans")
	public void enter_questions_and_ans() {
		rp=new RegistrPage();
	    rp.enterQuestion("Who is your favorite Hero???", "Father");
	}

	@When("Choose username and password")
	public void choose_username_and_password() {
		rp=new RegistrPage();
	   rp.enterUsername("sukhada", "Naik@123", "Naik@123");
	}

	@Then("Click on submit")
	public void click_on_submit() {
	   rp.clickSubmit();
	}

}
