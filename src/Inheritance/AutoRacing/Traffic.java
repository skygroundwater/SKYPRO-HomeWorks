package Inheritance.AutoRacing;
import Inheritance.AutoRacing.Driver.*;
import Inheritance.AutoRacing.Transport.Vehicle.Bus;
import Inheritance.AutoRacing.Transport.Vehicle.Car;
import Inheritance.AutoRacing.Transport.Vehicle.Truck;

public class Traffic {
    public static void main(String[] args) {
        Car<DriverB> car1 = new Car<>("Лада", "Гранта", 1.4, "Седан");
        Car<DriverB> car2 = new Car<>("УАЗ", "Патриот", 1.6, "");
        Car<DriverB> car3 = new Car<>("КИА", "СИД", 1.6, "Хетчбек");
        Car<DriverB> car4 = new Car<>("Мерседес", "Бенц", 3.4, "Фургон");
        Bus<DriverD> bus1 = new Bus<>("ВолгаБус", "123", 3.0, 0);
        Bus<DriverD> bus2 = new Bus<>("ПАЗ", "3205", 2.0, 24);
        Bus<DriverD> bus3 = new Bus<>("НЕФАЗ", "5299", 2.4, 45);
        Bus<DriverD> bus4 = new Bus<>("ЛИАЗ", "4292", 2.8, 78);
        Truck<DriverC> truck1 = new Truck<>("Камаз", "65115", 5.0, 4.0f);
        Truck<DriverC> truck2 = new Truck<>("ГАЗ", "Валдай", 4.8, 2.5f);
        Truck<DriverC> truck3 = new Truck<>("Hyundai", "HD78", 4.6,6.9f);
        Truck<DriverC> truck4 = new Truck<>("КамАЗ", "6520", 5.0, 13.7f);


        DriverB driverB = new DriverB("Василий", 3.6);
        DriverC driverC = new DriverC("Олег", 7.3);
        DriverD driverD = new DriverD("Пётр", 10.4);




        System.out.println(car2.printType());
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(bus1);
        System.out.println(bus1.printType());
    }
}
