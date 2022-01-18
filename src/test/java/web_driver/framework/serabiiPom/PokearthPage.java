package web_driver.framework.serabiiPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PokearthPage extends Page {

    private final WebDriver driver;

    public PokearthPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public WebElement getSinnoh() {
        return driver.findElement(By.name("sinnoh"));
    }

}