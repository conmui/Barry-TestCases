## Barry Testing

Automation tests for the [Barry](https://elaborate-biscuit-0fa4e1.netlify.app/) website using Java, Selenium, and JUnit. 

The tests verify the correctness of static pages ensuring that all expected content is present and displayed correctly.

## Test cases

CommonElementsTest
- verifyNavbarLogoFooter_AboutPage()
- verifyNavbarLogoFooter_CharactersPage()
- verifyNavbarLogoFooter_EpisodesPage()

AboutPageTest
- verifyUrl()
- verifyHeader()
- verifyQuote()
- verifyContent()
- verifyImage()

EpisodesPageTest
- verifyUrl()
- verifyHeader()
- verifyQuote()
- verifyEpisodeDetails()

CharacterPageTest
- verifyUrl()
- verifyHeader()
- verifyQuote()
- verifyAllCharacterModalDetails()