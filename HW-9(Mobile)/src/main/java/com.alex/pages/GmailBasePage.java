package com.alex.pages;

import com.alex.decorator.elements.realisation.Button;
import com.alex.decorator.elements.realisation.EditText;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class GmailBasePage extends BasePage{

    private static final Logger LOG = LogManager.getLogger(GmailBasePage.class);
    private static final String GO_TO_DRAFT = "label:draft";


    @FindBy(id = "compose_button")
    private Button writeMessageButton;
    @FindBy(id = "open_search_bar_text_view")
    private EditText draftMessages;

    public void clickOnWriteMessageButton() {
        LOG.info("method clickOnComposeButton.");
        writeMessageButton.click();
    }
    public void openGraftMessages() {
        LOG.info("method openGraftMessages.");
        draftMessages.sendKeys(GO_TO_DRAFT);
        ((AndroidDriver) (driver)).pressKeyCode(AndroidKeyCode.ENTER);
    }
}
