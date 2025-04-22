package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc11Page {
    WebDriver driver;

    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "action11Button")
    private WebElement action11Button;

    @FindBy(id = "resultado11Message")
    private WebElement resultado11Message;

    public void navigateToInitialPage() {
        driver.get("https://example.com/initialpage");
    }

    public void performAction11() {
        action11Button.click();
    }

    public boolean isResultado11Displayed() {
        return resultado11Message.isDisplayed();
    }
}