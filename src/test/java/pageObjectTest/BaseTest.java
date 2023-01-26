package pageObjectTest;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObject.MainPage;

public class BaseTest {
    protected static WebDriver driver;
    protected String url;
    protected String username;
    protected String passoword;
    protected String incorrectEmail;

    @Parameters({"url","username","password"})


    @BeforeMethod
    public void start(String url,String email,String passoword) {
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        this.url = url;
        this.username =email;
        this.passoword = passoword;
        incorrectEmail = "1234awsredqwfrdasd";
        MainPage mainPage = new MainPage(driver);
        mainPage.open(url);
    }

    @AfterMethod
    public void finish(){driver.quit();}
}
