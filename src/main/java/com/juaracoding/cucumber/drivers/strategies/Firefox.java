package com.juaracoding.cucumber.drivers.strategies;

import com.juaracoding.cucumber.utils.Regular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", Regular.FIREFOXDRIVER);
        driver = new FirefoxDriver();
        return driver;
    }
}
