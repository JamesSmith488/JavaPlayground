package web_driver;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.List;

public class WedDriverTests {

    private static WebDriver driver;
    private static ChromeOptions options;

    //private static ChromeDriverService service;

    @BeforeAll
    static void setupAll() {
//        service = new ChromeDriverService.Builder()
//                .usingDriverExecutable(new File("src/test/resources/chromedriver.exe"))
//                .usingAnyFreePort()
//                .build();
//        try {
//            service.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @BeforeEach
    void setup() {
        //options = new ChromeOptions();
        //options.addArguments("headless");
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.get("https://news.ycombinator.com/");
    }

    @Test
    @DisplayName("Testing the functions of a web driver tests")
    void testingTheFunctionsOfAWebDriverTests() {
        driver.get("https://news.ycombinator.com/");
        driver.findElement(By.linkText("past")).click();
        Assertions.assertEquals("https://news.ycombinator.com/front", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Check that the past link has yesterday's date test")
    void checkThatThePastLinkHasYesterdaySDateTest() {
        driver.findElement(By.linkText("past")).click();
        String dateCheck = driver.findElement(By.className("pagetop")).getText();
        String yesterday = LocalDate.now().minusDays(1).toString();
        Assertions.assertTrue(dateCheck.contains(yesterday));
    }

    @Test
    @DisplayName("Searching for Java by url test")
    void searchingForJavaByUrlTest() {
        driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
        Assertions.assertEquals("https://hn.algolia.com/?q=Java", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Searching for Java by search value test")
    void searchingForJavaBySearchValueTest() {
        driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
        String searchResult = driver.findElement(By.className("SearchInput")).getAttribute("value");
        Assertions.assertEquals("Java", searchResult);
    }

    @Test
    @DisplayName("Searching for Java by results test")
    void searchingForJavaByResultsTest() {
        driver.findElement(By.name("q")).sendKeys("Java", Keys.ENTER);
        List<WebElement> searchResults = driver.findElements(By.cssSelector("SearchResults"));
        for (WebElement element: searchResults) {
            System.out.println(element.findElement(By.className("Story_title")).getText());
        }
    }

    @AfterAll
    static void tearDown() {
        //service.stop();
        driver.quit();
    }

}