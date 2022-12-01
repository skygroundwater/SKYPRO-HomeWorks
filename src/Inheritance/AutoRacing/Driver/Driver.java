package Inheritance.AutoRacing.Driver;
public abstract class Driver{
    private String name;
    private String driverCard;
    private double experience;
    public Driver(String name, double experience){
    if(name == null || name.isEmpty()) this.name = " Петрович"; else this.name = name;
    this.driverCard = "Тип прав не указан";
    this.experience = Math.max(experience,0.5);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        this.experience = experience;
    }

}
