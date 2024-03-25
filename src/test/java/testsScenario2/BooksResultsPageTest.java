package testsScenario2;

import Pages.BooksResultsPage;
import Pages.ProductPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooksResultsPageTest extends UseCaseBase {

    private static BooksResultsPage booksResultsPage;

    @BeforeAll
    public static void classSetup(){
        booksResultsPage = new BooksResultsPage();
    }

    @BeforeEach
    public void beforeTest(){
        booksResultsPage.navigateToEnglishOnlyBooks();
    }

    @Test //Click on the book of your choice - add an assertion that the specific book details page is opened
    public void openBook() {
        ProductPage productPage = booksResultsPage.openProductPage();
        boolean isLoaded = productPage.isProductPageLoaded();
        assertTrue(isLoaded);
    }
}