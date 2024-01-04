package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodesPage {
    WebDriver driver;
    public StatusCodesPage(WebDriver driver) {
    this.driver = driver;
    }

    private final By statusCode200 = By.xpath("//*[contains(text(),\"200\")]");
    private final By statusCode301 = By.xpath("//*[contains(text(),\"301\")]");
    private final By statusCode404 = By.xpath("//*[contains(text(),\"404\")]");
    private final By statusCode500 = By.xpath("//*[contains(text(),\"500\")]");


    public StatusCode200Page clickOnStatusCode200Link(){
        driver.findElement(statusCode200).click();
        return new StatusCode200Page(driver);
    }
    public StatusCode301Page clickOnStatusCode301Link(){
        driver.findElement(statusCode301).click();
        return new StatusCode301Page(driver);
    }
    public StatusCode404Page clickOnStatusCode404Link(){
        driver.findElement(statusCode404).click();
        return new StatusCode404Page(driver);
    }
    public StatusCode500Page clickOnStatusCode500Link(){
        driver.findElement(statusCode500).click();
        return new StatusCode500Page(driver);
    }



}
