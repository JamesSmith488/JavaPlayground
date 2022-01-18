package web_driver.framework.serabiiPom;

import org.openqa.selenium.WebDriver;

public class SwSHPokedexPage extends Page {

    private final WebDriver driver;

    public SwSHPokedexPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

}