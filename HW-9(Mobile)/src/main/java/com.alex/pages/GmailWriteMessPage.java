package com.alex.pages;

import com.alex.decorator.elements.realisation.Button;
import com.alex.decorator.elements.realisation.EditText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;

public class GmailWriteMessPage {

    private static final Logger LOG = LogManager.getLogger(GmailWriteMessPage.class);

    @FindBy(id = "to")
    private EditText receiverLetterEmail;
    @FindBy(id = "subject")
    private EditText subjectMessage;
    @FindBy(id = "wc_body_layout")
    private EditText message;
    @FindBy(className = "android.widget.ImageButton")
    private Button previousActivity;

    public void setReceiverLetterEmail(String email) {
        LOG.info("method setReceiverLetterEmail.");
        receiverLetterEmail.sendKeys(email);
    }

    public void setSubjectMessage(String subject) {
        LOG.info("method setSubjectMessage.");
        subjectMessage.sendKeys(subject);
    }

    public void setMessage(String message) {
        LOG.info("method setMessage.");
        this.message.sendKeys(message);
    }

    public String getReceiverLetterEmail() {
        LOG.info("method getReceiverLetterEmail.");
        return receiverLetterEmail.getText();
    }

    public String getSubjectMessage(String subject) {
        LOG.info("method getSubjectMessage.");
        return subjectMessage.getText();
    }

    public String getMessage(String message) {
        LOG.info("method getMessage.");
        return "";
    }

    public void goBackToPreviousPage() {
        LOG.info("method goBackToPreviousPage.");
        previousActivity.click();
    }
}
