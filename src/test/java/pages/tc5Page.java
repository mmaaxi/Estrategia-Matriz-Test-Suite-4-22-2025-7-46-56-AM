package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc5Page {
    WebDriver driver;

    // Define elementos y selectores de la página
    By accion5Button = By.id("accion5Button");
    By resultado5Text = By.id("resultado5Text");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion5() {
        driver.findElement(accion5Button).click();
    }

    public boolean validarResultado5() {
        return driver.findElement(resultado5Text).isDisplayed();
    }
}