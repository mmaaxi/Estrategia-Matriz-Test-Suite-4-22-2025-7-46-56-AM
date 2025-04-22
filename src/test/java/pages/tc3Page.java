package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc3Page {
    private WebDriver driver;

    // Elementos de la página
    @FindBy(id = "elementoAccion3")
    private WebElement elementoAccion3;

    @FindBy(id = "elementoResultado3")
    private WebElement elementoResultado3;

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void realizarAccion3() {
        // Interacción con el elemento para realizar Acción 3
        elementoAccion3.click();
    }

    public void verificarResultado3() {
        // Verificación del elemento esperado Resultado 3
        if (!elementoResultado3.isDisplayed()) {
            throw new AssertionError("Resultado 3 no se mostró correctamente.");
        }
    }
}