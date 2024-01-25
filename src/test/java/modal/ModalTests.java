package modal;

import Pages.EntryAdPage;
import base.BaseTests;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.testng.annotations.Test;

import java.util.Base64;

public class ModalTests extends BaseTests {

    @Test
    public void validateOnModal(){
        boolean presence = false;
        EntryAdPage entryAdPage = homePage.clickOnEntryAdLink();
        try {
            entryAdPage.clickOnCloseButton();

        } catch (NoSuchElementException e) {
            presence = true;
            while (presence == true){
                if (presence = true) {
                    driver.get("https://the-internet.herokuapp.com/");
                    homePage.clickOnEntryAdLink();
                    try {
                        entryAdPage.clickOnCloseButton();
                    } catch (NoSuchElementException ex) {
                    }
                    presence = false;
                }else { presence = true;}
            }
        }


    }







}
