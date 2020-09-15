 package stepDefnition;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
 @RunWith(Cucumber.class)
 public class MyStepDefinition {

	 @Given("user is on net banking landing page")
	 public void user_is_on_net_banking_landing_page() {
	     // Write code here that turns the phrase above into concrete actions
System.out.println("User navigated launched");	 
}

	 @When("user login to application with {string} and {string}")
	 public void user_login_to_application_with_and(String string, String string2) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new cucumber.api.PendingException();
	 }

	 @Then("cards displayed are {string}")
	 public void cards_displayed_are(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new cucumber.api.PendingException();
	 }



}