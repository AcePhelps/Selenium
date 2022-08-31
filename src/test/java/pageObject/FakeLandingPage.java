package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.reporters.jq.Main;

import static java.awt.SystemColor.window;

public class FakeLandingPage extends BasePage{


    JavascriptExecutor js = (JavascriptExecutor)driver;

    public FakeLandingPage(WebDriver driver) {
        super(driver);
    }
    public  void isOpen(){
        locators.FakeLandingPage().click();

    }
    public void VisibilityofElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    int i =1000;
    public void ScrollDownToElement(By element) throws InterruptedException {


        do {
            js.executeScript("window.scrollBy(0," + i + ")");
            i = i + 1000;
            if(i>10000) {
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
