package Inheritance.AutoRacing.Transport.Vehicle;
import Inheritance.AutoRacing.Driver.DriverD;
import Inheritance.AutoRacing.Driver.Moving;
import Inheritance.AutoRacing.Transport.Transport;
public class Bus<D extends DriverD & Moving> extends Transport {
    public enum SeatCapacity {
        SMALLEST(10), SMALL(11, 25), MIDDLE(40, 50), BIG(60, 80), BIGGEST(100, 120);
        private Integer minNumberOfSeats;
        private Integer maxNumberOfSeats;
        SeatCapacity(Integer minNumberOfSeats, Integer maxNumberOfSeats){
                if (minNumberOfSeats < maxNumberOfSeats) {
                    setMinNumberOfSeats(minNumberOfSeats);
                    setMaxNumberOfSeats(maxNumberOfSeats);
                }
        }
        SeatCapacity(Integer maxNumberOfSeats){
            setMaxNumberOfSeats(maxNumberOfSeats);
            setMinNumberOfSeats(0);
        }
        public Integer getMaxNumberOfSeats() {
            return maxNumberOfSeats;
        }
        public Integer getMinNumberOfSeats() {
            return minNumberOfSeats;
        }
        public void setMaxNumberOfSeats(Integer maxNumberOfSeats) {
            if(maxNumberOfSeats <10)this.maxNumberOfSeats = 10; else this.maxNumberOfSeats = maxNumberOfSeats;
        }
        public void setMinNumberOfSeats(Integer minNumberOfSeats){
            if(minNumberOfSeats <3) this.minNumberOfSeats = 3; else this.minNumberOfSeats = minNumberOfSeats;
        }
        @Override
        public String toString() {
            if(getMinNumberOfSeats() != null) return "Вместимость: от " + minNumberOfSeats + " до " + maxNumberOfSeats;
            else return "Вместимость до: " + maxNumberOfSeats;
        }
    }
    private SeatCapacity seatCapacity;
    public Bus(String brand, String model, double engineVolume, int seatCapacity) {
        super(brand, model, engineVolume);
        setSeatCapacity(seatCapacity);
    }
    public SeatCapacity getSeatCapacity() {
        return seatCapacity;
    }
    public void setSeatCapacity (int seatCapacity){
        if (seatCapacity <= SeatCapacity.SMALLEST.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.SMALLEST;
        else if (seatCapacity <= SeatCapacity.SMALL.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.SMALL;
        else if (seatCapacity >= SeatCapacity.MIDDLE.getMinNumberOfSeats() && seatCapacity<=50) this.seatCapacity = SeatCapacity.MIDDLE;
        else if (seatCapacity >= SeatCapacity.BIG.getMinNumberOfSeats() && seatCapacity <= SeatCapacity.BIG.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.BIG;
        else if (seatCapacity >= SeatCapacity.BIGGEST.getMinNumberOfSeats() && seatCapacity <= SeatCapacity.BIGGEST.getMaxNumberOfSeats()) this.seatCapacity = SeatCapacity.BIGGEST;
        else this.seatCapacity = null;
    }
    @Override
    public String toString() {
        if(seatCapacity != null) return super.toString() + seatCapacity;
        else return super.toString();
    }
    public void participate(D driver) {
        System.out.println("Водитель " + driver.getName() + " управляет " + getBrand() + " и будет участвовать в соревнованиях");
    }
    @Override
    public String printType() {
        if(seatCapacity != null) return seatCapacity.toString();
        else return "Данных по транспортному средству не достаточно";
    }
    @Override
    public boolean passTechnicalInspection(){
        System.out.println("Автобус " + getBrand() + " в диагностике не нуждается");
        return false;
    }
    @Override
    public void startTrip() {
        System.out.println("Автобус");
        super.startTrip();
    }
    @Override
    public void stopTrip() {
        System.out.println("Автобус");
        super.stopTrip();
    }
    @Override
    public void pitStop() {
        System.out.println(this + " остановился для замены шин");
    }
    @Override
    public void bestLapTime() {
        System.out.println(this + " показал лучшее время круга");
    }

    @Override
    public void maxSpeed() {
        System.out.println(this + " показал лучшую скорость");
    }
}
