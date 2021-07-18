package googleTest;

import google.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class HW_1 {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    public void verifyPhoto() {
        WebElement webElement = driver.findElement(By.name("q"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys("cheese" + Keys.ENTER);
        WebElement result = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3")));
        String text = result.getAttribute("textContent");
        System.out.println(text);
        Utils.takeScreens(driver);
        assertFalse(text.isEmpty());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}