package Inheritance.Vehicle;
import Inheritance.Transport.Transport;

import java.util.Objects;

public class Train extends Transport {
    private double costOfTrip;
    private String timeOfTrip;
    private String nameOfStartPoint;
    private String nameOfEndPoint;
    private int numberOfWagons;
    private static String trainFuel;

    public Train(String brand, String model, int year, String country, String color, double maxSpeed,
                 double costOfTrip, String timeOfTrip, String nameOfStartPoint, String nameOfEndPoint, int numberOfWagons){
        super(brand, model, year, country, color, maxSpeed);
        if(timeOfTrip == null || timeOfTrip.isEmpty()) this.timeOfTrip = getNoInfo(); else  this.timeOfTrip = timeOfTrip;
        if(nameOfStartPoint  == null || nameOfStartPoint.isEmpty()) this.nameOfStartPoint = getNoInfo(); else  this.nameOfStartPoint = nameOfStartPoint;
        if(nameOfEndPoint == null || nameOfEndPoint.isEmpty()) this.nameOfEndPoint = getNoInfo(); else this.nameOfEndPoint = nameOfEndPoint;
        this.numberOfWagons = Math.max(numberOfWagons, 1);
        this.costOfTrip = Math.max(costOfTrip, 2000.0);
        trainFuel = refill();
    }
    public double getCostOfTrip() {
        return costOfTrip;
    }
    public int getNumberOfWagons() {
        return numberOfWagons;
    }
    public String getNameOfStartPoint() {
        return nameOfStartPoint;
    }
    public String getNameOfEndPoint() {
        return nameOfEndPoint;
    }
    public void setCostOfTrip(double costOfTrip) {
        this.costOfTrip = costOfTrip;
    }
    public void setNameOfEndPoint(String nameOfEndPoint) {
        this.nameOfEndPoint = nameOfEndPoint;
    }
    public void setNameOfStartPoint(String nameOfStartPoint) {
        this.nameOfStartPoint = nameOfStartPoint;
    }
    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    public String getTimeOfTrip() {
        return timeOfTrip;
    }
    public void setTimeOfTrip(String timeOfTrip) {
        this.timeOfTrip = timeOfTrip;
    }

    @Override
    protected String refill() {
        return "Заправляемся дизелем";
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString()+ " отходит от " + nameOfStartPoint + " и следует до " + nameOfEndPoint + " цена поездки " + costOfTrip + " в поезде " + numberOfWagons+ " вагонов " + timeOfTrip + ". " +trainFuel;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Train train = (Train) o;
        return Double.compare(train.costOfTrip, costOfTrip) == 0 && numberOfWagons == train.numberOfWagons && Objects.equals(timeOfTrip, train.timeOfTrip) && Objects.equals(nameOfStartPoint, train.nameOfStartPoint) && Objects.equals(nameOfEndPoint, train.nameOfEndPoint);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), costOfTrip, timeOfTrip, nameOfStartPoint, nameOfEndPoint, numberOfWagons);
    }
}
