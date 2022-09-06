package pageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FakeLandingPage extends BasePage {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public FakeLandingPage(WebDriver driver) {
        super(driver);
    }

    public void isOpen() {locators.FakeLandingPage().click();}

    public void VisibilityofElement(By locator) {wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void ScrollDownToElement(By element){

        int i = 1000;
        do {
            js.executeScript("window.scrollBy(0," + i + ")");
            i = i + 1000;
            if (i > 10000) {
                break;
            }

        } while (isElementPresent(locators.ContactUsButton1()) != true);

    }

    public boolean isElementPresent(By locatorKey) {
        try {
            driver.findElement(locatorKey);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
