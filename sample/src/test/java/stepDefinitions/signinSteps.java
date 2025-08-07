package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.createAccountutils;


public class signinSteps {
	
	createAccountutils account = new createAccountutils();
	
	
	@When("user click on the signin button")
	public void user_click_on_the_signin_button() throws InterruptedException {
	    account.clickSignin();
	}

	@And("user enter valid login credentials {string} and {string}")
	public void user_enter_valid_login_credentials_and(String email, String password) {
			account.loginCredentials(email, password);
	}

	@And("user sigin to the website")
	public void user_sigin_to_the_website() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be redirected to the account dashboard")
	public void user_should_be_redirected_to_the_account_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
