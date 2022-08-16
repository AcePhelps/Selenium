package pageObjectTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pageObject.MainPage;

public class MainPageTest extends BaseTest {

   @Test
    public void WebPage(){
       MainPage mainPage=new MainPage(driver);
       mainPage.open(url);

   }

}
