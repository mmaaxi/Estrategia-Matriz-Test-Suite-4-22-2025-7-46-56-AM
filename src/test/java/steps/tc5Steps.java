package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver;
    tc5Page page;

    @Given("^el usuario está en la página principal$")
    public void el_usuario_está_en_la_página_principal() {
        driver = new ChromeDriver();
        driver.get("http://example.com");
        page = new tc5Page(driver);
    }

    @When("^el usuario realiza Acción 5$")
    public void el_usuario_realiza_Acción_5() {
        page.realizarAccion5();
    }

    @Then("^se muestra Resultado 5$")
    public void se_muestra_Resultado_5() {
        Assert.assertTrue(page.validarResultado5());
        driver.quit();
    }
}