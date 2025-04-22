package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc2Page;

public class tc2Steps {

    WebDriver driver;
    tc2Page page;

    @Given("el usuario está en la página inicial")
    public void el_usuario_esta_en_la_pagina_inicial() {
        driver = new ChromeDriver();
        driver.get("https://www.example.com");
        page = new tc2Page(driver);
    }

    @When("el usuario realiza la acción 2")
    public void el_usuario_realiza_la_accion_2() {
        page.realizarAccion2();
    }

    @Then("el resultado 2 es visible en la pantalla")
    public void el_resultado_2_es_visible_en_la_pantalla() {
        assertTrue(page.esResultado2Visible());
        driver.quit();
    }
}