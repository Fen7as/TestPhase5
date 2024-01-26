package modal;

import Pages.EntryAdPage;
import base.BaseTests;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;


public class ModalTests extends BaseTests {

    @Test
    public void validateOnModal() {
        boolean presence = false;
        EntryAdPage entryAdPage = homePage.clickOnEntryAdLink();
        try {
            entryAdPage.clickOnCloseButton();

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            presence = true;
            while (presence == true){
                    driver.get("https://the-internet.herokuapp.com/");
                    homePage.clickOnEntryAdLink();
                    try {
                        entryAdPage.clickOnCloseButton();
                        presence = false;
                    } catch (NoSuchElementException | ElementNotInteractableException ex) {


                }
            }
        }


    }







}
