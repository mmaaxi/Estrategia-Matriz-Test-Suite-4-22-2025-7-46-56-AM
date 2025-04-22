package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc8Page {

    WebDriver driver;

    By action8Button = By.id("action8Button");
    By result8 = By.id("result8");

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction8() {
        driver.findElement(action8Button).click();
    }

    public boolean isResult8Displayed() {
        return driver.findElement(result8).isDisplayed();
    }
}