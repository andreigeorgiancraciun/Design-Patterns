package com.example.builder.cars;

import com.example.builder.components.Engine;
import com.example.builder.components.GPSNavigator;
import com.example.builder.components.Transmission;
import com.example.builder.components.TripComputer;
import lombok.Getter;

/**
 * Car is a product class.
 */
@Getter
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

}
