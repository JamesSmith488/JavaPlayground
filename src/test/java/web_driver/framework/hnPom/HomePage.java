package web_driver.framework.hnPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final By comments = By.linkText("comments");
    private final By past = By.linkText("past");
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://news.ycombinator.com/");
    }

    public CommentsPage goToCommentsPage() {
        driver.findElement(comments).click();
        return new CommentsPage(driver);
    }

    public PastPage goToPastPage() {
        driver.findElement(past).click();
        return new PastPage(driver);
    }

}