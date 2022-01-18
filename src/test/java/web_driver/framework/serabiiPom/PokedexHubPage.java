package web_driver.framework.serabiiPom;

import org.openqa.selenium.WebDriver;

public class PokedexHubPage extends Page {

    private final WebDriver driver;

    public PokedexHubPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}