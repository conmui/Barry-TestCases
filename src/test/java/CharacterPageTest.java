import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacterPageTest extends BaseTest {
    @Test
    public void verifyCharacterPage() {
        AboutPage aboutPage = new AboutPage(driver);

        List<Character> characters = new ArrayList<>();
        characters.add(new Character("Barry Berkman", "Bill Hader as Barry Berkman, a depressed former private first class from the U.S. Marines and Afghanistan veteran who works as a hitman but is drawn towards human connection in an acting class. A mentally unstable yet exceptional assassin, Barry longs to put his criminal history behind him to become a full-time performer under the stage name Barry Block, but struggles to stop his past from creeping into the new life he tries to build for himself. The character's struggle with anxiety in a profession for which he has natural talent was inspired by Hader's tenure as a cast member on Saturday Night Live."));
        characters.add(new Character("Monroe Fuches", "Stephen Root as Monroe Fuches, Barry's old family friend since Barry's childhood and a former military cook, who groomed him for his post-military career as a hitman. He is cowardly, manipulative, and self-centered, refusing to believe he has been anything but good to Barry despite consistently abusing him and dragging him back into a life of crime to serve his own personal interests."));
        characters.add(new Character("Sally Reed", "Sarah Goldberg as Sally Reed, an aspiring and talented but struggling actress from Joplin, Missouri. She meets Barry when he joins her acting class and becomes romantically involved with him, culminating in a dysfunctional relationship. Seemingly good-natured but selfish and envious, Sally is focused on gaining fame and fortune as an actress while frequently alternating between bouts of narcissism and self-hatred in both her personal life and creative work."));
        characters.add(new Character("Goran Pazar", "Glenn Fleshler as Goran Pazar, the leader of the Los Angeles branch of the Chechen mafia, who employs Barry to kill a man who has been sleeping with his wife, and whose gang is in conflict with a Bolivian drug cartel. Despite his ruthlessness as a crime boss, he cares greatly for his teenage daughter Natasha."));
        characters.add(new Character("NoHo Hank", "Anthony Carrigan as NoHo Hank, an overly positive, polite, and naïve member of the Chechen mafia, and Goran's best friend and right-hand man, whose birth name is never revealed. Though he would be happier conducting legitimate business, particularly in sales, he sticks to his belief that being a gangster is his life's calling. Hank quickly becomes attached to Barry, who does not reciprocate his attempts at friendship. Following Goran's death, he becomes the leader of the Chechen mafia but struggles with this responsibility as he lacks in the skills necessary to be a gangster. Originally planned to be killed by Barry in the pilot episode, Hank was made a series regular after Carrigan's performance impressed the show's creators."));
        characters.add(new Character("Gene Cousineau", "Henry Winkler as Gene Cousineau, an eccentric acting coach and Barry's mentor whose glory days as a performer are long behind him, having alienated his industry colleagues and loved ones. Cousineau is self-absorbed and rarely seems to help his acting students, in whom he instills a nearly fanatical devotion, unless it directly benefits him. Despite this, he makes a connection with and serves as a father figure to Barry, helping him come to terms with his past atrocities and grow as a person until he learns of his criminal activity."));
        characters.add(new Character("Detective Mae Dunn", "Sarah Burns as Detective Mae Dunn (season 3; recurring season 2; guest season 4), a naïve and obtuse investigator who becomes Loach's partner."));
        characters.add(new Character("Jim Moss", "Robert Wisdom as Jim Moss, the father of LAPD Detective Janice Moss, who previously served in the U.S. Army in the field of psychological warfare."));
        characters.add(new Character("Detective Janice Moss", "Paula Newsome as Detective Janice Moss, a police officer investigating the murder of Ryan Madison, who starts an on-and-off relationship with Gene. Her murder in the first-season finale becomes a central plot point for the remainder of the series."));
        characters.add(new Character("Detective John Loach", "John Pirruccello as Detective John Loach (seasons 1-2), Moss' perpetually depressed partner who later finds himself investigating Barry."));
        characters.add(new Character("Cristobal Sifuentes", "Michael Irby as Cristobal Sifuentes, the leader of the Bolivian mafia's LA branch, Goran's main rival, and later Hank's love interest."));
        characters.add(new Character("Ryan Madison", "Tyler Jacob Moore as Richard Krempf / Ryan Madison, a personal trainer and actor in Gene's class whom Goran hires Barry to kill, though Ryan is instead killed by Chechen assassins."));

        CharactersPage charactersPage = aboutPage.navigateToCharactersPage();

        assertEquals(CHARACTERS_URL, driver.getCurrentUrl());

        assertTrue(charactersPage.isHeaderVisible());
        assertEquals(CHARACTERS_HEADER, charactersPage.getHeaderText());

        assertTrue(charactersPage.isQuoteVisible());
        assertEquals(CHARACTERS_QUOTE, charactersPage.getQuoteText());

        assertTrue(charactersPage.isQuoteReferenceVisible());
        assertEquals(CHARACTERS_QUOTE_REFERENCE, charactersPage.getQuoteReferenceText());

        verifyAllCharacterDetails(characters, charactersPage);
    }

    public void verifyAllCharacterDetails(List<Character> characters, CharactersPage charactersPage) {
        for (Character character : characters) {
            String name = character.getName();
            String description = character.getDescription();

            charactersPage.openCharacterCard(name);

            assertTrue(charactersPage.isCharacterNameVisible());
            assertEquals(name, charactersPage.getCharacterNameText());

            assertTrue(charactersPage.isCharacterDescriptionVisible());
            assertEquals(description, charactersPage.getCharacterDescriptionText());

            assertTrue(charactersPage.isCharacterImageVisible());

            charactersPage.closeCharacterCard();
        }
    }
}
