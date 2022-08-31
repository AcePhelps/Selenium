package pageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
import pageObject.MainPage;
import pageObject.locators;

import java.util.Locale;

public class MainPageTest extends BaseTest {


   @Test
    public void openWebPage()  {
      MainPage mainPage = new MainPage(driver);
      mainPage.open(url);


   }

}
