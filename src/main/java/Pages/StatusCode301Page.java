package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode301Page {
    WebDriver driver;
    public StatusCode301Page(WebDriver driver) {
    this.driver = driver;
    }

    private final By validationMessage = By.xpath("//*[contains(text(),'This page returned a 301 status code.')]");

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }
}
