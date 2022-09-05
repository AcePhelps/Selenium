package pageObjectTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.FakeLandingPage;
import pageObject.locators;

public class FakeLandingTest extends BaseTest {
    @Test
    public void OpenFakeLandingPage() {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        Assert.assertEquals(driver.getCurrentUrl(), "https://ultimateqa.com/fake-landing-page");

    }

    @Test
    public void FakeLandingPage_VeiwCoursesButton_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.VisibilityofElement(locators.ViewCourseButton());
        Assert.assertTrue(locators.ViewCoursesButton().isDisplayed());
    }

    @Test
    public void FakeLandingPage_VeiwAllCoursesButton_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.ViewAllCourseButton());
        fakeLandingPage.VisibilityofElement(locators.ViewAllCourseButton());
        Assert.assertTrue(locators.ViewAllCoursesButton().isDisplayed());
    }

    @Test
    public void FakeLandingPage_WebDevelopmentSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.WebDevelopment1());
        fakeLandingPage.VisibilityofElement(locators.WebDevelopment1());
        Assert.assertTrue(locators.WebDevelopment().isDisplayed());
    }

    @Test
    public void FakeLandingPage_JavascriptSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.JavaScript1());
        fakeLandingPage.VisibilityofElement(locators.JavaScript1());
        Assert.assertTrue(locators.JavaScript().isDisplayed());
    }

    @Test
    public void FakeLandingPage_PythonSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.Python1());
        fakeLandingPage.VisibilityofElement(locators.Python1());
        Assert.assertTrue(locators.Python().isDisplayed());
    }

    @Test
    public void FakeLandingPage_HtmlAndCssSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.HtmlAndCss1());
        fakeLandingPage.VisibilityofElement(locators.HtmlAndCss1());
        Assert.assertTrue(locators.HtmlAndCss().isDisplayed());
    }

    @Test
    public void FakeLandingPage_UxDesignSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.UxDesign1());
        fakeLandingPage.VisibilityofElement(locators.UxDesign1());
        Assert.assertTrue(locators.UxDesign().isDisplayed());
    }

    @Test
    public void FakeLandingPage_IntroToCodingSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.IntroToCoding1());
        fakeLandingPage.VisibilityofElement(locators.IntroToCoding1());
        Assert.assertTrue(locators.IntroToCoding().isDisplayed());
    }

    @Test
    public void FakeLandingPage_DataBaseDesignSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.DataBaseDesign1());
        fakeLandingPage.VisibilityofElement(locators.DataBaseDesign1());
        Assert.assertTrue(locators.DataBaseDesign().isDisplayed());
    }

    @Test
    public void FakeLandingPage_AppAndGamesSection_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.AppsAndGames1());
        fakeLandingPage.VisibilityofElement(locators.AppsAndGames1());
        Assert.assertTrue(locators.AppsAndGames().isDisplayed());
    }

    @Test
    public void FakeLandingPage_SecondViewAllCoursesButton_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.SecondViewAllCoursesButton1());
        fakeLandingPage.VisibilityofElement(locators.SecondViewAllCoursesButton1());
        Assert.assertTrue(locators.SecondViewAllCoursesButton().isDisplayed());
    }

    @Test
    public void FakeLandingPage_ContactUsButton_Presents() throws InterruptedException {
        FakeLandingPage fakeLandingPage = new FakeLandingPage(driver);
        fakeLandingPage.isOpen();
        fakeLandingPage.ScrollDownToElement(locators.ContactUsButton1());
        fakeLandingPage.VisibilityofElement(locators.ContactUsButton1());
        Assert.assertTrue(locators.ContactUsButton().isDisplayed());
    }


}
