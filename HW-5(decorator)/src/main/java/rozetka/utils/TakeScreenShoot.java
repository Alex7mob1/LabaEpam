package rozetka.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import rozetka.driver.DriverRepo;

import java.io.File;
import java.io.IOException;

public class TakeScreenShoot {

    public TakeScreenShoot() {
    }

    public static void takeScreens(File outputDirectory) {
        try {
            File scrFile = ((TakesScreenshot) DriverRepo.getWebDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, outputDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}