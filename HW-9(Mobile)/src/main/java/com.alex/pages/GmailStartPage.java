package com.alex.pages;

import com.alex.decorator.elements.realisation.Button;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GmailStartPage extends BasePage{

    private static final Logger LOG = LogManager.getLogger(GmailStartPage.class);

    @FindBy(id = "welcome_tour_got_it")
    private Button startButton;

    public void clickStartButton(){
        LOG.info("method clickOnStartButton.");
        driverWait.until(ExpectedConditions.visibilityOf(startButton.getElement()));
        driverWait.until(ExpectedConditions.elementToBeClickable(startButton.getElement()));
        startButton.click();
    }
}
