import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    private final By charactersLink = By.linkText("Characters");
    private final By episodesLink = By.linkText("Episodes");

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

    public void clickButton(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));

        button.click();
    }

    //Navbar
    public CharactersPage navigateToCharactersPage() {
        clickButton(charactersLink);

        return new CharactersPage(driver);
    }

    public EpisodesPage navigateToEpisodesPage() {
        clickButton(episodesLink);

        return new EpisodesPage(driver);
    }
}
