package com.alex.business;

import com.alex.pages.GmailEnterPage;
import com.alex.pages.GmailStartPage;

public class GmailEnterBO {

    private GmailStartPage startPage;
    private GmailEnterPage enterPage;

    public GmailEnterBO() {
        startPage = new GmailStartPage();
        enterPage = new GmailEnterPage();
    }

    public void startSession(String login) {
        startPage.clickStartButton();
        enterPage.isUserAuthorized(login);
        enterPage.clickOnGoToGmail();
    }
}
