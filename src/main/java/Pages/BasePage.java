package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected static WebDriver webDriver;
    protected static WebDriverWait wait;

    public void setWebDriver(WebDriver webDriver){
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
    }

    protected void clickElementByXpath (String xpath) {
        findElementByXpath(xpath).click();
    }

    protected void sendTextToElementByXpath(String xpath, String text) {
        WebElement element = findElementByXpath(xpath);
        element.sendKeys(text);
    }

    protected boolean elementExists (String xpath) {
        try {
            webDriver.findElement(By.xpath(xpath));
            return true;
        }
        catch (Exception err){
            return false;
        }
    }

    protected WebElement findElementByXpath (String xpath){
        WebElement element;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element = webDriver.findElement(By.xpath(xpath));
        return element;
    }

    protected String getCurrentPageURL(){
        return webDriver.getCurrentUrl();
    }
}
