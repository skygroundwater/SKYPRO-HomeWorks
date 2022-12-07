package Inheritance.AutoRacing.Sponsors;

import Inheritance.AutoRacing.Transport.Transport;

import java.util.ArrayList;
import java.util.Objects;

public class Sponsor {
    enum TypeOfSponsors{
        COMPANY("Компания"),
        INDIVIDUAL("Частный инвестор");
        private final String type;
        TypeOfSponsors(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
        @Override
        public String toString() {
            return type;
        }
    }
    private String name;
    private double sum;
    private TypeOfSponsors type;
    private final ArrayList<Transport> vehicles;
    public Sponsor(String name, String type) {
        setName(name);
        setType(type);
        this.vehicles = new ArrayList<>();
    }
    public void letsSponsoring(Double sum){
            setSum(sum);
    }
    public void addVehicle(Transport transport){
        vehicles.add(transport);
    }
    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()) this.name = "<спонсор решил остаться инкогнито>"; else this.name = name;
    }
    public void setSum(Double sum) {
        if(sum == null || sum < 10000.0 || name.isBlank()) throw new RuntimeException("Сумма при взносе должна быть не меньше 10000 долларов"); else this.sum = sum;
    }
    public String getName() {
        return name;
    }
    public double getSum() {
        return sum;
    }
    public void setType(String type) {
        if(type.equals(TypeOfSponsors.COMPANY.type)) this.type = TypeOfSponsors.COMPANY; else this.type = TypeOfSponsors.INDIVIDUAL;
    }
    public String getType() {
        return type.getType();
    }
    @Override
    public String toString() {
        return type.getType() + " " + getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.sum, sum) == 0 && Objects.equals(name, sponsor.name) && type == sponsor.type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, sum, type);
    }
}
