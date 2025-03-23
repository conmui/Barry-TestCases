import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EpisodesPage extends BasePage {
    private final By header = By.className("Title");
    private final By quote = By.className("Quote__text");
    private final By quoteReference = By.className("Quote__reference");
    private final By name = By.className("Episodes__content__details-title");
    private final By season = By.xpath("//li[@class='Episodes__content__details-list-item' and contains(., 'Season')]");
    private final By episode = By.xpath("//li[@class='Episodes__content__details-list-item' and contains(., 'Episode')]");
    private final By directedBy = By.xpath("//li[@class='Episodes__content__details-list-item' and contains(., 'Directed by')]");
    private final By writtenBy = By.xpath("//li[@class='Episodes__content__details-list-item' and contains(., 'Written by')]");
    private final By originalAirDate = By.xpath("//li[@class='Episodes__content__details-list-item' and contains(., 'Original air date')]");
    private final By description = By.className("Episodes__content__details-summary");
    private final By episodeImage = By.className("Episodes__content__details-image");

    public EpisodesPage(WebDriver driver) {
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

    public void clickEpisode(String seasonEpisode) {
        By locator = By.xpath("//button[@class='EpisodeItem__btn']/span[contains(., '" + seasonEpisode + "')]");

        clickButton(locator);
    }

    public boolean isEpisodeNameVisible() {
        return isElementVisible(name);
    }

    public String getEpisodeNameText() {
        return getElementText(name);
    }

    public boolean isSeasonVisible() {
        return isElementVisible(season);
    }

    public String getSeasonText() {
        return getElementText(season);
    }

    public boolean isEpisodeVisible() {
        return isElementVisible(episode);
    }

    public String getEpisodeText() {
        return getElementText(episode);
    }

    public boolean isDirectedByVisible() {
        return isElementVisible(directedBy);
    }

    public String getDirectedByText() {
        return getElementText(directedBy);
    }

    public boolean isWrittenByVisible() {
        return isElementVisible(writtenBy);
    }

    public String getWrittenByText() {
        return getElementText(writtenBy);
    }

    public boolean isOriginalAirDateVisible() {
        return isElementVisible(originalAirDate);
    }

    public String getOriginalAirDateText() {
        return getElementText(originalAirDate);
    }

    public boolean isDescriptionVisible() {
        return isElementVisible(description);
    }

    public String getDescriptionText() {
        return getElementText(description);
    }

    public boolean isEpisodeImageVisible() {
        return isElementVisible(episodeImage);
    }
}
