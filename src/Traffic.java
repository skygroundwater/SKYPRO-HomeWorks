import Inheritance.Transport.Transport;
import Inheritance.Vehicle.Bus;
import Inheritance.Vehicle.Train;

public class Traffic {
    public static void main(String[] args) {
        Transport train1 = new Train("Ласточка","В-901", 2011, "Россия", "", 301.0, 3500.0, "", "Белорусский вокзал", "Минск-Пассажирский", 11);
        Transport train2 = new Train("Ленинград", "D-125", 2019, "Россия", "", 270.0, 1700.0, "", "Ленинградский вокзал", "Ленинград - пассажирский", 8);

        Transport bus1 = new Bus("VolgaBus", "городской автобус", 2020, "Россия", "бело-зеленый", 100.0);
        Transport bus2 = new Bus("Зил", "666", 1930, "СССР", "красный", 40);
        Transport bus3 = new Bus("MAN", "man", 1980, "USA", "красно-белый", 60);
        System.out.println(bus1);
    }
}
