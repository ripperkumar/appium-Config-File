package org.example;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium {
    @Test
    public void shouldTestSomething() throws MalformedURLException {
        // 1. Arrange
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "PriyanshuPhone");
        caps.setCapability("udid", "emulator-5554"); // You can get it from 'adb devices' command
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("app", "/Users/testvagrant/Desktop/appiumWithMaven/src/main/resources/ApiDemos-debug.apk");// Replace with your app's path
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        AndroidDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            System.out.println("The URL provided for the Appium server is not well formatted.");
            e.printStackTrace();
        }
        // 3.Assert


        driver.quit();
    }
}
