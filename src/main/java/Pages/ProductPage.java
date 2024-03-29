package Pages;

public class ProductPage extends BasePage{
    public static final String ADD_TO_CART_BUTTON = "//*[@id='AddToCart-product-template']";
    public static final String FORMAT_OPTION = "//*[@class='single-option-selector single-option-selector-product-template product-form__input']";
    public static final String HARDCOVER_FORMAT = "//option[@value='Hardcover']";
    public static final String QUANTITY = "//input[@type='number']";
    public static final String PRODUCT_PAGE_URL = "https://kidkiddos.com/collections/english-only/products/i-love-to-bedtime-collection-english-only";

    public boolean isProductPageLoaded(){
        Boolean isVisible = elementExists(ADD_TO_CART_BUTTON);
        return isVisible;
    }

    public CartPage addToCard(){
        clickElementByXpath(ADD_TO_CART_BUTTON);
        return new CartPage();
    }

    public void navigateToProductPage(){
        webDriver.get(PRODUCT_PAGE_URL);
    }

    public void setHardcoverFormat(){
        clickElementByXpath(FORMAT_OPTION);
        clickElementByXpath(HARDCOVER_FORMAT);
    }

    public void setQuantityNum(int quantityNum){
        findElementByXpath(QUANTITY).clear();
        sendTextToElementByXpath(QUANTITY, String.valueOf(quantityNum));
    }
}
