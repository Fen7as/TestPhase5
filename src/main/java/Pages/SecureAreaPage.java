package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By validationMessage = By.xpath("//div[@id=\"flash\"]");

    public String getValidaitonMessage(){
        return driver.findElement(validationMessage).getText();
    }

}
