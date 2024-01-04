package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    WebDriver driver;
    public ForgetPasswordPage(WebDriver driver) {
    this.driver = driver;
    }

    private final By emailField = By.cssSelector("#email");
    private final By retrievePasswordButton = By.cssSelector(".icon-2x.icon-signin");
    private final By validationMessage = By.xpath("//*[contains(text(),\"Internal Server Error\")]");


    public void insertEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickOnRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
    }

    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }


}
