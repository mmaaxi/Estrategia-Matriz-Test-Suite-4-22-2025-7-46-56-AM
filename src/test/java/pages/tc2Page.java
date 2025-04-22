package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc2Page {

    WebDriver driver;
    By accion2Button = By.id("accion2Button");
    By resultado2Element = By.id("resultado2");

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion2() {
        driver.findElement(accion2Button).click();
    }

    public boolean esResultado2Visible() {
        return driver.findElement(resultado2Element).isDisplayed();
    }
}