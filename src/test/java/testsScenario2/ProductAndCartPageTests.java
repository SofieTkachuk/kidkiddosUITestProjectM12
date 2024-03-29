package testsScenario2;

import Pages.CartPage;
import Pages.ProductPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductAndCartPageTests extends UseCaseBase {
    private static ProductPage productPage;

    @BeforeAll
    public static void classSetup(){
        productPage = new ProductPage();
    }

    @BeforeEach
    public void beforeTest(){
        productPage.navigateToProductPage();
    }

    @Test
    public void fromProductPageToCartTests() {
        productPage.setHardcoverFormat(); //Change format to hardcover
        productPage.setQuantityNum(5); //Change number of books to 5

        //Press the "Add to Cart" button -  add assertion verifying the cart is opened
        CartPage cartPage = productPage.addToCard();
        boolean isLoaded = cartPage.isCartPageLoaded();
        assertTrue(isLoaded);

        //Check the current price of the book
        double currentAmount = cartPage.getCurrentPrice();


        //Change Books quantity to 6 and press the update button
        productPage.setQuantityNum(6);
        cartPage.updateButton();

        //Check the new price of the book
        double newAmount = cartPage.getCurrentPrice();

        //Add assertion verifying the price is updated
        assertNotEquals(currentAmount, newAmount);
    }
}
