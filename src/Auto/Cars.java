package Auto;

public class Cars {
    public static void main(String[] args) {
        Auto lada = new Auto("Lada", "Granta", 1.7, "жёлтый", 2015, "России");
        Auto audi = new Auto("Audi", "A8 L TDI quatro", 3.0, "черный", 2020, "Германии");
        Auto bmv = new Auto("BMV", "Z8", 3.0, "черный", 2021, "Германии");
        Auto kia = new Auto("KIA", "Sportage", 2.4, "красный", 2018, "Южной Корее");
        Auto hyundai = new Auto("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южной Корее");
        Auto[] cars = {lada, audi, bmv, kia, hyundai};
        for (Auto car: cars){
            System.out.println(car);
        }
    }
}
