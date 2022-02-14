package com.unique.pack.vehicle;

import com.unique.pack.details.Engine;
import com.unique.pack.professions.Driver;

public class SportCar extends Car {
    protected double speedLimit;

    public SportCar(String carBrand, String carClass, int weight, Driver driver, Engine engine, double speedLimit) {
        super(carBrand, carClass, weight, driver, engine);
        this.speedLimit = speedLimit;
    }

    protected void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    protected double getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", speedLimit=" + speedLimit +
                '}';
    }
}
