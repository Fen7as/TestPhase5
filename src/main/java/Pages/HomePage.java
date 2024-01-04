package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By formAuthenticationLink = By.xpath("//*[contains(text(),'Form')]");
    private final By checkBoxLink = By.xpath("//*[contains(text(),\"Check\")]");
    private final By forgetPasswordLink = By.xpath("//*[contains(text(),'Forgot ')]");
    private final By statusCodesLink = By.xpath("//*[contains(text(),'Status')]");
    private final By UploadLink = By.xpath("//*[contains(text(),'Upload')]");

    public LoginPage clickOnFormAuthenticationLink (){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckBoxesPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink(){
        driver.findElement(forgetPasswordLink).click();
        return new ForgetPasswordPage(driver);
    }

    public StatusCodesPage clickOnStatusCodesLink(){
        driver.findElement(statusCodesLink).click();
        return new StatusCodesPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        driver.findElement(UploadLink).click();
        return new UploadPage(driver);
    }

}
