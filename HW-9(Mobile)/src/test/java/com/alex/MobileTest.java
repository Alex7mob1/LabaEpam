package com.alex;

import com.alex.business.GmailEnterBO;
import com.alex.business.GmailWriteMessageBO;
import com.alex.datamodel.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.stream.Stream;

import static com.alex.utils.parser.JsonParser.*;

public class MobileTest {

    private static final Logger LOG = LogManager.getLogger(MobileTest.class);
    private static final int AMOUNT_USERS = 1;

    @DataProvider(parallel = true)
    public Iterator<Object[]> usersLoginPassword() {
        return Stream.of(getUsers(AMOUNT_USERS)).iterator();
    }

    @Test(dataProvider = "usersLoginPassword")
    void gmailMainTest(String login){
        LOG.info("gmailMainTest");
        GmailEnterBO enterBO = new GmailEnterBO();
        enterBO.startSession(login);

        GmailWriteMessageBO writeMessageBO = new GmailWriteMessageBO();
        Message message = new Message(getWhoReceiveMessage(), getSubject(), getMessage());
        writeMessageBO.writeMes(message);
    }
}
