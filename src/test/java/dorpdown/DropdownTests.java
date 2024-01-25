package dorpdown;

import Pages.DropDownPage;
import base.BaseTests;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {

    @Test
    public void dropdownListChoosing() throws InterruptedException {
        DropDownPage dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.chooseFromDropDownList("Option 1");
    }
}
