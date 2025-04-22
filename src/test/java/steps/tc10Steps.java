package steps;

import pages.tc10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class tc10Steps {

    private tc10Page page;

    public tc10Steps() {
        page = new tc10Page();
    }

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("I perform Action 10")
    public void i_perform_action_10() {
        page.performAction10();
    }

    @Then("I should see Resultado 10")
    public void i_should_see_resultado_10() {
        String expectedResult = "Resultado 10";
        String actualResult = page.getResult();
        assertEquals(expectedResult, actualResult);
    }
}