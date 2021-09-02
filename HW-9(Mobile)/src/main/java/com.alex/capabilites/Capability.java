package com.alex.capabilites;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capability {

    private static final String DEVICE_NAME_CAPABILITY ="Galaxy J5";
    private static final String UDID_CAPABILITY ="79e7f24e";
    private static final String PLATFORM_NAME_CAPABILITY ="Android";
    private static final String PLATFORM_VERSION_CAPABILITY ="7.1.1";
    private static final String APP_PACKAGE_CAPABILITY ="com.google.android.gm";
    private static final String APP_ACTIVITY_CAPABILITY ="com.google.android.gm.GmailActivity";

    public static DesiredCapabilities getCapabilities(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,DEVICE_NAME_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.UDID,UDID_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_NAME_CAPABILITY);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,PLATFORM_VERSION_CAPABILITY);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,APP_PACKAGE_CAPABILITY);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,APP_ACTIVITY_CAPABILITY);

        return capabilities;
    }
}
