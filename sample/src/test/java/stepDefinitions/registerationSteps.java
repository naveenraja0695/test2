package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import utils.createAccountutils;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class registerationSteps {
	
     WebDriver driver;
     createAccountutils account = new createAccountutils();
	@Given("user open the Magento website")
	public void i_open_the_magento_website()  {
		
	    account.launchBrowser();
	    account.openHomePage();
	}

	@When("user click on the {string} link")
	public void i_click_on_the_link(String string)  {
	    account.openCreateAnAccount(string);
	    account.closeAd();
	}

	@And("user enter valid details for {string}, {string}, {string}, {string} and {string}")
	public void i_enter_valid_details_for_and(String firstname, String lastname, String email, String password, String confirmpass) {
	    account.userDetails(firstname, lastname, email, password, confirmpass);
	    }

	@And("user click on the {string} button")
	public void i_click_on_the_button(String string)  {
	    account.clickCreateButton( string);
	}

	@Then("user should see a success message after account creation")
	public void i_should_see_a_success_message_after_account_creation() {
//		WebElement actual =driver.findElement(By.xpath("//div[text()='Thank you for registering with Main Website Store.']"));
//	    Assert.assertEquals(actual.getText(), "Thank you for registering with Main Website Store.");
	    account.verifySuccessRegistration();
		account.closeBrowser();
	     
	}

}
