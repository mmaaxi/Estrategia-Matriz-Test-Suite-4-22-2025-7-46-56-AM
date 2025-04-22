package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc4Page;

import static org.junit.Assert.assertTrue;

public class tc4Steps {

    WebDriver driver;
    tc4Page page;

    public tc4Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc4Page.class);
    }

    @Given("que el usuario abre la aplicación")
    public void abrirAplicacion() {
        driver.get("url_de_la_aplicacion");
    }

    @When("el usuario realiza Acción 4")
    public void realizarAccion4() {
        page.realizarAccion4();
    }

    @Then("el resultado esperado es Resultado 4")
    public void verificarResultado4() {
        assertTrue(page.verificarResultado4());
    }
}