package awesomecucumber.stepdef;

import awesomecucumber.objects.Product;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mystepdef_Addtocart {

    @Given("I'm on the Store page")
    public void i_m_on_the_store_page() {
        System.out.println("Test");
    }
    @When("I add a {product} to the cart")
    public void i_add_a_to_the_cart(Product product) {

        System.out.println("PRODUCT NAME= " +product.getName());
    }
    @Then("I see {int} {product} to the cart")
    public void i_see_to_the_cart(Integer int1, Product product) {
        System.out.println("PRODUCT NAME= " +product.getName());
    }

}
