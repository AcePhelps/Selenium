package pageObject;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{


    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void open(String url){
        this.driver.get(url);

    }

}
