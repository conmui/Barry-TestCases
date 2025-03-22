import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutPageTest extends BaseTest {
    @Test
    public void verifyAboutPage() {
        AboutPage aboutPage = new AboutPage(driver);

        assertEquals(ABOUT_URL, driver.getCurrentUrl());

        assertTrue(aboutPage.isHeaderVisible());
        assertEquals(ABOUT_HEADER, aboutPage.getHeaderText());

        assertTrue(aboutPage.isQuoteVisible());
        assertEquals(ABOUT_QUOTE, aboutPage.getQuoteText());

        assertTrue(aboutPage.isQuoteReferenceVisible());
        assertEquals(ABOUT_QUOTE_REFERENCE, aboutPage.getQuoteReferenceText());

        assertTrue(aboutPage.isContentVisible());
        assertEquals(ABOUT_CONTENT, aboutPage.getContentText());

        assertTrue(aboutPage.isImageVisible());

        assertTrue(aboutPage.isLogoVisible());
    }
}
