package Inheritance.AutoRacing.Vehicle;
import Inheritance.AutoRacing.Driver.DriverC;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.Objects;
public class Truck<C extends DriverC & Moving> extends Transport {
    public Truck(String brand, String model, double engineVolume){
        super(brand, model, engineVolume);
    }
    public void participate(C driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях");
    }
    @Override
    public void startTrip() {
        System.out.println("Грузовик");
        super.startTrip();
    }
    @Override
    public void stopTrip() {
        System.out.println("Грузовик");
        super.stopTrip();
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck train = (Truck) o;
        return super.equals(train);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
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
}
