package Inheritance.AutoRacing.Vehicle;
import Inheritance.AutoRacing.Driver.DriverB;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.Objects;
public class Car<B extends DriverB & Moving> extends Transport {
    public Car(String brand, String model, double engineVolume){
        super(brand, model, engineVolume);

    }

    public void participate(B driver) {
        System.out.println(driver.getName() + driver.getDriverCard() + " управляет " + this);
    }
    @Override
    public void startTrip() {
        super.startTrip();
    }
    @Override
    public void stopTrip() {
        System.out.println("Автомобиль");
        super.stopTrip();
    }
    @Override
    public void pitStop() {
        System.out.println(this + " остановился для замены шин");
    }
    @Override
    public void bestLapTime() {
        System.out.println(this + " показал лучшее время круга");
    }
    @Override
    public void maxSpeed() {
        System.out.println(this + " показал лучшую скорость");
    }
    @Override
    public String toString(){
        return  super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return super.equals(car);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }
}