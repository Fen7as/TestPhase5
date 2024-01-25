package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WYSIWYGPage {
    WebDriver driver;
    WebDriverWait wait;
    public WYSIWYGPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String frame = "mce_0_ifr";
    private final By textBox = By.cssSelector("#tinymce");


    private void switchToFrame(){
        driver.switchTo().frame(frame);
    }
    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }



    public void clearTextPlace(){
        switchToFrame();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(textBox,"Your content goes here."));
        driver.findElement(textBox).clear();
        switchToParentFrame();
    }

    public void insertIntoTextBox(String text){
        switchToFrame();
        driver.findElement(textBox).sendKeys(text);
        switchToParentFrame();
    }

    public String textBoxValidation(){
        switchToFrame();
        return driver.findElement(textBox).getText();
    }
}
