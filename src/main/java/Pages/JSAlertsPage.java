package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    WebDriver driver;
    public JSAlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By jsAlertButton = By.xpath("//button[contains(text(),\"JS Alert\")]");

    private final By jsConfirmButton = By.xpath("//button[contains(text(),\"JS Confirm\")]");
    private final By jsPromptButton = By.xpath("//button[contains(text(),\"JS Prompt\")]");


    private final By validationMessage = By.cssSelector("#result");

    public void clickOnJSAlertsButton(){
        driver.findElement(jsAlertButton).click();
    }
    public void clickOnJSConfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }
    public void clickOnJSPromptButton(){
        driver.findElement(jsPromptButton).click();
    }


    public void cancelAlert(){
        driver.switchTo().alert().dismiss();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public void insertAlert (String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }

}





