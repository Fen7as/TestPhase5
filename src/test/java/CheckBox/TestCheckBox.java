package CheckBox;

import Pages.CheckBoxesPage;
import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class TestCheckBox extends BaseTests {




    @Test
    public void checkBoxValidation(){

        CheckBoxesPage checkBoxesPage = homePage.clickOnCheckBoxLink();
        checkBoxesPage.isFirstBoxSelected();
        checkBoxesPage.isSecondBoxSelected();
    }


}
