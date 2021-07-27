package rozetka.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverRepo {

    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    private static WebDriver webDriver;

    public DriverRepo() {
    }

    public static void downLoadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}