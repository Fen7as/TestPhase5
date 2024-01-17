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
    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");




    public void clickOnLink(By locator){
        driver.findElement(locator).click();
    }


    public LoginPage clickOnFormAuthenticationLink (){
        clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public CheckBoxesPage clickOnCheckBoxLink(){
        clickOnLink(checkBoxLink);
        return new CheckBoxesPage(driver);
    }

    public ForgetPasswordPage clickOnForgetPasswordLink(){
        clickOnLink(forgetPasswordLink);
        return new ForgetPasswordPage(driver);
    }

    public StatusCodesPage clickOnStatusCodesLink(){
        clickOnLink(statusCodesLink);
        return new StatusCodesPage(driver);
    }

    public UploadPage clickOnUploadLink(){
        clickOnLink(UploadLink);
        return new UploadPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }
}
