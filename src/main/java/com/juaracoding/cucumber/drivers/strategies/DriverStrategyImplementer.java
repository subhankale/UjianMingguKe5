package com.juaracoding.cucumber.drivers.strategies;

import com.juaracoding.cucumber.utils.Regular;

public class DriverStrategyImplementer {

    public static DriverStrategy chooseStrategy(String strategy) {
        return switch (strategy) {
            case Regular.CHROME -> new Chrome();
            case Regular.FIREFOX -> new Firefox();
            default -> null;
        };
    }
}
