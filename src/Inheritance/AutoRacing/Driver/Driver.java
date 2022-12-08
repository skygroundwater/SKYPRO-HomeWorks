package Inheritance.AutoRacing.Driver;
import java.util.Objects;
public abstract class Driver{
    private String name;
    private String driverCard;
    private double experience;
    public Driver(String name, double experience){
    setName(name);
    setExperience(experience);
    this.driverCard = "Тип прав не указан";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()) this.name = " Петрович"; else this.name = name;
    }
    public String getDriverCard() {
        return driverCard;
    }
    public void setDriverCard(String driverCard) {
        if(driverCard.isEmpty()){
            throw new RuntimeException("Необходимо указать тип прав");
        } else {
            this.driverCard = driverCard;
        }
    }
    public double getExperience() {
        return experience;
    }
    public void setExperience(double experience) {
        this.experience = Math.max(experience,0.5);
    }
    @Override
    public String toString() {
        return "Водитель " + name + " с опытом вождения " + getExperience() + " лет";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Double.compare(driver.experience, experience) == 0 && Objects.equals(name, driver.name) && Objects.equals(driverCard, driver.driverCard);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, driverCard, experience);
    }
}
