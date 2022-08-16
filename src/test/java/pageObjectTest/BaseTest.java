package pageObjectTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected String url;

    @BeforeMethod
    public void start(){
       driver= BrowserFabric.getDriver(BrowserType.CHROME);
        url="https://www.google.com/";
    }
    @AfterMethod
    public void finish() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
