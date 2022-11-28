package Inheritance.AutoRacing.Driver;

public class DriverB extends Driver implements Moving{
    public DriverB(String name, double experience) {
        super(name, experience);
        this.setDriverCard(" права категории В ");
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
