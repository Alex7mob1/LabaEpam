package rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import rozetka.driver.DriverRepo;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = DriverRepo.getWebDriver();
        wait = new WebDriverWait(driver, 300);
        PageFactory.initElements(driver, this);
    }
}