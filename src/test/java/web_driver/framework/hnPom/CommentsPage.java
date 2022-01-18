package web_driver.framework.hnPom;

import org.openqa.selenium.WebDriver;

public class CommentsPage {

    private final WebDriver driver;

    public CommentsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

}