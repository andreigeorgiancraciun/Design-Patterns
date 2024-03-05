package com.example.builder.builders;

import com.example.builder.cars.CarType;
import com.example.builder.components.Engine;
import com.example.builder.components.GPSNavigator;
import com.example.builder.components.Transmission;
import com.example.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGpsNavigator(GPSNavigator gpsNavigator);
}
