package Pages;

import Consts.Consts;

public class HomePage extends BasePage {

    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String LOGIN_ICON = "//a[@class='site-header__account']";

    public void navigateToHomePage(){
        webDriver.get(Consts.HOME_PAGE_URL);
    }

    public boolean isLogoVisible(){
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }

    public LoginPage openLoginPage(){
        clickElementByXpath(LOGIN_ICON);
        return new LoginPage();
    }
}
