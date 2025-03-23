import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    protected final String ABOUT_URL = "https://elaborate-biscuit-0fa4e1.netlify.app/";
    protected final String ABOUT_HEADER = "About";
    protected final String ABOUT_QUOTE = "\"That's the title. They can't cut that!\"";
    protected final String ABOUT_QUOTE_REFERENCE = "— Gene Cousineau, Barry Season 2: The Audition";
    protected final String ABOUT_CONTENT = "Barry is an American black comedy crime drama television series created by Alec Berg and Bill Hader that premiered on HBO on March 25, 2018, and concluded on May 28, 2023, after four seasons and 32 episodes. Hader stars as Barry Berkman, a former U.S. Marine from Cleveland who works as a hitman; upon traveling to Los Angeles to kill a target, he finds himself joining an acting class taught by Gene Cousineau (Henry Winkler), where he meets aspiring actress Sally Reed (Sarah Goldberg) and begins to question his path in life as he deals with his criminal associates such as Monroe Fuches (Stephen Root) and NoHo Hank (Anthony Carrigan). Barry received critical acclaim, with most praise going to its directing, writing, originality, humor, characters, and performances (particularly those of Hader and Winkler) as well as its examination of its subject matter. Several critics have labeled it as one of the best television series of all time. The series has received various accolades, including 44 Primetime Emmy Award nominations. Hader won Outstanding Lead Actor in a Comedy Series twice, while Winkler won Outstanding Supporting Actor in a Comedy Series for his performance in the first season. For the second season, Winkler, Root, and Carrigan all received Emmy nominations for Outstanding Supporting Actor, while Goldberg received a nomination for Outstanding Supporting Actress. Hader, Winkler, and Carrigan each received two more nominations for the third and fourth seasons. All four seasons of Barry were nominated for the Primetime Emmy Award for Outstanding Comedy Series.";
    protected final String CHARACTERS_URL = "https://elaborate-biscuit-0fa4e1.netlify.app/characters";
    protected final String CHARACTERS_HEADER = "Characters";
    protected final String CHARACTERS_QUOTE = "\"Like a good leader, I'm gonna get us some Ubers.\"";
    protected final String CHARACTERS_QUOTE_REFERENCE = "— NoHo Hank, Barry Season 2: The Audition";
    protected final String EPISODES_URL = "https://elaborate-biscuit-0fa4e1.netlify.app/episodes";
    protected final String EPISODES_HEADER = "Episodes";
    protected final String EPISODES_QUOTE = "What?!";
    protected final String EPISODES_QUOTE_REFERENCE = "— Barry Berkman, Barry Season 2: What?!";

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://elaborate-biscuit-0fa4e1.netlify.app/");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }
}
