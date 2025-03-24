import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    private final By aboutLink = By.linkText("About");
    private final By logo = By.className("Logo");
    private final By charactersLink = By.linkText("Characters");
    private final By episodesLink = By.linkText("Episodes");
    private final By footer = By.className("App__footer-ref");
    private final By footerWikipediaLink = By.linkText("WIKIPEDIA");
    private final By footerFandomLink = By.linkText("FANDOM");

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
    public AboutPage navigateToAboutPage() {
        clickButton(aboutLink);

        return new AboutPage(driver);
    }

    public CharactersPage navigateToCharactersPage() {
        clickButton(charactersLink);

        return new CharactersPage(driver);
    }

    public EpisodesPage navigateToEpisodesPage() {
        clickButton(episodesLink);

        return new EpisodesPage(driver);
    }

    //Logo
    public AboutPage navigateToAboutPageByLogo() {
        clickButton(logo);

        return new AboutPage(driver);
    }

    public boolean isLogoVisible() {
        return isElementVisible(logo);
    }

    //Footer
    public boolean isFooterVisible() {
        return isElementVisible(footer);
    }

    public String getFooterText() {
        return getElementText(footer);
    }

    public boolean isFooterWikipediaVisible() {
        return isElementVisible(footerWikipediaLink);
    }

    public String getFooterWikipediaLink() {
        WebElement link = driver.findElement(footerWikipediaLink);

        return link.getDomAttribute("href");
    }

    public boolean isFooterFandomVisible() {
        return isElementVisible(footerFandomLink);
    }

    public String getFooterFandomLink() {
        WebElement link = driver.findElement(footerFandomLink);

        return link.getDomAttribute("href");
    }
}
