package Pages;

import Consts.Consts;

public class LoginPage extends HomePage{
    public static final String LOGIN_HEADER = "//h1[@class='Login']";
    public static final String usernameEmpty = "";
    public static final String passwordEmpty = "";
    public static final String usernameIncorrect = "123498";
    public static final String passwordIncorrect = "PassPass";

    public boolean isPageTitleVisible() {
        return elementExists(LOGIN_HEADER);
    }
}
