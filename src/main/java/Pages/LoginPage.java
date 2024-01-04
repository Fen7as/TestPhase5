package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By usernameField = By.xpath("//input[@name=\"username\"]");
    private final By passwordField = By.cssSelector("#password");
    private final By loginButton = By.cssSelector(".fa.fa-2x.fa-sign-in");


    public void insertUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void insertPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickOnLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage (driver);
    }
}
