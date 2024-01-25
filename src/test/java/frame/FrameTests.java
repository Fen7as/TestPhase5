package frame;

import Pages.WYSIWYGPage;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;



public class FrameTests extends BaseTests {



    @Test
    public void validateOnTextBox() throws InterruptedException {

        WYSIWYGPage wysiwygPage = homePage.clickOnWYSIWYGLink();
        wysiwygPage.clearTextPlace();
        String expectedResult = "Hello World!";
        wysiwygPage.insertIntoTextBox(expectedResult);
        String actualResult = wysiwygPage.textBoxValidation();
        assertEquals(actualResult,expectedResult);
    }



}
