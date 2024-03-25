package loginNegativeTestsScenario1;

import Pages.LoginPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends UseCaseBase {
    private static LoginPage loginPage;

    @BeforeAll
    public static void classSetup(){
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void beforeTest(){
        loginPage.navigateToLoginPage();
    }

    @Test
    public void loginFieldsLoadTest() {
        boolean success;
        loginPage.usernameField();
        loginPage.passwordField();
    }

    @Test //Try to log in with an empty username and password
    public void emptyUserPass(){
        loginPage.signInButton();

        // Verify error message
        String errorMessage = loginPage.setErrorMsg();
        assertEquals("Incorrect email or password.", errorMessage);
    }
    @Test //Try to log in with an incorrect username and password
    public void incorrectUserPass(){
        loginPage.setUsernameIncorrect();
        loginPage.setPasswordIncorrect();
        loginPage.signInButton();

        // Verify error message
        String errorMessage = loginPage.setErrorMsg();
        assertEquals("Incorrect email or password.", errorMessage);
    }
}
