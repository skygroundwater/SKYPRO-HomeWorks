package Inheritance.AutoRacing.Transport.Vehicle;
import Inheritance.AutoRacing.Driver.DriverC;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.Objects;
public class Truck<C extends DriverC & Moving> extends Transport {
    public enum LoadCapacity {
        N1(3.5f), N2(3.6f ,12.0f), N3(12.1f, null);
        private Float minCapacity;
        private Float maxCapacity;
        LoadCapacity(Float minCapacity, Float maxCapacity){
             setMaxCapacity(maxCapacity); setMinCapacity(minCapacity);
        }
        LoadCapacity(Float maxCapacity){
            setMinCapacity(null);
            setMaxCapacity(maxCapacity);
        }
        public Float getMaxCapacity() {
            return maxCapacity;
        }
        public Float getMinCapacity() {
            return minCapacity;
        }
        public void setMaxCapacity(Float maxCapacity) {
            this.maxCapacity = maxCapacity;
        }
        public void setMinCapacity(Float minCapacity) {
            this.minCapacity = minCapacity;
        }
        @Override
        public String toString(){
            if(maxCapacity == null) return "Грузоподъемность от: " + minCapacity + " тонн ";
            else if(minCapacity == null) return "Грудоподъемность до: " + maxCapacity + " тонн ";
            else return "Грузоподъемность: от "+ minCapacity +" тонн до " + maxCapacity + " тонн";
        }
    }
    public Truck(String brand, String model, double engineVolume, float capacity){
        super(brand, model, engineVolume);
        setLoadCapacity(capacity);
    }
    LoadCapacity loadCapacity;

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(float loadCapacity) {
        if(loadCapacity<0) this.loadCapacity = null;
        else if(loadCapacity <= LoadCapacity.N1.getMaxCapacity()) this.loadCapacity = LoadCapacity.N1;
        else if (loadCapacity >= LoadCapacity.N2.getMinCapacity() && loadCapacity <= LoadCapacity.N2.getMaxCapacity()) this.loadCapacity = LoadCapacity.N2;
        else if(loadCapacity >= LoadCapacity.N3.getMinCapacity()) this.loadCapacity = LoadCapacity.N3;
    }
    public void participate(C driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях");
    }
    @Override
    public boolean passTechnicalInspection(){
        if(getLoadCapacity()== null){
            return false;
        } else {
            System.out.println("Грузовик " + getBrand() + " прошёл диагностику");
            return true;
        }
    }
    @Override
    public String printType() {
        if(loadCapacity != null) return loadCapacity.toString();
        else return "Данных по транспортному средству не достаточно";
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
        return super.toString() + loadCapacity.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck train = (Truck) o;
        return super.equals(train) && train.loadCapacity.equals(loadCapacity);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
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
