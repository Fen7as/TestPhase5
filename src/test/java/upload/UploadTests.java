package upload;

import Pages.UploadPage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UploadTests extends BaseTests {

    @Test
    public void uploadTests(){

        UploadPage uploadPage = homePage.clickOnUploadLink();
        uploadPage.uploadFileFunction("C:\\Users\\Ramzy Fenhas\\IdeaProjects\\TestPhase5\\Folder\\da7fac64854945.5ae00d44bbc33.jpg");
        uploadPage.clickOnUploadButton();
        String actualResult = uploadPage.getFileName();
        String expectedResult = "da7fac64854945.5ae00d44bbc33.jpg";
        assertTrue (actualResult.contains(expectedResult));



    }
}
