package com.alex.pages;

import com.alex.decorator.CustomFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.alex.driver.Driver.getWebDriver;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait driverWait;

    public BasePage() {
        initElements();
    }

    private void initElements() {
        driver = getWebDriver();
        driverWait = new WebDriverWait(driver, 60);
        PageFactory.initElements(new CustomFieldDecorator(driver), this);
    }
}
