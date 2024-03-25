package Pages;

public class CartPage extends ProductPage{
    public static final String CART_HEADER = "//h1[text()='Your cart']";
    public static final String UPDATE_BUTTON = "//*[text()='Shipping & taxes calculated at checkout']//following-sibling::*[@name='update']";
    public static String QUANTITY_NUM = "6";
    public static final String PRICE_CHECK = "//span[text()='$449.94 CAD']//preceding-sibling::*[text()='Shipping & taxes calculated at checkout']";

    public boolean isCartPageLoaded(){
        Boolean isVisible = elementExists(CART_HEADER);
        return isVisible;
    }

    public void setQuantityNum(){
        findElementByXpath(QUANTITY).clear();
        sendTextToElementByXpath(QUANTITY, QUANTITY_NUM);
    }

    public void updateButton(){
        clickElementByXpath(UPDATE_BUTTON);
    }

    public boolean isPriceUpdated(){
        Boolean isUpdated = elementExists(PRICE_CHECK);
        return isUpdated;
    }
}
