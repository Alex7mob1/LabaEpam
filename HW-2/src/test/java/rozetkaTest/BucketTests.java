package rozetkaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BucketTests {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void chooseProduct() {
        WebElement webElement = driver.findElement(By.xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href, 'computers-notebooks')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@title='Компьютеры']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(@href, 'producer=asus')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),' От дорогих к дешевым ')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@title='Компьютер Asus ROG Strix G35DX (90PD02W1-M12900)']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='product-buttons__item ng-star-inserted']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@style='visibility: visible;']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='breadcrumbs__icon-home']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href,'uvlecheniya')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@title='Велосипеды']"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("label[for='GT']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),' От дорогих к дешевым ')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("a[title = 'Велосипед GT AVALANCHE 27 COMP 2020']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='product-buttons__item ng-star-inserted']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@style='visibility: visible;']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='breadcrumbs__icon-home']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href,'shoes')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),' Мужчинам ')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),' Обувь')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("img[alt='Сандалии']"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("label[for='Jack Wolfskin']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),' От дорогих к дешевым ')]"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(text(),'Сандалии Jack Wolfskin Lakewood Ride Sandal')]"));
        webElement.click();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
