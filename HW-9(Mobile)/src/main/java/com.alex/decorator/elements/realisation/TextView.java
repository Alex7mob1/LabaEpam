package com.alex.decorator.elements.realisation;

import com.alex.decorator.elements.CommonElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

public class TextView extends CommonElement {

    private static final Logger LOG = LogManager.getLogger(TextView.class);

    public TextView(WebElement webElement) {
        super(webElement);
    }

    public void click() {
        LOG.info("method click.");
        webElement.click();
    }

    public String getText() {
        LOG.info("method getText.");
        return webElement.getText();
    }
}
