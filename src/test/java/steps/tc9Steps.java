package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc9Page;
import static org.junit.Assert.*;

public class tc9Steps {
    WebDriver driver;
    tc9Page page;

    public tc9Steps() {
        // Initialize the driver and the page
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc9Page.class);
    }

    @When("se realiza la Acción 9")
    public void se_realiza_la_Accion_9() {
        page.realizarAccion9();
    }

    @Then("se espera Resultado 9")
    public void se_espera_Resultado_9() {
        assertTrue(page.verificarResultado9());
    }
}