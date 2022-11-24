package Inheritance.AutoRacing.Transport;
import Inheritance.AutoRacing.Competing;
import Inheritance.AutoRacing.Driver.Driver;
import Inheritance.AutoRacing.Driver.Moving;

import java.util.Objects;
abstract public class Transport implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private static final String noInfo = "Информация не указана";
    public Transport(String brand, String model, double engineVolume){
        if(brand == null || brand.isEmpty()) this.brand = noInfo; else this.brand = brand;
        if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
        this.engineVolume = Math.abs(engineVolume);
    }


    private String getNoInfo(){
        return noInfo;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
       if(brand == null || brand.isEmpty()) this.brand = noInfo; else this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.max(engineVolume, 10.0);
    }
    public void startTrip(){
        System.out.println(getBrand() + " " + getModel() + " начал движение");
    }
    public void stopTrip(){
        System.out.println(getBrand() + " " + getModel() + " закончил движение");
    }
    @Override
    public String toString(){
        return brand + " модель " + model + " объем двигателя " +engineVolume + " л.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return  Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model,engineVolume);
    }

}
