package helpers;

import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFabric {
    public static WebDriver getDriver(BrowserType browser){
        switch(browser){
            case EDGE:
                return getEdgeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            default:
                return getChromeDriver();
        }
    }
    private static WebDriver getEdgeDriver(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.edgedriver().setup();

        return new EdgeDriver();
    }
    private static WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    private static WebDriver getFirefoxDriver(){
        FirefoxOptions options= new FirefoxOptions();
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
