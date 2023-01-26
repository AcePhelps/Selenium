package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

import java.io.*;

public class BigPageWithManyElements extends BasePage {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);
    public BigPageWithManyElements(WebDriver driver) throws IOException {
        super(driver);
    }

    public String getString() throws IOException {
        File file = new File("C:\\Users\\Ace Phelps\\OneDrive\\Documents\\GitHub\\LinkedIn\\src\\test\\java\\helpers\\TxtWrite.txt");
        FileReader r = new FileReader(file);
        BufferedReader reader = new BufferedReader(r);
        String s = null;
        while ((s = reader.readLine()) != null) {}
        reader.close();
        return s;
    }

    public void open() {
        actions.click(locators.BigPageWithManyElements());
        locators.BigPageWithManyElements().click();
    }

    public void TwiterIcon() {locators.TwiterIcon().click();}

    public void FacebookIcon() {
        js.executeScript("arguments[0].scrollIntoView();", locators.FacebookIcon());
        locators.FacebookIcon().click();
        Reporter.log("Facebook icon presents",true);
    }

    public void SendInputInTheFields() throws IOException, InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", locators.NameField());
        locators.NameField().sendKeys("Asset");
        locators.LastNameField().sendKeys("AssetAssetAsset@gmail.com");
        File file = new File("C:\\Users\\Ace Phelps\\OneDrive\\Documents\\GitHub\\LinkedIn\\src\\test\\java\\helpers\\TxtWrite.txt");
        FileReader r = new FileReader(file);
        BufferedReader reader = new BufferedReader(r);
        String s = null;
        while ((s = reader.readLine()) != null) {
            locators.MessageField().sendKeys(s);
            locators.MessageField().sendKeys(Keys.ENTER);
        }
        WebElement thisCaptcha = driver.findElement(By.xpath("(//*[@class='et_pb_contact_captcha_question'])[1]/parent::p/span"));
        int result = CalculationForCaptcha(thisCaptcha);
        locators.CaptchaField().sendKeys(" " + result);
        locators.ButtonForMessageField().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Thanks for contacting us']")));
    }

    public void SendInputInTheFieldsWrongCaptchaCalculation() throws IOException, InterruptedException {
        js.executeScript("arguments[0].scrollIntoView();", locators.NameField());
        locators.NameField().sendKeys("Asset");
        locators.LastNameField().sendKeys("AssetAssetAsset@gmail.com");
        File file = new File("C:\\Users\\Ace Phelps\\OneDrive\\Documents\\GitHub\\LinkedIn\\src\\test\\java\\helpers\\TxtWrite.txt");
        FileReader r = new FileReader(file);
        BufferedReader reader = new BufferedReader(r);
        String s = null;
        while ((s = reader.readLine()) != null) {locators.MessageField().sendKeys(s);}
            //   locators.MessageField().sendKeys(Keys.ENTER);
        WebElement thisCaptcha = driver.findElement(By.xpath("(//*[@class='et_pb_contact_captcha_question'])[1]/parent::p/span"));
        int result = CalculationForCaptcha(thisCaptcha);
        locators.CaptchaField().sendKeys(" " + (result + 5));
        locators.ButtonForMessageField().click();
    }

    public void LoginSection(String username, String password) {
        locators.UserNameField().sendKeys(username);
        locators.PasswordField().sendKeys(password);
        locators.LoginButtonBigPage().click();
        Reporter.log("Login successful");
    }

    public int CalculationForCaptcha(WebElement element) {
        String calculating = element.getText();
        String parts[] = calculating.split(" ");
        int a = parts.length;
        int b = Integer.valueOf(parts[0]) + Integer.valueOf(parts[2]);
        return b;
    }

    public void SubscribeToGetLatestPost(String email) {
        locators.emailFieldToGetTheLatestPost().sendKeys(email);
        locators.emailFieldToGetTheLatestPostSubmitButton().click();
    }

    public boolean PleaseEnterCorrectEmail(String name) {
        locators.emailFieldToGetTheLatestPost().sendKeys(name);
        Object s = js.executeScript("return document.getElementById(\"subscribe-field-blog_subscription-2\").validity.valid");
        boolean di = (Boolean) s;
        return di;
    }
}


