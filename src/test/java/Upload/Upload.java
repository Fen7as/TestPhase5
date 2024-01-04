package Upload;

import Pages.UploadPage;
import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Upload extends BaseTests {

    @Test
    public void upload(){

        UploadPage uploadPage = homePage.clickOnUploadLink();
        uploadPage.uploadFileFunction("C:\\Users\\Ramzy Fenhas\\IdeaProjects\\TestPhase5\\Folder\\da7fac64854945.5ae00d44bbc33.jpg");
        uploadPage.clickOnUploadButton();
        String actualResult = uploadPage.getFileName();
        String expectedResult = "da7fac64854945.5ae00d44bbc33.jpg";
        assertTrue (actualResult.contains(expectedResult));



    }
}
