package rozetkaTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import rozetka.driver.DriverRepo;

public class BaseTest {
    @BeforeSuite
    public void setup() {
        DriverRepo.downLoadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        DriverRepo.instanceWebBrowser();
    }

    @AfterSuite
    public void closeBrowser() {
        DriverRepo.closeBrowser();
    }
}