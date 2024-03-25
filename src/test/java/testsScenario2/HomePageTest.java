package testsScenario2;

import Pages.BooksResultsPage;
import Pages.HomePage;
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

    @Test //Open the "Books by Language" dropdown menu
    public void openDropdownMenuTest() {
        homePage.openDropdownMenuBooksByL();
    }

    @Test //Choose "English Only" (wait new page is loaded and add assertion it is loaded)
            public void chooseEnglishOnlyTest(){
        homePage.openDropdownMenuBooksByL();

        BooksResultsPage booksResultsPage = homePage.englishOnly();
        boolean isLoaded = booksResultsPage.isPageTitleVisible();
        assertTrue(isLoaded);
    }
}
