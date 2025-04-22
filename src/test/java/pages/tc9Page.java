package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class tc9Page {
    WebDriver driver;

    @FindBy(id = "elementForAction9") // Update this locator as necessary
    WebElement elementoAccion9;

    @FindBy(id = "elementForResult9") // Update this locator as necessary
    WebElement elementoResultado9;

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion9() {
        elementoAccion9.click();
    }

    public boolean verificarResultado9() {
        return elementoResultado9.isDisplayed();
    }
}