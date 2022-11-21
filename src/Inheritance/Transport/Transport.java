package Inheritance.Transport;

import java.util.Objects;

abstract public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;
    private static final String noInfo = "Информация не указана";

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed){
        if(brand == null || brand.isEmpty()) this.brand = noInfo; else this.brand = brand;
        if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
        this.year = Math.max(year, 1950);
        if(country == null || country.isEmpty()) this.country = noInfo; else this.country = country;
        if(color == null || color.isEmpty()) this.color = noInfo; else this.color = color;
        this.maxSpeed = Math.max(maxSpeed, 10.0);
    }
    public String getNoInfo(){
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

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()) this.color = noInfo; else this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 10.0);
    }
    protected abstract String refill();
    @Override
    public String toString(){
        return brand + " модель " + model + " год выпуска " + year + " Страна " + country + " цвет " + color + " скорость передвижения " + maxSpeed +" км/ч";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return year == transport.year && Double.compare(transport.maxSpeed, maxSpeed) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }
}
