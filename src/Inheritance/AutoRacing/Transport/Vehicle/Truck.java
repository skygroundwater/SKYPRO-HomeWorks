package Inheritance.AutoRacing.Transport.Vehicle;
import Inheritance.AutoRacing.Driver.Driver;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Mechanic.Mechanic;
import Inheritance.AutoRacing.Sponsors.Sponsor;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
public class Truck extends Transport {
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
    static class DriverC extends Driver implements Moving{
        public DriverC(String name, double experience, String driverCard) {
            super(name, experience);
            this.setDriverCard(driverCard);
        }
        public String startDriving(){
            return getName() + " начал гонку";
        }
        public String stopDriving(){
            return getName() + " закончил гонку";
        }
        public String refill(){
            return getName() + " заправляется";
        }
        @Override
        public String toString() {
            return super.toString() + " имеет " + getDriverCard();
        }
        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }
        @Override
        public int hashCode() {
            return super.hashCode();
        }
    }
    private final DriverC driver;
    private final HashSet<Sponsor> sponsors;
    private final HashSet<Mechanic<? super Truck>> mechanics;
    public Truck(String brand, String model, double engineVolume, float capacity,  String driverName, double experienceDriver){
        super(brand, model, engineVolume);
        this.driver = new DriverC(driverName, experienceDriver, " права категории С ");
        setLoadCapacity(capacity);
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>();
    }
    private LoadCapacity loadCapacity;
    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(float loadCapacity) {
        if(loadCapacity<0) this.loadCapacity = LoadCapacity.N1;
        else if(loadCapacity <= LoadCapacity.N1.getMaxCapacity()) this.loadCapacity = LoadCapacity.N1;
        else if (loadCapacity >= LoadCapacity.N2.getMinCapacity() && loadCapacity <= LoadCapacity.N2.getMaxCapacity()) this.loadCapacity = LoadCapacity.N2;
        else if(loadCapacity >= LoadCapacity.N3.getMinCapacity()) this.loadCapacity = LoadCapacity.N3;
    }
    public void addSponsor(Sponsor sponsor, Double sum){
        Sponsor sponsor1 = new Sponsor(sponsor.getName(), sponsor.getType());
        try {
        sponsor1.letsSponsoring(sum);
        }catch (RuntimeException e){
            return;
        }
        sponsor.addVehicle(this);
        this.sponsors.add(sponsor1);
    }
    public void showAllSponsors(){
        for(Sponsor sponsor: sponsors){
            System.out.println(sponsor + " проспонсировал заезд данного " + getBrand() + " на " + sponsor.getSum() + " долларов");
        }
    }
    public void addMechanic(Mechanic<? super Truck> mechanic){
        Mechanic<Truck> mechanic1 = new Mechanic<>(mechanic.getFirstName(), mechanic.getLastName(), mechanic.getCompany());
        mechanics.add(mechanic1);
        mechanic.takeVehicle(this);
    }
    public void showAllMechanics(){
        for(Mechanic<? super Truck> mechanic: mechanics){
            System.out.println(mechanic);
        }
    }
    public HashSet<Mechanic<? super Truck>> getMechanics(){
        return mechanics;
    }
    public DriverC getDriver() {
        return driver;
    }
    public String participate() {
        return "Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях";
    }
    @Override
    public String printType() {
        if(loadCapacity != null) return loadCapacity.toString();
        else return "Данных по транспортному средству не достаточно";
    }
    @Override
    public String startTrip() {
        return "Грузовик " + super.startTrip() + " под управлением водителя " + driver.startDriving();
    }
    @Override
    public String stopTrip() {
        return "Грузовик " + super.stopTrip() + " под управлением водителя " + driver.stopDriving();
    }
    @Override
    public String pitStop() {
        return this + " остановился для замены шин. " + driver.refill();
    }
    @Override
    public String bestLapTime() {
        return this + " под управлением водителя " + driver.getName() + " показал лучшее время круга";
    }
    @Override
    public String maxSpeed() {
        return this + " под управлением водителя " + driver.getName() + " показал лучшую скорость";
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
}
