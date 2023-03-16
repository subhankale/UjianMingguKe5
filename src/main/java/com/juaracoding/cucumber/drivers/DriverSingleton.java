package com.juaracoding.cucumber.drivers;

import com.juaracoding.cucumber.drivers.strategies.DriverStrategy;
import com.juaracoding.cucumber.drivers.strategies.DriverStrategyImplementer;
import com.juaracoding.cucumber.utils.Regular;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static DriverSingleton instance = null;
    private static WebDriver driver;

    private DriverSingleton(String driver) {
        instantiate(driver);
    }

    public void instantiate(String stategy) {
        DriverStrategy driverStrategy = DriverStrategyImplementer.chooseStrategy(stategy);
        driver = driverStrategy.setStrategy();
        driver.manage().timeouts().implicitlyWait(Regular.value, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void getInstance(String driver) {
        if (instance == null) {
            instance = new DriverSingleton(driver);
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void closeObjectInstance() {
        instance = null;
        driver.quit();
    }
}