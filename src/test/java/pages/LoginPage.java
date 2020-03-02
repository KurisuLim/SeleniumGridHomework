package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
        AjaxElementLocatorFactory PageFactory = new AjaxElementLocatorFactory(driver, 10);
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h2")
    protected WebElement pageTitle;
    @FindBy(tagName = "h4")
    protected WebElement subHeader;
    @FindBy(id = "username")
    protected WebElement userName;
    @FindBy(id = "password")
    protected WebElement password;
    @FindBy(css = "button[type='submit']")
    protected WebElement loginBtn;
    @FindBy(css = "#flash-messages .flash.error")
    protected WebElement errorMsg;
    @FindBy(css = "#flash-messages .flash.success")
    protected WebElement successMsg;

    public void setUserName(String strUserName){
        userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        password.sendKeys(strPassword);
    }

    public void clickLogin(){
        loginBtn.click();
    }

    public String getLoginTitle(){
        return pageTitle.getText();
    }

    public LoginPage loginUser(String username, String password){
        setUserName(username);
        setPassword(password);
        clickLogin();
        return this;
    }


    public boolean isErrorAlertShow(){
        return errorMsg.isDisplayed();
    }


    public boolean isSuccessAlertShow(){
        return successMsg.isDisplayed();
    }
}