package rozetka.navigation;

import org.openqa.selenium.WebDriver;
import rozetka.driver.DriverRepo;

import java.util.concurrent.TimeUnit;

public class Navigation {

    private WebDriver driver;

    public Navigation() {
        driver = DriverRepo.DRIVERS.get();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}