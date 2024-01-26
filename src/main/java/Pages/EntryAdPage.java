package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    WebDriver driver;
    WebDriverWait wait;
    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By closeButton = By.cssSelector(".modal-footer > p");
    private final By clickHereButton = By.linkText("click here");



    public void clickOnCloseButton(){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        driver.findElement(closeButton).click();
    }
    public void clickOnClickHereButton(){
        driver.findElement(clickHereButton).click();
    }
}
