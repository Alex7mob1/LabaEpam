package com.alex.driver;

import com.alex.capabilites.Capability;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static final ThreadLocal<WebDriver> DRIVER_POOL = new ThreadLocal<>();
    private static final Logger LOG = LogManager.getLogger(Driver.class);

    private Driver() {
    }

    public static WebDriver getWebDriver() {
        if (Objects.isNull(DRIVER_POOL.get())) {
            createWebDriver();
            DRIVER_POOL.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return DRIVER_POOL.get();
    }

    private static void createWebDriver() {
        AndroidDriver driver = new AndroidDriver(Objects.requireNonNull(getURL()), Capability.getCapabilities());
        DRIVER_POOL.set(driver);
    }

    private static URL getURL() {
        try {
            return new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            LOG.error("Bad URL.. Error.");
            e.printStackTrace();
        }
        return null;
    }

    public static void shutdown() {
        DRIVER_POOL.get().quit();
        DRIVER_POOL.set(null);
    }
}
