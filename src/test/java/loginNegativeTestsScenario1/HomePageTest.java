package loginNegativeTestsScenario1;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends UseCaseBase {

    private static HomePage homePage;

    @BeforeAll
    public static void classSetup(){
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest(){
        homePage.navigateToHomePage();
    }

    @Test //Navigate to the home page
    public void homePageLoadTest(){
        Boolean success = homePage.isLogoVisible();
        assertTrue(success);
    }

    @Test
    public void pressLoginIcon(){
        LoginPage loginPage = homePage.openLoginPage(); //Press login icon
        boolean isLoaded = loginPage.isPageTitleVisible(); //Verify login screen is opened
        assertTrue(isLoaded);
    }
}
