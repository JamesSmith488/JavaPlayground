package web_driver.framework.serabiiPom;

import org.openqa.selenium.WebDriver;

public class HomePage extends Page{

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("https://www.serebii.net/");
    }

}