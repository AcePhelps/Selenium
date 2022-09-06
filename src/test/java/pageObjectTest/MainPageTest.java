package pageObjectTest;
import org.testng.annotations.Test;
import pageObject.MainPage;

public class MainPageTest extends BaseTest {


    @Test
    public void openWebPage() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open(url);
    }

}
