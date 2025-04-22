package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc10Page {

    private WebDriver driver;

    public tc10Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        this.driver = new ChromeDriver();
    }

    public void navigateToInitialPage() {
        driver.get("https://example.com/initialpage");
    }

    public void performAction10() {
        WebElement actionElement = driver.findElement(By.id("action10"));
        actionElement.click();
    }

    public String getResult() {
        WebElement resultElement = driver.findElement(By.id("resultado10"));
        return resultElement.getText();
    }

    public void closeBrowser() {
        driver.quit();
    }
}