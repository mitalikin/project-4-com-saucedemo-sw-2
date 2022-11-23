package testsuite;

import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseurl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        sendTextToElement(By.name("user-name"), "standard_user");
        // Enter “secret_sauce” password
        sendTextToElement(By.name("password"), "secret_sauce");
        // Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));
        // Verify the text “PRODUCTS”
        String expectedMessageElement = "PRODUCTS";
        String actualMessageElement = getTextToElement(By.xpath("//span[text()='Products']"));
        Assert.assertEquals("Invalid Text ", expectedMessageElement, actualMessageElement);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter “standard_user” username
        sendTextToElement(By.name("user-name"), "standard_user");
        //Enter “secret_sauce” password
        sendTextToElement(By.name("password"), "secret_sauce");
        // Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));
        // Verify that six products are displayed on page
        boolean isInventoryDisplay = driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();
        System.out.println("products are Displayed:" + isInventoryDisplay);
    }
    @After
    public void testDown() {
        closeBrowser();
    }


}
