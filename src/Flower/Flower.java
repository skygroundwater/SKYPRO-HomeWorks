package Flower;
public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;
    public Flower(String flowerName,double cost, int lifeSpan){
        if(flowerName == null || flowerName.isEmpty()) this.flowerName = "Белый"; else this.flowerName = flowerName;
        this.country = "Россия";
        if(cost <= 0.0) this.cost = 1.0; else this.cost = cost;
        if (lifeSpan <= 0) this.lifeSpan = 3; else this.lifeSpan = lifeSpan;
    }
    public Flower(String flowerName, String country, double cost){
        if(flowerName == null || flowerName.isEmpty()) this.flowerName = "Белый"; else this.flowerName = flowerName;
        if(country == null || country.isEmpty()) this.country = "Россия"; else this.country = country;
        if(cost <= 0.0) this.cost = 1.0; else this.cost = cost;
        this.lifeSpan = 3;
    }
    public Flower(String flowerName, String country, double cost, int lifeSpan){
        if(flowerName == null || flowerName.isEmpty()) this.flowerName = "Белый"; else this.flowerName = flowerName;
        if(country == null || country.isEmpty()) this.country = "Россия"; else this.country = country;
        if(cost <= 0.0) this.cost = 1.0; else this.cost = cost;
        if (lifeSpan <= 0) this.lifeSpan = 3; else this.lifeSpan = lifeSpan;
    }
    public double getCost() {
        return cost;
    }
    public int getLifeSpan() {
        return lifeSpan;
    }
    public String getCountry() {
        return country;
    }
    public String getFlowerName() {
        return flowerName;
    }
    public void setCost(double cost) {
        if(cost <= 0.0) this.cost = 1.0; else this.cost = cost;
    }
    public void setFlowerColor(String flowerName) {
        if(flowerName == null || flowerName.isEmpty()) this.flowerName = "Белый"; else this.flowerName = flowerName;
    }
    public void setCountry(String country) {
        if(country == null || country.isEmpty()) this.country = "Россия"; else this.country = country;
    }
    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan < 0) this.lifeSpan = 3; else this.lifeSpan = lifeSpan;
    }
    @Override
    public String toString() {
        return flowerName + " из " + country + " стоимость штуки - " +cost + " рублей.";
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
