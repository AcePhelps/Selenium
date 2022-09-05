package pageObjectTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObject.MainPage;

public class BaseTest {
    protected static WebDriver driver;
    protected String url;
    protected String username;
    protected String passoword;
    protected String incorrectEmail;

    @BeforeMethod
    public void start() {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        url = "https://ultimateqa.com/automation";
        username = "Samznaesh@gmail.com";
        passoword = "WhoKnowsThePassword";
        incorrectEmail = "1234awsredqwfrdasd";
        MainPage mainPage = new MainPage(driver);
        mainPage.open(url);
    }

    @AfterMethod
    public void finish() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
