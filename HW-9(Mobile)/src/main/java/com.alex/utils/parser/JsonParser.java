package com.alex.utils.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JsonParser {

    private static JSONObject jsonObject;
    private static final Logger LOG = LogManager.getLogger(JsonParser.class);

    static {
        createInstanceJsonObject();
    }

    private static void createInstanceJsonObject() {
        try {
            jsonObject = (JSONObject) (new JSONParser().parse(new FileReader("src/main/resources/gmail.json")));
        } catch (IOException | ParseException e) {
            LOG.error("Cannot find file json..");
        }
    }

    public static Object[][] getUsers(int amount) {
        int amountUsers = getAmountUsers();
        if (amount < amountUsers || amount >= 1) {
            amountUsers = amount;
        }
        Object[][] users = new Object[amountUsers][];
        for (int i = 0; i < amountUsers; i++) {
            users[i] = new Object[]{getUserLogin(i)};
        }//,getUserPassword(i)
        return users;
    }

    private static int getAmountUsers() {
        return ((JSONArray) ((JSONObject) jsonObject.get("users")).get("login")).size();
    }

    private static String getUserLogin(int index) {
        return (String) ((JSONArray) ((JSONObject) jsonObject.get("users")).get("login")).get(index);
    }

    private static String getUserPassword(int index) {
        return (String) ((JSONArray) ((JSONObject) jsonObject.get("users")).get("password")).get(index);
    }

    public static String getBaseUrl() {
        return jsonObject.get("url-base").toString();
    }

    public static String getWhoReceiveMessage() {
        return ((JSONObject) jsonObject.get("message")).get("who-receive-message").toString();
    }

    public static String getSubject() {
        return ((JSONObject) jsonObject.get("message")).get("subject").toString();
    }

    public static String getMessage() {
        return ((JSONObject) jsonObject.get("message")).get("message").toString();
    }
}
