package login;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {


    @AfterMethod
    public void assertion(){
        String ActualResult = "";
        String ExpectedResult = "";
        assertTrue(ActualResult.contains(ExpectedResult));
    }

    @Test (priority = 1)
    public void testSuccess(){

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String ActualResult = secureAreaPage.getValidaitonMessage();
        String ExpectedResult = "You logged into a secure area!";
    }

    @Test (priority = 2)
    public void testInvalidUsername(){

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("hh");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String ActualResult = secureAreaPage.getValidaitonMessage();
        String ExpectedResult = "Your username is invalid!";
    }

    @Test (priority = 3)
    public void testInvalidPassword(){

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("hh");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String ActualResult = secureAreaPage.getValidaitonMessage();
        String ExpectedResult = "Your password is invalid!";
    }

}
