package Pages;

import Consts.Consts;

public class BooksResultsPage extends BasePage{
    public static final String ENGLISH_ONLY_HEADER = "//h1[text()='English Only']";
    public static final String BOOK_1 = "//*[@data-src='//kidkiddos.com/cdn/shop/products/I-Love-to-childrens-bedtime-book-collection-bunnies-English-language-cover_195x195@2x.jpg?v=1492992338']";

    public boolean isPageTitleVisible() {
        return elementExists(ENGLISH_ONLY_HEADER);
    }

    public void navigateToEnglishOnlyBooks(){
        webDriver.get(Consts.ENGLISH_ONLY_BOOKS);
    }

    public ProductPage openProductPage(){
        clickElementByXpath(BOOK_1);
        return new ProductPage();
    }
}
