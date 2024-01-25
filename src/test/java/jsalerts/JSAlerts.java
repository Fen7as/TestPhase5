package jsalerts;

import Pages.HomePage;
import Pages.JSAlertsPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JSAlerts extends BaseTests {

    @Test
    public void jsAlertsTests (){

        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlertsPage();
        jsAlertsPage.clickOnJSAlertsButton();
        jsAlertsPage.acceptAlert();
        String actualResult = jsAlertsPage.getValidationMessage();
        String expectedResult = "You successfully clicked an alert";
        assertEquals(actualResult,expectedResult);
        }

    @Test
    public void jsCancel(){
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlertsPage();
        jsAlertsPage.clickOnJSConfirmButton();
        jsAlertsPage.cancelAlert();
        String actualResult = jsAlertsPage.getValidationMessage();
        String expectedResult = "You clicked: Cancel";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void jsPrompt(){
        JSAlertsPage jsAlertsPage = homePage.clickOnJSAlertsPage();
        jsAlertsPage.clickOnJSPromptButton();
        jsAlertsPage.insertAlert("Test");
        jsAlertsPage.acceptAlert();
        String actualResult = jsAlertsPage.getValidationMessage();
        String expectedResult = "You entered: Test";
        assertEquals(actualResult,expectedResult);
    }

}




