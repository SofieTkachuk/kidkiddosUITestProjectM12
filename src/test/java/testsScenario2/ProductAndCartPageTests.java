package testsScenario2;

import Pages.CartPage;
import Pages.ProductPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        productPage.setQuantityNum(); //Change number of books to 5

        //Press the "Add to Cart" button -  add assertion verifying the cart is opened
        CartPage cartPage = productPage.addToCard();
        boolean isLoaded = cartPage.isCartPageLoaded();
        assertTrue(isLoaded);

        //Change Books quantity to 6 and press the update button
        cartPage.setQuantityNum();
        cartPage.updateButton();
        boolean isUpdated = cartPage.isPriceUpdated();
        assertTrue(isUpdated);
    }
}
