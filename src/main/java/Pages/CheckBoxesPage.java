package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {
    WebDriver driver;
    public CheckBoxesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By firstCheckBox = By.xpath("(//*[@type=\"checkbox\"])[1]");
    private final By secondCheckBox = By.xpath("(//*[@type=\"checkbox\"])[2]");

    public void isFirstBoxSelected(){
        driver.findElement(firstCheckBox).isSelected();
    }
    public void isSecondBoxSelected(){
        driver.findElement(secondCheckBox).isSelected();
    }






}
