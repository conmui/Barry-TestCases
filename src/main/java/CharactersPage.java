import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CharactersPage extends BasePage {
    private final By header = By.className("Title");
    private final By quote = By.className("Quote__text");
    private final By quoteReference = By.className("Quote__reference");
    private final By characterName = By.className("Characters__details-name");
    private final By characterDescription = By.className("Characters__details-description");
    private final By characterImage = By.className("Characters__details-image");
    private final By characterClose = By.className("Characters__details-btn");

    public CharactersPage(WebDriver driver) {
        super(driver);
    }

    public boolean isHeaderVisible() {
        return isElementVisible(header);
    }

    public String getHeaderText() {
        return getElementText(header);
    }

    public boolean isQuoteVisible() {
        return isElementVisible(quote);
    }

    public String getQuoteText() {
        return getElementText(quote);
    }

    public boolean isQuoteReferenceVisible() {
        return isElementVisible(quoteReference);
    }

    public String getQuoteReferenceText() {
        return getElementText(quoteReference);
    }

    public void openCharacterCard(String characterName) {
        By locator = By.xpath("//button[@class='CharacterItem__btn']/span[contains(text(),'" + characterName + "')]");

        clickButton(locator);
    }

    public void closeCharacterCard() {
        clickButton(characterClose);
    }

    public boolean isCharacterNameVisible() {
        return isElementVisible(characterName);
    }

    public String getCharacterNameText() {
        return getElementText(characterName);
    }

    public boolean isCharacterDescriptionVisible() {
        return isElementVisible(characterDescription);
    }

    public String getCharacterDescriptionText() {
        return getElementText(characterDescription);
    }

    public boolean isCharacterImageVisible() {
        return isElementVisible(characterImage);
    }
}
