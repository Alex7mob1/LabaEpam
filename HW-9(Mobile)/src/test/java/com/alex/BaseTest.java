package com.alex;

import com.alex.driver.Driver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

    @AfterMethod
    void closeResources() {
        Driver.shutdown();
    }
}
