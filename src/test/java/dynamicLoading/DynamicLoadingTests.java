package dynamicLoading;

import Pages.DynamicLoadingPage;
import Pages.OnePage;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class DynamicLoadingTests extends BaseTests {



    @Test
    public void checkOnValidationMessage(){

        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLink();
        OnePage onePage = dynamicLoadingPage.clickOnExampleOneLink();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult,expectedResult);
    }
}
