package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@name='USER_LOGIN']")
    public WebElement emailInput;

    @FindBy(xpath ="//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy (css = ".login-btn")
    public WebElement loginButton;










}
