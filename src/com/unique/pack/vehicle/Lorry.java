package com.unique.pack.vehicle;

import com.unique.pack.details.Engine;
import com.unique.pack.professions.Driver;

public class Lorry extends Car {
    protected int loadCapacity;

    public Lorry(String carBrand, String carClass, int weight, Driver driver, Engine engine, int loadCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carBrand='" + carBrand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
