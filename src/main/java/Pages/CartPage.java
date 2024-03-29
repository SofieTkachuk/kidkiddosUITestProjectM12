package Pages;

public class CartPage extends ProductPage{
    public static final String CART_HEADER = "//h1[text()='Your cart']";
    public static final String UPDATE_BUTTON = "//*[text()='Shipping & taxes calculated at checkout']//following-sibling::*[@name='update']";
    private static final String TOTAL_BOOK_PRICE = "//*[@class='text-right small--hide']//descendant::*[@class='cbb-price-digits']";

    public boolean isCartPageLoaded(){
        Boolean isVisible = elementExists(CART_HEADER);
        return isVisible;
    }

    public void updateButton(){
        clickElementByXpath(UPDATE_BUTTON);
    }

    public double getCurrentPrice(){
        String priceText = findElementByXpath(TOTAL_BOOK_PRICE).getText();
        priceText = priceText.replaceAll(",", ".");
        return Double.parseDouble(priceText);
    }
}
