package Transport;
import java.time.LocalDate;
import java.util.*;
public class Auto {
    public static class Key{
        private final String launch;
        private final String access;
        public Key(String launch, String access){
            if(launch == null || launch.isEmpty()) this.launch = "Запуск двигателя ключом."; else this.launch = launch;
            if(access == null || access.isEmpty()) this.access = "Доступ в машину с ключа."; else this.access = access;
        }
        public String getLaunch(){
            return launch;
        }
        public String getAccess(){
            return access;
        }
        @Override
        public String toString() {
            return launch + " " + access;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj.getClass().equals(this.getClass())) {
                if (obj == this) return true;
                Key key = (Key) obj;
                return launch.equals(((Key) obj).launch) && access.equals(((Key) obj).access);
            }
            return true;
        }
        @Override
        public int hashCode(){
            return java.util.Objects.hash(launch, access);
        }
    }
    public static class Insurance{
        private final LocalDate validity;
        private double cost;
        private final String number;
        public Insurance(int years){
            this.validity = LocalDate.now().plusYears(years);
            if(years == 1) cost = 7304.56; else if(years > 1) this.cost = (7304.56/1.1) * years;
            java.util.Random random = new java.util.Random();
            long numberOfInsurance = random.nextLong(899_999_999) + 100_000_000;
            if(String.valueOf(numberOfInsurance).length() != 9) this.number = "Некорректный номер страхового договора!"; else this.number =String.valueOf(numberOfInsurance);
        }
        public void setCost(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
        public LocalDate getValidity(){
            return validity;
        }
        public String getNumber(){
            return number;
        }
        @Override
        public String toString() {
            return "Номер страховки " + number + " цена " + cost + " рублей. Срок действия до: " + validity;
        }
        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (obj.getClass().equals(this.getClass())) {
                if (obj == this) return true;
                Insurance insurance = (Insurance) obj;
                return number.equals(((Insurance) obj).number) && cost == ((Insurance) obj).cost && validity.equals(((Insurance) obj).validity);
            }
            return true;
        }
        @Override
        public int hashCode(){
            return java.util.Objects.hash(number, validity, cost);
        }
    }
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private Transmission transmission;
    private CarBodies carBody;
    private final int seats;
    private Tires tire;
    private String carNumber;
    private final Key key;
    private Insurance insurance;
    private static final String noInfo = "Информация не указана";
    private Map<String, String> getRegionNumbers(){
        Map<String,String> regionNumbers = new HashMap<>();
        regionNumbers.put("01","Республика Адыгея");regionNumbers.put("101", "Республика Адыгея");regionNumbers.put("02", "Башкортостан");regionNumbers.put("102", "Башкортостан");regionNumbers.put("702", "Башкортостан");regionNumbers.put("03","Республика Бурятия");
        regionNumbers.put("04","Республика Алтай");regionNumbers.put("05", "Республика Дагестан");regionNumbers.put("06", "Республика Ингушетия");regionNumbers.put("07", "Кабардино-Балкарская Республика");regionNumbers.put("08", "Республика Калмыкия");
        regionNumbers.put("09", "Карачаево-Черкесская Республика");regionNumbers.put("10", "Республика Карелия");regionNumbers.put("11", "Республика Коми");regionNumbers.put("12", "Республика Марий Эл");regionNumbers.put( "13","Республика Мордовия");
        regionNumbers.put("14", "Республика Саха (Якутия)");regionNumbers.put("15", "Республика Северная Осетия — Алания");regionNumbers.put("16","Республика Татарстан (Татарстан)");regionNumbers.put("116","Республика Татарстан (Татарстан)");
        regionNumbers.put("716", "Республика Татарстан (Татарстан)");regionNumbers.put("17", " Республика Тыва");regionNumbers.put("18", "Удмуртская Республика");regionNumbers.put("19", "Республика Хакасия");regionNumbers.put("21","Чувашская Республика — Чувашия");
        regionNumbers.put("121", "Чувашская Республика — Чувашия");regionNumbers.put( "22", "Алтайский край");regionNumbers.put("23", "Краснодарский край");regionNumbers.put("93", "Краснодарский край");regionNumbers.put("123", "Краснодарский край");
        regionNumbers.put("24", "Красноярский край");regionNumbers.put("124", "Красноярский край");regionNumbers.put("25", "Приморский край");regionNumbers.put("125", "Приморский край");regionNumbers.put("26", "Ставропольский край");regionNumbers.put("126", "Ставропольский край");
        regionNumbers.put("27", "Хабаровский край");regionNumbers.put("28", "Амурская область");regionNumbers.put("29", "Архангельская область");regionNumbers.put("30", "Астраханская область");regionNumbers.put("31", "Белгородская область");regionNumbers.put("32", "Брянская область");
        regionNumbers.put("33", "Владимирская область");regionNumbers.put("34", "Волгоградская область");regionNumbers.put("134", "Волгоградская область");regionNumbers.put("35", "Вологодская область");regionNumbers.put("36", "Воронежская область");
        regionNumbers.put("136", "Воронежская область");regionNumbers.put("37", "Ивановская область");regionNumbers.put("38", "Иркутская область");regionNumbers.put("138", "Иркутская область");regionNumbers.put("39", "Калининградская область");regionNumbers.put("40", "Калужская область");
        regionNumbers.put("41", "Камчатский край");regionNumbers.put("42", "Кемеровская область");regionNumbers.put("142", "Кемеровская область");regionNumbers.put("43", "Кировская область");regionNumbers.put("44", "Костромская область");regionNumbers.put("45", "Курганская область");
        regionNumbers.put("46", "Курская область");regionNumbers.put("47", "Ленинградская область");regionNumbers.put("147", "Ленинградская область");regionNumbers.put("48", "Липецкая область");regionNumbers.put("49", "Магаданская область");regionNumbers.put("50","Московская область");
        regionNumbers.put("90","Московская область");regionNumbers.put("150", "Московская область");regionNumbers.put("190", "Московская область");regionNumbers.put("750", "Московская область");regionNumbers.put("790", "Московская область");regionNumbers.put("51", "Мурманская область");
        regionNumbers.put("52", "Нижегородская область");regionNumbers.put("152", "Нижегородская область");regionNumbers.put("53", "Новгородская область");regionNumbers.put("54", "Новосибирская область");regionNumbers.put("154", "Новосибирская область");regionNumbers.put("55", "Омская область");
        regionNumbers.put("56", "Оренбургская область");regionNumbers.put("156", "Оренбургская область");regionNumbers.put("57", "Орловская область");regionNumbers.put("58", "Пензенская область");regionNumbers.put("59", "Пермский край");regionNumbers.put("159", "Пермский край");
        regionNumbers.put("60", "Псковская область");regionNumbers.put("61", "Ростовская область");regionNumbers.put("161", "Ростовская область");regionNumbers.put("62", "Рязанская область");regionNumbers.put("63","Самарская область");regionNumbers.put("163", "Самарская область");
        regionNumbers.put("763", "Самарская область");regionNumbers.put("64","Саратовская область");regionNumbers.put("164", "Саратовская область");regionNumbers.put("65", "Сахалинская область");regionNumbers.put("66","Свердловская область");regionNumbers.put("96", "Свердловская область");
        regionNumbers.put("196", "Свердловская область");regionNumbers.put("67", "Смоленская область");regionNumbers.put("68", "Тамбовская область");regionNumbers.put("69", "Тверская область");regionNumbers.put("70", "Томская область");regionNumbers.put("71", "Тульская область");
        regionNumbers.put("72", "Тюменская область");regionNumbers.put("73","Ульяновская область");regionNumbers.put("173", "Ульяновская область");regionNumbers.put("82", "Ульяновская область");regionNumbers.put("74","Челябинская область");regionNumbers.put("174", "Челябинская область");
        regionNumbers.put("774", "Челябинская область");regionNumbers.put("75", "Забайкальский край");regionNumbers.put("76", "Ярославская область");regionNumbers.put("77", "г. Москва");regionNumbers.put("97", "г. Москва");regionNumbers.put("99","г. Москва");
        regionNumbers.put("177","г. Москва");regionNumbers.put("197","г. Москва");regionNumbers.put("199", "г. Москва");regionNumbers.put("777", "г. Москва");regionNumbers.put("797", "г. Москва");regionNumbers.put("799", "г. Москва");regionNumbers.put("78", "г. Санкт-Петербург");
        regionNumbers.put("98", "г. Санкт-Петербург");regionNumbers.put("178", "г. Санкт-Петербург");regionNumbers.put("198", "г. Санкт-Петербург");regionNumbers.put("79", "Еврейская автономная область");regionNumbers.put("82", "Республика Крым");regionNumbers.put("83", "Ненецкий автономный округ");
        regionNumbers.put("86", "Ханты-Мансийский автономный округ — Югра");regionNumbers.put("186", "Ханты-Мансийский автономный округ — Югра");regionNumbers.put("87", "Чукотский автономный округ");regionNumbers.put("89", "Ямало-Ненецкий автономный округ");
        regionNumbers.put("92", "г. Севастополь");regionNumbers.put("95", "Чеченская Республика");
        return regionNumbers;
    }
    public Auto(String brand, String model, double engineVolume,Key key,  String color, int year, String country, String transmission, String carBody, int seats, String tire){
        if(brand==null || brand.isEmpty()) this.brand  = noInfo; else this.brand  = brand;
        if(model == null || model.isEmpty()) this.model = noInfo; else this.model = model;
        if(engineVolume<=0) this.engineVolume = 1.5; else this.engineVolume = engineVolume;
        if(color == null || color.isEmpty()) this.color = "белый"; else this.color = color;
        if(year<=0) this.year = 2000; else this.year = year;
        if(country==null || country.isEmpty()) this.country = noInfo; else this.country  = country;

        if(transmission == null || transmission.isEmpty() || transmission.equals("автоматическая"))
            this.transmission = Transmission.AUTOMATIC;
        else if(transmission.equals("вариатор")) this.transmission = Transmission.VARIATE;
        else if(transmission.equals("роботизировання")) this.transmission = Transmission.ROBOT;
        else this.transmission = Transmission.MECHANIC;

        if(carBody == null|| carBody.isEmpty() || carBody.equals("грузовой")) this.carBody = CarBodies.CARGO;
        else if(carBody.equals("хэтчбек")) this.carBody = CarBodies.HATCHBACK;
        else if(carBody.equals("универсал")) this.carBody = CarBodies.STATIONWAGON;
        else this.carBody = CarBodies.SEDAN;
        if(seats <=0 || seats > 7) this.seats = 5; else this.seats = seats;
        if(tire.equals("летняя")) this.tire = Tires.SUMMER; else this.tire = Tires.WINTER;
        this.key = key;
        this.carNumber = "х000хх000";
        this.insurance = null;
    }
    public String getCountry() {
        return country;
    }
    public int getYear() {
        return year;
    }
    public String getModel() {
        return model;
    }
    public String getBrand() {
        return brand;
    }
    public CarBodies getCarBody() {
        return carBody;
    }
    public int getSeats() {
        return seats;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public Tires getTire() {
        return tire;
    }
    public Transmission getTransmission() {
        return transmission;
    }
    public void setCarBody(CarBodies carBody) {
        this.carBody = carBody;
    }
    public void setTire(){
     if(this.tire == Tires.SUMMER) this.tire = Tires.WINTER; else this.tire = Tires.SUMMER;
    }
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
    public void setCarNumber(String series, String regNumber, String regionCode) {
        StringBuilder carNumber = new StringBuilder();
        if((series).length() != 3) carNumber.append("000"); else carNumber.append(series);
        if(regNumber == null || regNumber.isEmpty()) {
            carNumber.insert(0, 'x');
            carNumber.insert(4, "xx");
        } else {
            carNumber.insert(0, regNumber.charAt(0));
            carNumber.insert(4, regNumber.substring(1, regNumber.length()));
        }
        if(getRegionNumbers().containsKey(regionCode)) carNumber.append(regionCode).append("  ").append(getRegionNumbers().get(regionCode)); else carNumber.append("000");
        this.carNumber = String.valueOf(carNumber);
    }
    public String getCarNumber(){
        return carNumber;
    }
    public void buyInsurance(int years){
        this.insurance = new Insurance(years);
    }
    public void setInsurance(Insurance insurance, double cost, String number){
        insurance.setCost(cost);
    }
    public Insurance infoAboutInsurance(){
        return insurance;
    }
    public String checkInsurance(){
        if(this.insurance.validity.isBefore(LocalDate.now())) return "Ваша страховка просрочена. Необходимо срочно её пролонгировать."; else return "Ваша страховка пока действует в рамках сроков договора.";
    }
    @Override
    public  String toString(){
        return brand +" " +model+", " +year+" года выпуска, сборка в "+country+", " +color+" цвет кузова, объём двигателя -" +engineVolume+" л." + key + " коробка передач " + transmission + " кузов " + carBody + " посадочных мест " + seats + " из салона с покрышками " + tire + " номер автомобиля " + carNumber ;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) return true;
            Auto auto = (Auto) obj;
            return brand.equals(((Auto) obj).brand) && engineVolume == ((Auto) obj).engineVolume && color.equals(((Auto) obj).color) && country.equals(((Auto) obj).country) && model.equals(((Auto) obj).model) && year == (((Auto) obj).year) && transmission.equals(((Auto) obj).transmission) && seats == (((Auto) obj).seats) && tire.equals(((Auto) obj).tire) && carNumber.equals((((Auto) obj).carNumber)) && carBody.equals(((Auto) obj).carBody);
        }
        return true;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(brand, engineVolume, model, color, country, year, transmission, seats, tire, carNumber, carBody);
    }
}
