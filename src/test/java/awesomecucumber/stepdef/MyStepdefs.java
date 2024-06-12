package awesomecucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {

    @Given("I'm Test")
    public void i_m_test() {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("Given");
    }
    @When("Testing this")
    public void testing_this() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("When");
    }
    @Then("Tested")
    public void tested() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then");
    }


}
