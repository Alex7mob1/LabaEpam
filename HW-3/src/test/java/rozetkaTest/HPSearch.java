package rozetkaTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import rozetka.navigation.Navigation;

import static rozetka.enums.URLs.BASE_URL;

public class HPSearch extends BaseTest {

    private WebDriver driver;
    private WebDriver wait;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }
}