package rozetkaTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;


import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;

public class BucketTests {

    private WebDriver driver;
    private String expectedPrice = "126 186 ₴";
    private WebDriver wait;


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

        Actions actions = new Actions(driver);

        driver.findElement(xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href, 'computers-notebooks')]")).click();

        WebElement webElement = driver.findElement(By.xpath("//*[@title='Компьютеры']"));
        webElement.click();
        webElement = driver.findElement(By.xpath("//*[contains(@href, 'producer=asus')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("option[value='2: expensive']"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("ul.catalog-grid li:first-child span.goods-tile__title"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='product-buttons__item ng-star-inserted']"));
        actions.moveToElement(webElement).perform();
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='button button_size_medium button_color_gray cart-footer__continue ng-star-inserted']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='breadcrumbs__icon-home']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href,'uvlecheniya')]"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@title='Велосипеды']"));
        webElement.click();

        new WebDriverWait(driver, 30)
                .ignoring(StaleElementReferenceException.class)
                .until((WebDriver d) -> {
                    d.findElement(By.xpath("//*[@id='GT']/following-sibling::*")).isEnabled();
                    return true;
                });

        WebElement element = driver.findElement(By.xpath("//*[@id='GT']/following-sibling::*"));

        actions.moveToElement(element);

        actions.perform();


        driver.findElement(By.xpath("//*[@id='GT']/following-sibling::*")).click();
        webElement = driver.findElement(xpath("//*[contains(text(),' От дорогих к дешевым ')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("a[title = 'Велосипед GT AVALANCHE 27 COMP 2020']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='product-buttons__item ng-star-inserted']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='button button_size_medium button_color_gray cart-footer__continue ng-star-inserted']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='breadcrumbs__icon-home']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='sidebar sidebar_type_main']//*[contains(@href,'shoes')]"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[contains(text(),' Мужчинам ')]"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[contains(text(),' Обувь')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("img[alt='Сандалии']"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("label[for='Jack Wolfskin']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[contains(text(),' От дорогих к дешевым ')]"));
        webElement.click();
        webElement = driver.findElement(By.cssSelector("ul.catalog-grid li:nth-child(2) span.goods-tile__title"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[@class='product-buttons__item ng-star-inserted']//*[@aria-label='Купить']"));
        webElement.click();
        webElement = driver.findElement(xpath("//*[contains(text(),' Оформить заказ ')]"));
        webElement.click();
        String price = driver.findElement(xpath("//*[@class='checkout-total__value checkout-total__value_size_large']")).getText();
        assertEquals(price, expectedPrice);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}