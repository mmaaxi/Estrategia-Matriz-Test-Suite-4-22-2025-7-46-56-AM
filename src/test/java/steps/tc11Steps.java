package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc11Page;
import static org.junit.Assert.assertTrue;

public class tc11Steps {
    WebDriver driver;
    tc11Page page;

    public tc11Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, tc11Page.class);
    }

    @Given("^I am on the initial page$")
    public void i_am_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("^I perform Action 11$")
    public void i_perform_action_11() {
        page.performAction11();
    }

    @Then("^I should see Resultado 11$")
    public void i_should_see_resultado_11() {
        assertTrue("Expected result not found", page.isResultado11Displayed());
    }
}