package Inheritance.AutoRacing.Transport.ServiceStation;

import Inheritance.AutoRacing.Mechanic.Mechanic;
import Inheritance.AutoRacing.Transport.Transport;
import Inheritance.AutoRacing.Transport.Vehicle.Bus;
import Inheritance.AutoRacing.Transport.Vehicle.Car;
import Inheritance.AutoRacing.Transport.Vehicle.Truck;

import java.util.*;

public class ServiceStation {
    private final ArrayDeque<Transport> transports;
    public ServiceStation(){
        this.transports = new ArrayDeque<>();
    }
    public void add(Transport vehicle){
        if(!vehicle.getClass().equals(Bus.class)) transports.offer(vehicle);
        else throw new RuntimeException("Автобусы в обслуживании не нуждаются");
    }
    public void takeMaintenance(Transport transport){
        System.out.println("Производим техническое обслуживание " + transport.getBrand() + " " + transport.getModel());
    }
    public void maintenance() throws InterruptedException {
        for (Transport transport: transports){
            Thread.sleep(1500);
            takeMaintenance(transport);
        }
    }
    @Override
    public String toString() {
        return "" + transports;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceStation that = (ServiceStation) o;
        return Objects.equals(transports, that.transports);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transports);
    }
}
