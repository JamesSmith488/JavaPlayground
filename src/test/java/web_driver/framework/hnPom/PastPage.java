package web_driver.framework.hnPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.LocalDate;

public class PastPage {

    private final By pageTop = By.className("pagetop");
    private final WebDriver driver;

    public PastPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isDateYesterday() {
        String dateCheck = driver.findElement(pageTop).getText();
        String yesterday = LocalDate.now().minusDays(1).toString();
        return dateCheck.contains(yesterday);
    }

}