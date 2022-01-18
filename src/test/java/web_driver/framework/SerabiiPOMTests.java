package web_driver.framework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web_driver.framework.serabiiPom.HomePage;

public class SerabiiPOMTests {

    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeAll
    static void setupAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @Test
    @DisplayName("Check that Pokedex Hub link goes to the pokedex hub test")
    void checkThatPokedexHubLinkGoesToThePokedexHubTest() {
        Assertions.assertEquals("https://www.serebii.net/pokemon/", homePage.goToPokedexHub().getUrl());
    }

    @Test
    @DisplayName("Check that Sword & Shield Pokedex link goes to SwShPokedex test")
    void checkThatSwordShieldPokedexLinkGoesToSwShPokedexTest() {
        Assertions.assertEquals("https://www.serebii.net/pokedex-swsh/", homePage.goToSwSHPokedex().getUrl());
    }

    @Test
    @DisplayName("Check that Pokearth link goes to Pokearth test")
    void checkThatPokearthLinkGoesToPokearthTest() {
        Assertions.assertEquals("https://www.serebii.net/pokearth/", homePage.goToPokearth().getUrl());
    }

    @Test
    @DisplayName("Check that Pokearth has a Sinnoh menu test")
    void checkThatPokearthHasASinnohMenuTest() {
        Assertions.assertEquals("Pokéarth: Sinnoh", homePage.goToPokearth().getSinnoh().getText().split("\n")[0]);
    }

    @AfterEach
    void tearDown() {
        driver.close();
    }

    @AfterAll
    static void tearDownAll() {
        driver.quit();
    }

}