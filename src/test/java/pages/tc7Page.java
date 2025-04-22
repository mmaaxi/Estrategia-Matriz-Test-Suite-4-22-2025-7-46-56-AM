package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc7Page {

    WebDriver driver;
    By resultado7 = By.id("resultado7");

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        // Implement the steps to perform Action 7
    }

    public boolean isResultado7Displayed() {
        return driver.findElement(resultado7).isDisplayed();
    }
}