package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.tc7Page;

public class tc7Steps {

    tc7Page page = new tc7Page();

    @Given("I perform Action 7")
    public void iPerformAction7() {
        page.performAction7();
    }

    @Then("I should see Resultado 7")
    public void iShouldSeeResultado7() {
        assertTrue("Resultado 7 not displayed", page.isResultado7Displayed());
    }
}