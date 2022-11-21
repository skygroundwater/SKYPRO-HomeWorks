package Inheritance.Vehicle;

import Inheritance.Transport.Transport;

import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private static String carFuel;
    public Car(String brand, String model, int year, String country, String color, double maxSpeed, double engineVolume){
        super(brand, model, year, color, country, maxSpeed);
        if(engineVolume<=0) this.engineVolume = 1.5; else this.engineVolume = engineVolume;
        carFuel = refill();
    }
    public Double getEngineVolume(){
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    protected String refill() {
        return "Запрявляемся бензином";
    }

    @Override
    public String toString(){
        return  super.toString() + "" + engineVolume + " л." + carFuel;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume);
    }
}
