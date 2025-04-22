package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc6Page {
    private WebDriver driver;
    private By action6Element = By.id("action6ElementId");
    private By resultado6Element = By.id("resultado6ElementId");

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction6() {
        driver.findElement(action6Element).click();
    }

    public boolean isResultado6Displayed() {
        return driver.findElement(resultado6Element).isDisplayed();
    }
}