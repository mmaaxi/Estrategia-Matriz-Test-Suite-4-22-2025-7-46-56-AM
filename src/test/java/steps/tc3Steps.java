package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc3Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc3Steps {
    private WebDriver driver;
    private tc3Page page;

    public tc3Steps(WebDriver driver) {
        this.driver = driver;
        this.page = PageFactory.initElements(driver, tc3Page.class);
    }

    @Given("El usuario está en la página inicial")
    public void elUsuarioEstaEnLaPaginaInicial() {
        // Implementar navegación a la página inicial
        driver.get("http://ejemplo.com");
    }

    @When("El usuario realiza Acción 3")
    public void elUsuarioRealizaAccion3() {
        // Implementar lógica para realizar Acción 3
        page.realizarAccion3();
    }

    @Then("El usuario debería ver Resultado 3")
    public void elUsuarioDeberiaVerResultado3() {
        // Implementar verificación de Resultado 3
        page.verificarResultado3();
    }
}