package web_driver.framework.serabiiPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Page {

    private final WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public PokedexHubPage goToPokedexHub() {
        driver.findElement(By.linkText("Pokédex Hub")).click();
        return new PokedexHubPage(driver);
    }

    public SwSHPokedexPage goToSwSHPokedex() {
        driver.findElement(By.linkText("Sword & Shield Pokédex")).click();
        return new SwSHPokedexPage(driver);
    }

    public PokearthPage goToPokearth() {
        driver.findElement(By.linkText("Pokéarth")).click();
        return new PokearthPage(driver);
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}