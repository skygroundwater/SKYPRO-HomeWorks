package Inheritance.AutoRacing.Transport.Vehicle;
import Inheritance.AutoRacing.Driver.Driver;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Mechanic.Mechanic;
import Inheritance.AutoRacing.Sponsors.Sponsor;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Bus extends Transport {
    public enum SeatCapacity {
        SMALLEST(10), SMALL(11, 25), MIDDLE(40, 50), BIG(60, 80), BIGGEST(100, 120);
        private Integer minNumberOfSeats;
        private Integer maxNumberOfSeats;
        SeatCapacity(Integer minNumberOfSeats, Integer maxNumberOfSeats){
                if (minNumberOfSeats < maxNumberOfSeats) {
                    setMinNumberOfSeats(minNumberOfSeats);
                    setMaxNumberOfSeats(maxNumberOfSeats);
                }
        }
        SeatCapacity(Integer maxNumberOfSeats){
            setMaxNumberOfSeats(maxNumberOfSeats);
            setMinNumberOfSeats(0);
        }
        public Integer getMaxNumberOfSeats() {
            return maxNumberOfSeats;
        }
        public Integer getMinNumberOfSeats() {
            return minNumberOfSeats;
        }
        public void setMaxNumberOfSeats(Integer maxNumberOfSeats) {
            if(maxNumberOfSeats <10)this.maxNumberOfSeats = 10; else this.maxNumberOfSeats = maxNumberOfSeats;
        }
        public void setMinNumberOfSeats(Integer minNumberOfSeats){
            if(minNumberOfSeats <3) this.minNumberOfSeats = 3; else this.minNumberOfSeats = minNumberOfSeats;
        }
        @Override
        public String toString() {
            if(getMinNumberOfSeats() != null) return "Вместимость: от " + minNumberOfSeats + " до " + maxNumberOfSeats;
            else return "Вместимость до: " + maxNumberOfSeats;
        }
    }
    static class DriverD extends Driver implements Moving{
        public DriverD(String name, double experience, String driverCard) {
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
    private SeatCapacity seatCapacity;
    private final DriverD driver;
    private final HashSet<Sponsor> sponsors;
    private final HashSet<Mechanic<? super Bus>> mechanics;
    public Bus(String brand, String model, double engineVolume, int seatCapacity, String driverName, double experienceDriver) {
        super(brand, model, engineVolume);
        setSeatCapacity(seatCapacity);
        this.driver = new DriverD(driverName, experienceDriver, " права категории D ");
        this.sponsors = new HashSet<>();
        this.mechanics = new HashSet<>();
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
    public void addMechanic(Mechanic<? super Bus> mechanic){
        Mechanic<Bus> mechanic1 = new Mechanic<>(mechanic.getFirstName(), mechanic.getLastName(), mechanic.getCompany());
        mechanics.add(mechanic1);
        mechanic.takeVehicle(this);
    }
    public void showAllMechanics(){
        for(Mechanic<? super Bus> mechanic: mechanics){
            System.out.println(mechanic);
        }
    }
    public HashSet<Mechanic<? super Bus>> getMechanics(){
        return mechanics;
    }
    public DriverD getDriver() {
        return driver;
    }
    public SeatCapacity getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity (int seatCapacity){
        if (seatCapacity <= SeatCapacity.SMALLEST.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.SMALLEST;
        else if (seatCapacity <= SeatCapacity.SMALL.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.SMALL;
        else if (seatCapacity >= SeatCapacity.MIDDLE.getMinNumberOfSeats() && seatCapacity<=50) this.seatCapacity = SeatCapacity.MIDDLE;
        else if (seatCapacity >= SeatCapacity.BIG.getMinNumberOfSeats() && seatCapacity <= SeatCapacity.BIG.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.BIG;
        else if (seatCapacity >= SeatCapacity.BIGGEST.getMinNumberOfSeats() && seatCapacity <= SeatCapacity.BIGGEST.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.BIGGEST;
        else this.seatCapacity = null;
    }
    public String participate() {
        return "Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях";
    }
    @Override
    public String printType() {
        if(seatCapacity != null) return seatCapacity.toString();
        else return "Данных по транспортному средству не достаточно";
    }
    public String passTechnicalMaintenance(){
        return "Автобус " + getBrand() + " в диагностике не нуждается";
    }
    @Override
    public String startTrip() {
        return "Автобус " + super.startTrip() + " под управлением водителя " + driver.startDriving();
    }
    @Override
    public String stopTrip() {
        return "Автобус " + super.stopTrip() + " под управлением водителя " + driver.stopDriving();
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
        if(seatCapacity != null) return super.toString() + seatCapacity;
        else return super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return seatCapacity == bus.seatCapacity && Objects.equals(driver, bus.driver);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seatCapacity, driver);
    }
}
