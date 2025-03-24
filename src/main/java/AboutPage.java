import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AboutPage extends BasePage {
    private final By header = By.className("Title");
    private final By quote = By.className("Quote__text");
    private final By quoteReference = By.className("Quote__reference");
    private final By content = By.className("About__content-description");
    private final By image = By.className("About__image");

    public AboutPage(WebDriver driver) {
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

    public boolean isContentVisible() {
        List<WebElement> elems = driver.findElements(content);

        for (WebElement elem : elems) {
            if (!isElementVisible(elem)) {
                return false;
            }
        }
        return true;
    }

    public String getContentText() {
        List<WebElement> elems = driver.findElements(content);
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < elems.size(); i++) {
            text.append(getElementText(elems.get(i)));

            if (i < elems.size() - 1) {
                text.append(" ");
            }
        }

        return text.toString();
    }

    public boolean isImageVisible() {
        return isElementVisible(image);
    }
}
