package com.alex.pages;

import com.alex.decorator.elements.realisation.TextView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class GmailEnterPage extends BasePage {

    private static final Logger LOG = LogManager.getLogger(GmailEnterPage.class);

    @FindBy(id = "action_done")
    private WebElement goToGmail;
    @FindBy(id = "account_address")
    private List<TextView> usersEmails;
    @FindBy(id = "setup_addresses_list")
    private TextView usersInfo;

    public void clickOnGoToGmail() {
        LOG.info("method clickOnGoToGmail.");
        goToGmail.click();
    }
    public boolean isUserAuthorized(String email) {
        LOG.info("method isUserAuthorized.");
        waitUntilNotLoadedAllUsers();
        return usersEmails.stream().anyMatch(a -> a.getText().equals(email));
    }

    private void waitUntilNotLoadedAllUsers() {
        driverWait.until(ExpectedConditions.visibilityOf(usersInfo.getElement()));
    }
}
