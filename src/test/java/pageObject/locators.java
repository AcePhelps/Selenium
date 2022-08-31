package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class locators extends BasePage  {


    public locators(WebDriver driver) {
    super(driver);
  }
    public static final WebElement itsGone(){return driver.findElement(By.xpath("//*[@id='message']"));}
    public static final WebElement searchField(){return driver.findElement(By.xpath("//*[@name='q']"));}
    public static final WebElement firstLink(){return driver.findElement(By.xpath(("(//*[@class='LC20lb MBeuO DKV0Md'])[1]")));}
    public static  WebElement downloadJavaButton(){return driver.findElement(By.xpath("//*[@title='Download Java']"));}
    public static WebElement BigPageWithManyElements(){return driver.findElement(By.xpath("//*[text()='Big page with many elements']"));}
    public static WebElement FakeLandingPage(){return driver.findElement(By.xpath("//*[text()='Fake Landing Page']"));}

    //Big Page with many elements

    public static WebElement TwiterIcon(){return driver.findElement(By.xpath("//*[@class='icon et_pb_with_border']"));}
    public static WebElement FacebookIcon(){return driver.findElement(By.xpath("(//*[@class='icon et_pb_with_border'])[2]"));}
    public static WebElement NameField(){return driver.findElement(By.cssSelector("[id='et_pb_contact_name_0']"));}
    public static WebElement LastNameField(){return driver.findElement(By.cssSelector("[id='et_pb_contact_email_0']"));}
    public static WebElement MessageField(){return driver.findElement(By.cssSelector("[id='et_pb_contact_message_0']"));}
    public static WebElement ThanksForContactingUsMessage(){return driver.findElement(By.xpath("//*[text()='Thanks for contacting us']"));}
    public static WebElement CaptchaField(){return driver.findElement(By.xpath("//*[@name='et_pb_contact_message_0']/parent::p/following-sibling::div/div/p/input"));}
    public static WebElement ButtonForMessageField(){return driver.findElement(By.xpath(" //*[@name='et_pb_contact_message_0']/parent::p/following-sibling::div/div//following-sibling::button"));}
    public static WebElement UserNameField(){return driver.findElement(By.xpath("(//*[@placeholder='Username'])[1]"));}
    public static WebElement PasswordField(){return driver.findElement(By.xpath("(//*[@placeholder='Password'])[1]"));}
    public static WebElement LoginButtonBigPage(){return driver.findElement(By.xpath("(//*[@class='et_pb_newsletter_button et_pb_button'])[1]"));}
    public static WebElement WrongNumberCaptcha(){return driver.findElement(By.xpath("//*[text()='You entered the wrong number in captcha.']"));}
    public static WebElement ErrorFrame(){return driver.findElement(By.xpath("//*[@class='et_pb_contact_message input et_contact_error']"));}
    public static WebElement emailFieldToGetTheLatestPost(){return driver.findElement(By.xpath("(//*[@id='subscribe-field-blog_subscription-2'])[1]"));}
    public static WebElement emailFieldToGetTheLatestPostSubmitButton(){return driver.findElement(By.xpath("(//*[@id='subscribe-field-blog_subscription-2'])[1]/parent::p/following-sibling::p/button"));}
    public static WebElement SubscribedSuccess(){return driver.findElement(By.xpath("(//*[@id='blog_subscription-2'])[1]/p"));}

  /////// Fake Landing Page
   public static WebElement ViewCoursesButton(){return driver.findElement(ViewCourseButton());}
   public static By ViewCourseButton(){
      By locator=By.xpath("//*[@class='et_pb_button et_pb_button_0 et_hover_enabled et_pb_bg_layout_light']");
      return locator;
   }

  public static WebElement ViewAllCoursesButton(){return driver.findElement(ViewAllCourseButton());}
  public static By ViewAllCourseButton(){
    By locator=By.xpath("//*[@class='et_pb_button et_pb_button_1 et_hover_enabled et_pb_bg_layout_light']");
    return locator;
  }

  public static WebElement WebDevelopment(){return driver.findElement(WebDevelopment1());}
  public static By WebDevelopment1(){
    By locator=By.xpath("//*[text()='Web Development']");
    return locator;
  }

  public static WebElement JavaScript(){return driver.findElement(JavaScript1());}
  public static By JavaScript1(){
    By locator=By.xpath("//*[text()='Javascript']");
    return locator;
  }

  public static WebElement Python(){return driver.findElement(Python1());}
  public static By Python1(){
    By locator=By.xpath("//*[text()='Python']");
    return locator;
  }

  public static WebElement HtmlAndCss(){return driver.findElement(HtmlAndCss1());}
  public static By HtmlAndCss1(){
    By locator=By.xpath("//*[text()='HTML & CSS']");
    return locator;
  }

  public static WebElement UxDesign(){return driver.findElement(UxDesign1());}
  public static By UxDesign1(){
    By locator=By.xpath("//*[text()='UX Design']");
    return locator;
  }

  public static WebElement IntroToCoding(){return driver.findElement(IntroToCoding1());}
  public static By IntroToCoding1(){
    By locator=By.xpath("//*[text()='Intro to Coding']");
    return locator;
  }

  public static WebElement DataBaseDesign(){return driver.findElement(DataBaseDesign1());}
  public static By DataBaseDesign1(){
    By locator=By.xpath("//*[text()='Database Design']");
    return locator;
  }

  public static WebElement AppsAndGames(){return driver.findElement(AppsAndGames1());}
  public static By AppsAndGames1(){
    By locator=By.xpath("//*[text()='Apps & Games']");
    return locator;
  }

  public static WebElement SecondViewAllCoursesButton(){return driver.findElement(SecondViewAllCoursesButton1());}
  public static By SecondViewAllCoursesButton1(){
    By locator=By.xpath("//*[@class='et_pb_button et_pb_button_2 et_hover_enabled et_pb_bg_layout_light']");
    return locator;
  }

  public static WebElement ContactUsButton(){return driver.findElement(ContactUsButton1());}
  public static By ContactUsButton1(){
    By locator=By.xpath("//*[@class='et_pb_button et_pb_button_3 et_hover_enabled et_pb_bg_layout_light']");
    return locator;
  }


















    public static boolean isOpen(){
      By oraclePage=By.xpath("//*[@title='Download Java']");
              try{
                wait.until(ExpectedConditions.visibilityOfElementLocated(oraclePage));
                return true;
              }catch(TimeoutException err){
                return false;
              }

  }


}
