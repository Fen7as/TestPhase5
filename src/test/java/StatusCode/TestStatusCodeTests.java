package StatusCode;

import Pages.*;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestStatusCodeTests extends BaseTests {





    @Test(priority = 1)
    public void StatusCode200(){

        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodesLink();
        StatusCode200Page statusCode200Page = statusCodesPage.clickOnStatusCode200Link();
        String actualResult = statusCode200Page.getValidationMessage();
        String expectedResult = "This page returned a 200 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void StatusCode301(){

        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodesLink();
        StatusCode301Page statusCode301Page = statusCodesPage.clickOnStatusCode301Link();
        String actualResult = statusCode301Page.getValidationMessage();
        String expectedResult = "This page returned a 301 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 3)
    public void StatusCode404(){

        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodesLink();
        StatusCode404Page statusCode404Page = statusCodesPage.clickOnStatusCode404Link();
        String actualResult = statusCode404Page.getValidationMessage();
        String expectedResult = "This page returned a 404 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 4)
    public void StatusCode500(){


        StatusCodesPage statusCodesPage = homePage.clickOnStatusCodesLink();
        StatusCode500Page statusCode500Page = statusCodesPage.clickOnStatusCode500Link();
        String actualResult = statusCode500Page.getValidationMessage();
        String expectedResult = "This page returned a 500 status code.";
        assertTrue(actualResult.contains(expectedResult));
    }
}
