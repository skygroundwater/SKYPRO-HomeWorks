package Inheritance.AutoRacing.Vehicle;
import Inheritance.AutoRacing.Driver.Driver;
import Inheritance.AutoRacing.Driver.DriverD;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;
public class Bus<D extends DriverD & Moving> extends Transport {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void participate(D driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях");
    }

    @Override
    public void startTrip() {
        System.out.println("Автобус");
        super.startTrip();
    }
    @Override
    public void stopTrip() {
        System.out.println("Автобус");
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
}
