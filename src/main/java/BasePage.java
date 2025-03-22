import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementVisible(By locator) {
        WebElement elem = driver.findElement(locator);

        return elem.isDisplayed();
    }

    public boolean isElementVisible(WebElement locator) {
        return locator.isDisplayed();
    }

    public String getElementText(By locator) {
        WebElement elem = driver.findElement(locator);

        return elem.getText();
    }

    public String getElementText(WebElement locator) {
        return locator.getText();
    }
}
