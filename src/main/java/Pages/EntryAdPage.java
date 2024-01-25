package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {
    WebDriver driver;
    WebDriverWait wait;
    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By closeButton = By.linkText("Close");

    private final By clickHereButton = By.linkText("click here");



    public void clickOnCloseButton(){
        driver.findElement(closeButton).click();
    }
    public void clickOnClickHereButton(){
        driver.findElement(clickHereButton).click();
    }
}
