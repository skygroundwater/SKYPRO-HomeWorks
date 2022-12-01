package Inheritance.AutoRacing.Driver;

public class DriverC extends Driver implements Moving{
    public DriverC(String name, double experience, String driverCard) {
        super(name, experience);
        this.setDriverCard(driverCard);
    }
    public void startDriving(){
        System.out.println(getName() + " поехал");
    }
    public void stopDriving(){
        System.out.println(getName() + " остоновился");
    }
    public void refill(){
        System.out.println(getName() + " заправляется");
    }
}
