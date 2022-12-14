package utility;

import broeserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    public void  clickOnElement(By by){
        WebElement loginLink= driver.findElement(by);
        loginLink.click();
    }
    public void sendTextToElement(By by,String text){
       driver.findElement(by).sendKeys(text);
    }

    public String getTextToElement(By by){
        WebElement actualTextMessageElement= driver.findElement(by);
        return actualTextMessageElement.getText();
    }





}
