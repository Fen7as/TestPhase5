package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {
    WebDriver driver;
    public UploadPage(WebDriver driver) {
    this.driver = driver;
    }
    private final By chooseFile = By.cssSelector("#file-upload");
    private final By uploadButton = By.cssSelector("#file-submit");
    public final By fileName = By.cssSelector(".panel.text-center");


    public void uploadFileFunction(String filePath){
        driver.findElement(chooseFile).sendKeys(filePath);
    }
    public void clickOnUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getFileName(){
        return driver.findElement(fileName).getText();
    }

}
