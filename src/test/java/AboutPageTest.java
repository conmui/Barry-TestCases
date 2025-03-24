import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutPageTest extends BaseTest {
    @Test
    public void verifyUrl() {
        assertEquals(ABOUT_URL, driver.getCurrentUrl());
    }

    @Test
    public void verifyHeader() {
        AboutPage aboutPage = new AboutPage(driver);

        assertTrue(aboutPage.isHeaderVisible());
        assertEquals(ABOUT_HEADER, aboutPage.getHeaderText());
    }

    @Test
    public void verifyQuote() {
        AboutPage aboutPage = new AboutPage(driver);

        assertTrue(aboutPage.isQuoteVisible());
        assertEquals(ABOUT_QUOTE, aboutPage.getQuoteText());

        assertTrue(aboutPage.isQuoteReferenceVisible());
        assertEquals(ABOUT_QUOTE_REFERENCE, aboutPage.getQuoteReferenceText());
    }

    @Test
    public void verifyContent() {
        AboutPage aboutPage = new AboutPage(driver);

        assertTrue(aboutPage.isContentVisible());
        assertEquals(ABOUT_CONTENT, aboutPage.getContentText());
    }

    @Test
    public void verifyImage() {
        AboutPage aboutPage = new AboutPage(driver);

        assertTrue(aboutPage.isImageVisible());
    }
}
