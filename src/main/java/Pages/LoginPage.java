package Pages;

import Consts.Consts;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public static final String LOGIN_HEADER = "//h1[@class='text-center']";
    public static final String USERNAME_FIELD = "//input[@name='customer[email]']";
    public static final String PASSWORD_FIELD = "//input[@name='customer[password]']";
    public static final String SIGN_IN_BUTTON = "//input[@type='submit']";
    public static String usernameIncorrect = "123498@gmail.com";
    public static String passwordIncorrect = "PassPass";
    public static String ERROR_MSG = "//*[contains(text(), 'Incorrect')]";

    public void navigateToLoginPage(){
        webDriver.get(Consts.LOGIN_PAGE_URL);
    }

    public void setUsernameIncorrect(){
        sendTextToElementByXpath(USERNAME_FIELD, usernameIncorrect);
    }

    public void setPasswordIncorrect(){
        sendTextToElementByXpath(PASSWORD_FIELD, passwordIncorrect);
    }

    public void usernameField(){
        findElementByXpath(USERNAME_FIELD);
    }

    public void passwordField() {
        findElementByXpath(PASSWORD_FIELD);
    }

    public void signInButton() {
        clickElementByXpath(SIGN_IN_BUTTON);
    }

    public String setErrorMsg(){
        WebElement errorMessageElement = findElementByXpath(ERROR_MSG);
        return errorMessageElement.getText();
    }

    public boolean isPageTitleVisible() {
        return elementExists(LOGIN_HEADER);
    }
}
