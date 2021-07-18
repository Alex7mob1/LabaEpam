package googleTest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static org.testng.Assert.assertFalse;

public class HW_1 {

    private WebDriver driver;
    private WebDriverWait wait;
    private WebElement webElement;
    private WebElement result;

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
    public void verifyPhoto() throws IOException {
        webElement = driver.findElement(By.name("q"));
        webElement.click();
        webElement.clear();
        webElement.sendKeys("cheese" + Keys.ENTER);
        result = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3")));
        String text = result.getAttribute("textContent");
        System.out.println(text);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        Date date = new Date() ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss") ;
        FileUtils.copyFile(scrFile, new File( "screens\\"+dateFormat.format(date)+".png"));
        assertFalse(text.isEmpty());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}