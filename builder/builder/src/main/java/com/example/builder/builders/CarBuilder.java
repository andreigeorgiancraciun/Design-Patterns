package com.example.builder.builders;

import com.example.builder.cars.Car;
import com.example.builder.cars.CarType;
import com.example.builder.components.Engine;
import com.example.builder.components.GPSNavigator;
import com.example.builder.components.Transmission;
import com.example.builder.components.TripComputer;
import lombok.Setter;

/**
 * Concrete builders implement steps defined in the common interface.
 */
@Setter
public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car getResult() {
        return new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}