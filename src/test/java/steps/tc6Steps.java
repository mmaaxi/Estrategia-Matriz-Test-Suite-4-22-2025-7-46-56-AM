package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc6Page;

public class tc6Steps {
    private WebDriver driver;
    private tc6Page page;

    @Given("I have navigated to the initial page")
    public void i_have_navigated_to_the_initial_page() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://initial.page.url");
        page = new tc6Page(driver);
    }

    @When("I perform Action 6")
    public void i_perform_action_6() {
        page.performAction6();
    }

    @Then("I should see Resultado 6")
    public void i_should_see_resultado_6() {
        Assert.assertTrue(page.isResultado6Displayed());
        driver.quit();
    }
}