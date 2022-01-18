package web_driver.framework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web_driver.framework.hnPom.HomePage;

public class HackerNewsPOMTests {

    private static WebDriver driver;
    private static HomePage homePage;

    @BeforeAll
    static void setupAll() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
    }

    @Test
    @DisplayName("Check that the comments link goes to the comments page test")
    void checkThatTheCommentsLinkGoesToTheCommentsPageTest() {
        Assertions.assertEquals("https://news.ycombinator.com/newcomments", homePage.goToCommentsPage().getUrl());
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