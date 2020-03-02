package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage page;

    @BeforeMethod
    public void loginPage(){
        page = new LoginPage(driver);
    }

    @Test
    public void emptyLogin(){
        page.loginUser("","");
        Assert.assertTrue(page.isErrorAlertShow());
    }

    @Test
    public void invalidLogin(){
        page.loginUser("JohnDoe","TestProRocks!");
        Assert.assertTrue(page.isErrorAlertShow());
    }

    @Test
    public void validLogin(){
        page.loginUser("tomsmith","SuperSecretPassword!");
        Assert.assertTrue(page.isErrorAlertShow());
    }
}
