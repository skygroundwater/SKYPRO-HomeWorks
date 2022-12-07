package Inheritance.AutoRacing;
import Inheritance.AutoRacing.Driver.*;
import Inheritance.AutoRacing.Mechanic.Mechanic;
import Inheritance.AutoRacing.Sponsors.Sponsor;
import Inheritance.AutoRacing.Transport.ServiceStation.ServiceStation;
import Inheritance.AutoRacing.Transport.Transport;
import Inheritance.AutoRacing.Transport.Vehicle.Bus;
import Inheritance.AutoRacing.Transport.Vehicle.Car;
import Inheritance.AutoRacing.Transport.Vehicle.Truck;

import java.util.ArrayList;
import java.util.List;

public class Traffic {
    public static void letsStart(ArrayList<Transport> transports){
        System.out.println("В гонке участвуют:");
        int count = 1;
        for(Transport transport: transports){
            System.out.println(count++ + " " + transport);
        }
    }
    public static ArrayList<Driver> getDrivers(ArrayList<Transport> transports){
        ArrayList<Driver> drivers = new ArrayList<>();
        for(Transport transport: transports){
            drivers.add(transport.getDriver());
        }
        return drivers;
    }
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car("Лада", "Гранта", 1.4, "Седан", "Василий", 3.6);
        Car car2 = new Car("УАЗ", "Патриот", 1.6, "", "Прапор", 15.3);
        Car car3 = new Car("КИА", "СИД", 1.6, "Хетчбек", "Нагорный", 7.9);
        Car car4 = new Car("Мерседес", "Бенц", 3.4, "Фургон", "Простак", 8.7);
        Bus bus1 = new Bus("ВолгаБус", "123", 3.0, 0,"Пётр", 10.4);
        Bus bus2 = new Bus("ПАЗ", "3205", 2.0, 24, "Вострило", 6.8);
        Bus bus3 = new Bus("НЕФАЗ", "5299", 2.4, 45, "Залужный", 8.9);
        Bus bus4 = new Bus("ЛИАЗ", "4292", 2.8, 78, "Зеленский", 9.5);
        Truck truck1 = new Truck("Камаз", "65115", 5.0, -4, "Олег", 7.3);
        Truck truck2 = new Truck("ГАЗ", "Валдай", 4.8, 2.5f, "Проборик", 10.5);
        Truck truck3 = new Truck("Hyundai", "HD78", 4.6,6.9f, "Щебекин", 8.6);
        Truck truck4 = new Truck("КамАЗ", "6520", 5.0, 13.7f, "Золотов", 13.4);

        Mechanic<Car> mechanic1 = new Mechanic<>("Федор", "Гуменюк", "БМБА");
        Mechanic<Bus> mechanic2 = new Mechanic<>("Сергей", "Каширский", "ООО <Грифон>");
        Mechanic<Truck> mechanic3 = new Mechanic<>("Микаэлла", "Метелева", "ООО <СибНефть>");
        Mechanic<Transport> mechanic4 = new Mechanic<>("Полутор", "Преображенский", "ООО <Грифон>");

        truck1.addMechanic(mechanic3);
        truck1.addMechanic(mechanic4);
        bus1.addMechanic(mechanic4);
        mechanic4.getVehicles();
        Sponsor sponsor1 = new Sponsor("Абрамович", "Частный инвестор"); //сначала спонсор заявляет о своем участии
        truck1.addSponsor(sponsor1, 9000.0); //потом предлагает владельцу авто свою сумму, и если авто она нравится, то оно принимает спонсора в свой список. сумма спонсорства не может быть ниже 10000 долларов, иначе выбрасывает исключение и инвестор с список не добавляется
        truck1.addSponsor(sponsor1, 14000.0);
        truck1.showAllSponsors();
        ArrayList<Transport> transports = new ArrayList<>(List.of(car1,car2,car3,car4,bus1,bus2,bus3,bus4,truck2,truck3,truck4,truck1));
        System.out.println(getDrivers(transports));


        ServiceStation serviceStation = new ServiceStation();
        serviceStation.add(car1);
        serviceStation.add(car2);
        serviceStation.add(truck1);
        serviceStation.add(truck2);
        serviceStation.maintenance();
    }
}
