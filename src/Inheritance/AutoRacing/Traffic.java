package Inheritance.AutoRacing;
import Inheritance.AutoRacing.Driver.*;
import Inheritance.AutoRacing.Vehicle.Bus;
import Inheritance.AutoRacing.Vehicle.Car;
import Inheritance.AutoRacing.Vehicle.Truck;

public class Traffic {
    public static void main(String[] args) {
        Car<DriverB> car1 = new Car<>("Лада", "Гранта", 1.4);
        Car<DriverB> car2 = new Car<>("УАЗ", "Патриот", 1.6);
        Car<DriverB> car3 = new Car<>("КИА", "СИД", 1.6);
        Car<DriverB> car4 = new Car<>("Мерседес", "Бенц", 3.4);
        Bus<DriverD> bus1 = new Bus<>("ВолгаБус", "123", 3.0);
        Bus<DriverD> bus2 = new Bus<>("ПАЗ", "3205", 2.0);
        Bus<DriverD> bus3 = new Bus<>("НЕФАЗ", "5299", 2.4);
        Bus<DriverD> bus4 = new Bus<>("ЛИАЗ", "4292", 2.8);
        Truck<DriverC> truck1 = new Truck<>("Камаз", "65115", 5.0);
        Truck<DriverC> truck2 = new Truck<>("ГАЗ", "Валдай", 4.8);
        Truck<DriverC> truck3 = new Truck<>("Hyundai", "HD78", 4.6);
        Truck<DriverC> truck4 = new Truck<>("КамАЗ", "6520", 5.0);


        DriverB driverB = new DriverB("Василий", 3.6);
        DriverC driverC = new DriverC("Олег", 7.3);
        DriverD driverD = new DriverD("Пётр", 10.4);


        car1.participate(driverB);
        bus1.participate(driverD);
        truck1.participate(driverC);
    }
}
