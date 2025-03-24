import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CharacterPageTest extends BaseTest {
    @Test
    public void verifyUrl() {
        AboutPage aboutPage = new AboutPage(driver);

        aboutPage.navigateToCharactersPage();

        assertEquals(CHARACTERS_URL, driver.getCurrentUrl());
    }

    @Test
    public void verifyHeader() {
        AboutPage aboutPage = new AboutPage(driver);
        CharactersPage charactersPage = aboutPage.navigateToCharactersPage();

        assertTrue(charactersPage.isHeaderVisible());
        assertEquals(CHARACTERS_HEADER, charactersPage.getHeaderText());
    }

    @Test
    public void verifyQuote() {
        AboutPage aboutPage = new AboutPage(driver);
        CharactersPage charactersPage = aboutPage.navigateToCharactersPage();

        assertTrue(charactersPage.isQuoteVisible());
        assertEquals(CHARACTERS_QUOTE, charactersPage.getQuoteText());

        assertTrue(charactersPage.isQuoteReferenceVisible());
        assertEquals(CHARACTERS_QUOTE_REFERENCE, charactersPage.getQuoteReferenceText());
    }

    @ParameterizedTest
    @MethodSource("charactersProvider")
    public void verifyAllCharacterModalDetails(String characterName, String characterDescription) {
        AboutPage aboutPage = new AboutPage(driver);
        CharactersPage charactersPage = aboutPage.navigateToCharactersPage();

        charactersPage.openCharacterCard(characterName);

        assertTrue(charactersPage.isCharacterNameVisible());
        assertEquals(characterName, charactersPage.getCharacterNameText());

        assertTrue(charactersPage.isCharacterDescriptionVisible());
        assertEquals(characterDescription, charactersPage.getCharacterDescriptionText());

        assertTrue(charactersPage.isCharacterImageVisible());

        charactersPage.closeCharacterCard();
    }

    static Stream<Arguments> charactersProvider() {
        return Stream.of(
                arguments("Barry Berkman", "Bill Hader as Barry Berkman, a depressed former private first class from the U.S. Marines and Afghanistan veteran who works as a hitman but is drawn towards human connection in an acting class. A mentally unstable yet exceptional assassin, Barry longs to put his criminal history behind him to become a full-time performer under the stage name Barry Block, but struggles to stop his past from creeping into the new life he tries to build for himself. The character's struggle with anxiety in a profession for which he has natural talent was inspired by Hader's tenure as a cast member on Saturday Night Live."),
                arguments("Monroe Fuches", "Stephen Root as Monroe Fuches, Barry's old family friend since Barry's childhood and a former military cook, who groomed him for his post-military career as a hitman. He is cowardly, manipulative, and self-centered, refusing to believe he has been anything but good to Barry despite consistently abusing him and dragging him back into a life of crime to serve his own personal interests."),
                arguments("Sally Reed", "Sarah Goldberg as Sally Reed, an aspiring and talented but struggling actress from Joplin, Missouri. She meets Barry when he joins her acting class and becomes romantically involved with him, culminating in a dysfunctional relationship. Seemingly good-natured but selfish and envious, Sally is focused on gaining fame and fortune as an actress while frequently alternating between bouts of narcissism and self-hatred in both her personal life and creative work."),
                arguments("Goran Pazar", "Glenn Fleshler as Goran Pazar, the leader of the Los Angeles branch of the Chechen mafia, who employs Barry to kill a man who has been sleeping with his wife, and whose gang is in conflict with a Bolivian drug cartel. Despite his ruthlessness as a crime boss, he cares greatly for his teenage daughter Natasha."),
                arguments("NoHo Hank", "Anthony Carrigan as NoHo Hank, an overly positive, polite, and naïve member of the Chechen mafia, and Goran's best friend and right-hand man, whose birth name is never revealed. Though he would be happier conducting legitimate business, particularly in sales, he sticks to his belief that being a gangster is his life's calling. Hank quickly becomes attached to Barry, who does not reciprocate his attempts at friendship. Following Goran's death, he becomes the leader of the Chechen mafia but struggles with this responsibility as he lacks in the skills necessary to be a gangster. Originally planned to be killed by Barry in the pilot episode, Hank was made a series regular after Carrigan's performance impressed the show's creators."),
                arguments("Gene Cousineau", "Henry Winkler as Gene Cousineau, an eccentric acting coach and Barry's mentor whose glory days as a performer are long behind him, having alienated his industry colleagues and loved ones. Cousineau is self-absorbed and rarely seems to help his acting students, in whom he instills a nearly fanatical devotion, unless it directly benefits him. Despite this, he makes a connection with and serves as a father figure to Barry, helping him come to terms with his past atrocities and grow as a person until he learns of his criminal activity."),
                arguments("Detective Mae Dunn", "Sarah Burns as Detective Mae Dunn (season 3; recurring season 2; guest season 4), a naïve and obtuse investigator who becomes Loach's partner."),
                arguments("Jim Moss", "Robert Wisdom as Jim Moss, the father of LAPD Detective Janice Moss, who previously served in the U.S. Army in the field of psychological warfare."),
                arguments("Detective Janice Moss", "Paula Newsome as Detective Janice Moss, a police officer investigating the murder of Ryan Madison, who starts an on-and-off relationship with Gene. Her murder in the first-season finale becomes a central plot point for the remainder of the series."),
                arguments("Detective John Loach", "John Pirruccello as Detective John Loach (seasons 1-2), Moss' perpetually depressed partner who later finds himself investigating Barry."),
                arguments("Cristobal Sifuentes", "Michael Irby as Cristobal Sifuentes, the leader of the Bolivian mafia's LA branch, Goran's main rival, and later Hank's love interest."),
                arguments("Ryan Madison", "Tyler Jacob Moore as Richard Krempf / Ryan Madison, a personal trainer and actor in Gene's class whom Goran hires Barry to kill, though Ryan is instead killed by Chechen assassins.")
        );
    }
}
