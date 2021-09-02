package com.alex.business;

import com.alex.datamodel.Message;
import com.alex.pages.GmailBasePage;
import com.alex.pages.GmailWriteMessPage;

public class GmailWriteMessageBO {

    private GmailBasePage basePage;
    private GmailWriteMessPage writeMessPage;

    public GmailWriteMessageBO(){
        basePage = new GmailBasePage();
        writeMessPage = new GmailWriteMessPage();
    }

    public void writeMes(Message message){
        basePage.clickOnWriteMessageButton();
        writeMessPage.setReceiverLetterEmail(message.getTo());
        writeMessPage.setSubjectMessage(message.getSubject());
        writeMessPage.setMessage(message.getMessage());
        writeMessPage.goBackToPreviousPage();
    }
}
