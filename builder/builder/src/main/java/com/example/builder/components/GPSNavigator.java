package com.example.builder.components;

import lombok.Getter;

/**
 * Just another feature of a car.
 */
@Getter
public class GPSNavigator {
    private final String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

}
