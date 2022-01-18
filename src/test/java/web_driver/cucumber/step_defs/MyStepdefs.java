package web_driver.cucumber.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web_driver.framework.serabiiPom.HomePage;
import web_driver.framework.serabiiPom.PokearthPage;
import web_driver.framework.serabiiPom.PokedexHubPage;
import web_driver.framework.serabiiPom.SwSHPokedexPage;

public class MyStepdefs {

    private HomePage homePage;
    private PokedexHubPage pokedexHub;
    private PokearthPage pokearth;
    private SwSHPokedexPage swSHPokedex;
    private WebDriver driver;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @When("I click on the Pokedex hub link")
    public void iClickOnThePokedexHubLink() {
        pokedexHub = homePage.goToPokedexHub();
    }

    @Then("I will go to the Pokedex hub page")
    public void iWillGoToThePokedexHubPage() {
        Assertions.assertEquals("https://www.serebii.net/pokemon/", pokedexHub.getUrl());
    }

    @When("I click on the Pokearth link")
    public void iClickOnThePokearthLink() {
        pokearth = homePage.goToPokearth();
    }

    @Then("I will go to the Pokearth page")
    public void iWillGoToThePokearthPage() {
        Assertions.assertEquals("https://www.serebii.net/pokearth/", pokearth.getUrl());
    }

    @When("I click on the Sword & Shield pokedex link")
    public void iClickOnTheSwordShieldPokedexLink() {
        swSHPokedex = homePage.goToSwSHPokedex();
    }

    @Then("I will go to the SwShPokedex")
    public void iWillGoToTheSwShPokedex() {
        Assertions.assertEquals("https://www.serebii.net/pokedex-swsh/", swSHPokedex.getUrl());
    }

}