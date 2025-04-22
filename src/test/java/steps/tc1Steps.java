package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc1Page;
import static org.junit.Assert.assertTrue;

public class tc1Steps {
    WebDriver driver;
    tc1Page page;

    @Given("que el usuario abre la aplicación")
    public void que_el_usuario_abre_la_aplicacion() {
        // Inicializar el WebDriver y abrir la aplicación
        driver = // Crear instancia de WebDriver
        page = PageFactory.initElements(driver, tc1Page.class);
    }

    @When("el usuario realiza la Acción 1")
    public void el_usuario_realiza_la_acccion_1() {
        // Llamar al método de la página para realizar la Acción 1
        page.realizarAccion1();
    }

    @Then("el usuario debería ver el Resultado 1")
    public void el_usuario_deberia_ver_el_resultado_1() {
        // Verificar si el Resultado 1 es visible
        assertTrue("Resultado 1 no es visible", page.verificarResultado1());
    }
}