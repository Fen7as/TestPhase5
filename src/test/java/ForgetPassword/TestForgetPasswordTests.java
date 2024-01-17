package ForgetPassword;

import Pages.ForgetPasswordPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestForgetPasswordTests extends BaseTests {

    @Test
    public void forgetPasswordValidation(){

        ForgetPasswordPage forgetPasswordPage = homePage.clickOnForgetPasswordLink();
        forgetPasswordPage.insertEmail("123");
        forgetPasswordPage.clickOnRetrievePasswordButton();
        String actualResult = forgetPasswordPage.getValidationMessage();
        String expectedResult = "Internal Server Error";
        assertTrue(actualResult.contains(expectedResult));

    }


}
