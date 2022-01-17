package web_driver;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WebDriverBasicTests {

    private static WebDriver driver;

    @BeforeAll
    static void setupAll() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Window navigation test")
    void windowNavigationTest() {
        driver.get("https://news.ycombinator.com/");
        String originalTab = driver.getWindowHandle();
        driver.findElement(By.linkText("new")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for(String tab : handles) {
            if (!originalTab.equals(tab)) {
                driver.switchTo().window(tab);
                break;
            }
        }
    }



    @AfterAll
    static void tearDown() {
        //driver.quit();
    }

}