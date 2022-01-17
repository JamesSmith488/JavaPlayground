package web_driver;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class ToolsQATests {

    private static WebDriver driver;
    private static ChromeDriverService service;

    @BeforeAll
    static void setupAll() {
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("src/test/resources/chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        try {
            service.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver(service);
        driver.get("https://demoqa.com/");
    }

    @Test
    @DisplayName("Testing text box")
    void testingTextBox() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys("Joe Bloggs");
        driver.findElement(By.id("userEmail")).sendKeys("JoeBloggs@example.com");
        driver.findElement(By.id("currentAddress")).sendKeys("123 Example Street", Keys.ENTER, "England");
        driver.findElement(By.id("permanentAddress")).sendKeys("456 Different Road", Keys.ENTER, "America");
        driver.findElement(By.id("submit")).click();
        String results = driver.findElement(By.id("output")).getText();
        String expected = "Name:Joe Bloggs\n" +
                "Email:JoeBloggs@example.com\n" +
                "Current Address :123 Example Street England\n" +
                "Permananet Address :456 Different Road America";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing check box Home")
    void testingCheckBoxHome() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-1")).click();
        driver.findElement(By.className("rct-checkbox")).click();
        String results = driver.findElement(By.id("result")).getText();
        String expected = "You have selected :\n" +
                "home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing check box Public xPath")
    void testingCheckBoxPublicXPath() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-1")).click();
        driver.findElement(By.className("rct-option-expand-all")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[1]/ol/li/ol/li[2]/ol/li[2]/ol/li[1]/span")).click();
        String results = driver.findElement(By.id("result")).getText();
        String expected = "You have selected :\n" +
                "public";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing radio buttons")
    void testingRadioButtons() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-2")).click();
        driver.findElements(By.className("custom-control-label")).get(1).click();
        String results = driver.findElement(By.className("mt-3")).getText();
        String expected = "You have selected " +
                "Impressive";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing click buttons dynamic click")
    void testingClickButtonsDynamicClick() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-4")).click();
        driver.findElements(By.className("btn-primary")).get(2).click();
        String results = driver.findElement(By.id("dynamicClickMessage")).getText();
        String expected = "You have done a dynamic click";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing click buttons right click")
    void testingClickButtonsRightClick() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-4")).click();
        WebElement element = driver.findElements(By.className("btn-primary")).get(1);
        Actions actions = new Actions(driver);
        actions.contextClick(element).perform();
        String results = driver.findElement(By.id("rightClickMessage")).getText();
        String expected = "You have done a right click";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing click buttons double click")
    void testingClickButtonsDoubleClick() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-4")).click();
        WebElement element = driver.findElements(By.className("btn-primary")).get(0);
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
        String results = driver.findElement(By.id("doubleClickMessage")).getText();
        String expected = "You have done a double click";
        Assertions.assertEquals(expected, results);
    }

    @Test
    @DisplayName("Testing links")
    void testingLinks() {
        WebElement cards = driver.findElement(By.className("category-cards"));
        cards.findElement(By.className("card-body")).click();
        driver.findElement(By.className("menu-list")).findElement(By.id("item-5")).click();
        driver.findElement(By.id("simpleLink")).click();
        Set<String> handles = driver.getWindowHandles();
        String tab = (String) handles.toArray()[1];
        driver.switchTo().window(tab);
        String url = driver.getCurrentUrl();
        Assertions.assertEquals("https://demoqa.com/", url);
    }

    @AfterAll
    static void tearDown() {
        service.stop();
    }

}