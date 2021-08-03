package rozetka.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import rozetka.utils.PropertiesReader;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class DriverRepo {

    private static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    static {
        System.setProperty(PropertiesReader.getValueProperty("name"), PropertiesReader.getValueProperty("location"));
    }

    public DriverRepo() {
    }

    public static void instanceWebBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DRIVERS.set(driver);
    }

    public static WebDriver getWebDriver() {
        if (Objects.isNull(DRIVERS.get())) {
            instanceWebBrowser();
        }
        return DRIVERS.get();
    }

    public static void closeBrowser() {
        DRIVERS.get().quit();
        DRIVERS.set(null);
    }
}