package web_driver;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class SerebiiTests {

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
        driver.manage().window().maximize();
        driver.get("https://www.serebii.net/");
    }

    @Test
    @DisplayName("Find Mudkip test")
    void findMudkipTest() {
        driver.findElement(By.linkText("Sword & Shield Pokédex")).click();
        Select hoenn = new Select(driver.findElement(By.name("nav4")).findElement(By.name("SelectURL")));
        hoenn.selectByVisibleText("258 Mudkip");
        Assertions.assertEquals("https://www.serebii.net/pokedex-swsh/mudkip/", driver.getCurrentUrl());
    }

    @Test
    @DisplayName("Find Klefki though Fairy type test")
    void findKlefkiThoughFairyTypeTest() {
        //driver.findElement(By.linkText("Sword & Shield Pokédex")).click();
        //driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(5) .typeimg")).click();
        driver.get("https://www.serebii.net/pokedex-swsh/fairy.shtml");
        driver.findElement(By.linkText("Klefki")).click();
        Assertions.assertEquals("https://www.serebii.net/pokedex-swsh/klefki/", driver.getCurrentUrl());
    }

    @AfterAll
    static void tearDown() {
        service.stop();
    }

}