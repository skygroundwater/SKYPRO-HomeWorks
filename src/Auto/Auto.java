package Auto;
public class Auto {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private static final String noInfo = "Информация не указана";
    public Auto(String brand, String model, double engineVolume, String color, int year, String country){
        if(brand==null || brand.isEmpty()) this.brand  = noInfo; else this.brand  = brand;
        if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
        if(engineVolume<=0) this.engineVolume = 1.5; else this.engineVolume = engineVolume;
        if(color == null || color.isEmpty()) this.color = "белый"; else this.color = color;
        if(year<=0) this.year = 2000; else this.year = year;
        if(country==null || country.isEmpty()) this.country = noInfo; else this.country  = country;
    }
    @Override
    public  String toString(){
        return brand +" " +model+", " +year+" года выпуска, сборка в "+country+", " +color+" цвет кузова, объём двигателя -" +engineVolume+" л.";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) return true;
            Auto auto = (Auto) obj;
            return brand.equals(((Auto) obj).brand) && engineVolume == ((Auto) obj).engineVolume && color.equals(((Auto) obj).color) && country.equals(((Auto) obj).country) && model.equals(((Auto) obj).model) && year == (((Auto) obj).year);
        }
        return true;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(brand, engineVolume, model, color, country, year);
    }
}
