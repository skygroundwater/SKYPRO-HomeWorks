package Inheritance.AutoRacing.Mechanic;
import Inheritance.AutoRacing.Transport.Transport;

import java.util.ArrayList;
import java.util.Objects;
public class Mechanic<T extends Transport> {
    private String firstName;
    private String lastName;
    private String company;
    private T vehicle;
    private final ArrayList<T> vehicles;
    public Mechanic(String firstName, String lastName, String company){
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        this.vehicles = new ArrayList<>();
    }
    public void takeVehicle(T vehicle){
        vehicles.add(vehicle);
    }
    public void repairVehicle(T vehicle){
        for(Transport transport: vehicles) {
            if (transport.equals(vehicle)) System.out.println(this + " чинит " + transport);
        }
    }
    public void carryOutMaintenance(Transport vehicle){
        for(Transport transport: vehicles){
            if(transport.equals(vehicle)) System.out.println(this + " производит техническое обслуживание " + transport);
        }
    }
    public void getVehicles() {
        System.out.println(this + " обслуживает:");
        for(T vehicle: vehicles){
            System.out.println(vehicle);
        }
    }
    public String getCompany() {
        return company;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setCompany(String company) {
        if(company==null || company.isEmpty() || company.isBlank()) this.company = "<компания, поддерживающая механика не указана>"; else this.company = company;
    }
    public void setLastName(String lastName) {
        if(lastName==null || lastName.isEmpty() || lastName.isBlank()) this.lastName = "<фамилия не указана>"; else this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        if(firstName==null || firstName.isEmpty() || firstName.isBlank()) this.firstName = "<имя не указано>"; else this.firstName = firstName;
    }
    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public String toString() {
        return "Механик " + firstName + " " + lastName + " из компании " + company;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && Objects.equals(vehicle, mechanic.vehicle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, vehicle);
    }
}
