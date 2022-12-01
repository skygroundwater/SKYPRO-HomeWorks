package Inheritance.AutoRacing.Transport.Vehicle;
import Inheritance.AutoRacing.Driver.DriverB;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.Objects;
public class Car<B extends DriverB & Moving> extends Transport {

    public enum CarBody {
        HATCHBACK("Хетчбек"), SEDAN("Седан"), COUPE("Купе"),
        STATION_WAGON("Универсал"), SUV("Внедорожник"),
        CROSSOVER("Кроссовер"), PICKUP("Пикап"), VAN("Фургон"), MINIVAN("Минивэн"), ANY("неуказан тип кузова");
        private final String name;
        public String getName(){
            return name;
        }
        CarBody(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }
    private CarBody carBody;
    public Car(String brand, String model, double engineVolume, String carBody){
        super(brand, model, engineVolume);
        setCarBody(carBody);
    }
    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        if(carBody == null || carBody.isEmpty()) this.carBody = CarBody.ANY;
        for (int i = 0; i < CarBody.values().length; i++) {
            assert carBody != null;
            if(carBody.equals(CarBody.values()[i].getName())) this.carBody = CarBody.values()[i];
        }
    }

    public void participate(B driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях");
    }
    @Override
    public String printType() {
        if(carBody != null) return carBody.toString();
        else return "Данных по транспортному средству не достаточно";
    }
    @Override
    public boolean passTechnicalInspection(){
            if(getCarBody().equals(CarBody.ANY)){
                return false;
            } else {
                System.out.println("Автомобиль " + getBrand() + " прошел диагностику");
                return true;
            }
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
        if(carBody != null) return  super.toString() + carBody;
        else return super.toString();
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