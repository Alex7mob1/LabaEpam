package wservices;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

import static wservices.utils.Const.DEFAULT_URL;

public class BaseTest {

    @BeforeSuite
    public void setupBaseURL() {
        RestAssured.baseURI = DEFAULT_URL;
    }
}