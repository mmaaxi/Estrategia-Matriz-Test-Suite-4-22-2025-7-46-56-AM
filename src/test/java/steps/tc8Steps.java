package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc8Page;

public class tc8Steps {

    WebDriver driver = new ChromeDriver();
    tc8Page page = new tc8Page(driver);

    @Given("the user is on the initial page")
    public void userIsOnInitialPage() {
        driver.navigate().to("http://example.com");
    }

    @When("the user performs Action 8")
    public void userPerformsAction8() {
        page.performAction8();
    }

    @Then("the user should see Result 8")
    public void userShouldSeeResult8() {
        Assert.assertTrue(page.isResult8Displayed());
        driver.quit();
    }
}