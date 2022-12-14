package pageObjectTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.BigPageWithManyElements;
import pageObject.locators;
import java.io.IOException;

public class BigPageWithManyElementsTest extends BaseTest {

    @Test
    public void OpenThePage() throws  IOException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        Assert.assertEquals(driver.getCurrentUrl(), "https://ultimateqa.com/complicated-page");
    }

    @Test
    public void SectionToFollowSocailMedia_redirectToTwitter() throws IOException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.TwiterIcon();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Log in']")).isDisplayed());
    }

    @Test
    public void SectionToFollowSocailMedia_redirectToFacebook() throws IOException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.FacebookIcon();
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.facebook.com/Ultimateqa1/"));
    }

    @Test
    public void SectionOfRandomStuff_InputDataInTheField_Successfully() throws IOException, InterruptedException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.SendInputInTheFields();
        Assert.assertTrue(locators.ThanksForContactingUsMessage().isDisplayed());
    }

    @Test
    public void SectionOfRandomStuff_InputDataInTheField_WithError() throws IOException, InterruptedException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.SendInputInTheFieldsWrongCaptchaCalculation();
        Assert.assertTrue(locators.WrongNumberCaptcha().isDisplayed());
    }

    @Test
    public void LoginFieldWithIncorrectCredentials_ThrowingAnError() throws IOException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.LoginSection(username, passoword);
        Assert.assertEquals(driver.getCurrentUrl(), "https://ultimateqa.com/backoffice");
    }

    @Test
    public void GetLatestPosts_EnterCorrectEmail_SubscribeSuccessfully() throws IOException {
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.SubscribeToGetLatestPost(username);
        Assert.assertTrue(locators.SubscribedSuccess().isDisplayed());
    }

    @Test
    public void GetLatestPosts_EnterIncorrectEmail_NotSubscibed() throws IOException{
        BigPageWithManyElements bigPageWithManyElements = new BigPageWithManyElements(driver);
        bigPageWithManyElements.open();
        bigPageWithManyElements.SubscribeToGetLatestPost(incorrectEmail);
        Assert.assertEquals(bigPageWithManyElements.PleaseEnterCorrectEmail(incorrectEmail), false);
    }

}
