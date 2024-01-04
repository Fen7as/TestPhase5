package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCode500Page {
    WebDriver driver;
    public StatusCode500Page(WebDriver driver) {
    this.driver = driver;
    }

    private final By validationMessage = By.xpath("//*[contains(text(),'This page returned a 500 status code.')]");

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }
}
