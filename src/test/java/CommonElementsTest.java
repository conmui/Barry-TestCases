import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonElementsTest extends BaseTest {
    @Test
    public void verifyNavbarLogoFooter_AboutPage() {
        AboutPage aboutPage = new AboutPage(driver);

        //Navbar
        aboutPage.navigateToAboutPage();
        assertEquals(ABOUT_URL, driver.getCurrentUrl());

        aboutPage.navigateToCharactersPage();
        assertEquals(CHARACTERS_URL, driver.getCurrentUrl());

        driver.navigate().back();

        aboutPage.navigateToEpisodesPage();
        assertEquals(EPISODES_URL, driver.getCurrentUrl());

        driver.navigate().back();

        //Logo
        verifyLogo(aboutPage);

        //Footer
        verifyFooter(aboutPage);
    }

    @Test
    public void verifyNavbarLogoFooter_CharactersPage() {
        AboutPage aboutPage = new AboutPage(driver);
        CharactersPage charactersPage = aboutPage.navigateToCharactersPage();

        //Navbar
        charactersPage.navigateToAboutPage();
        assertEquals(ABOUT_URL, driver.getCurrentUrl());

        driver.navigate().back();

        charactersPage.navigateToCharactersPage();
        assertEquals(CHARACTERS_URL, driver.getCurrentUrl());

        charactersPage.navigateToEpisodesPage();
        assertEquals(EPISODES_URL, driver.getCurrentUrl());

        driver.navigate().back();

        //Logo
        verifyLogo(charactersPage);

        charactersPage.navigateToCharactersPage();

        //Footer
        verifyFooter(charactersPage);
    }

    @Test
    public void verifyNavbarLogoFooter_EpisodesPage() {
        AboutPage aboutPage = new AboutPage(driver);
        EpisodesPage episodesPage = aboutPage.navigateToEpisodesPage();

        //Navbar
        episodesPage.navigateToAboutPage();
        assertEquals(ABOUT_URL, driver.getCurrentUrl());

        driver.navigate().back();

        episodesPage.navigateToCharactersPage();
        assertEquals(CHARACTERS_URL, driver.getCurrentUrl());

        driver.navigate().back();

        episodesPage.navigateToEpisodesPage();
        assertEquals(EPISODES_URL, driver.getCurrentUrl());

        //Logo
        verifyLogo(episodesPage);

        episodesPage.navigateToEpisodesPage();

        //Footer
        verifyFooter(episodesPage);
    }

    public void verifyLogo(BasePage page) {
        assertTrue(page.isLogoVisible());

        page.navigateToAboutPageByLogo();
        assertEquals(ABOUT_URL, driver.getCurrentUrl());
    }

    public void verifyFooter(BasePage page) {
        assertTrue(page.isFooterVisible());
        assertEquals(FOOTER_CONTENT, page.getFooterText());

        assertTrue(page.isFooterWikipediaVisible());
        assertEquals(FOOTER_WIKIPEDIA_URL, page.getFooterWikipediaLink());

        assertTrue(page.isFooterFandomVisible());
        assertEquals(FOOTER_FANDOM_URL, page.getFooterFandomLink());
    }
}
