package com.juaracoding.cucumber.utils;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegularPage {
    public static WebDriver driver;

    public static void delayDuration(long time) {
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void scrollPage(String atas, String bawah) {
        JavascriptExecutor js;
        js = (JavascriptExecutor) DriverSingleton.getDriver();
        js.executeScript("window.scrollBy(" + atas + "," + bawah + ")");
        System.out.println("Scroll bar");
    }
}
