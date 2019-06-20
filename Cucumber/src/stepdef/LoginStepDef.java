package stepdef;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {
	
	
	@Given("^User navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	   System.out.println("Given");
	}

	@When("^user enter valid email and password$")
	public void user_enter_valid_email_and_password() throws Throwable {
		System.out.println("When");
	}

	@And("^click on login button$")
	public void click_on_login_button() throws Throwable {
		System.out.println("And");
	}

	@Then("^user should be navigated to home page$")
	public void user_should_be_navigated_to_home_page() throws Throwable {
		System.out.println("Then");
	}



}
