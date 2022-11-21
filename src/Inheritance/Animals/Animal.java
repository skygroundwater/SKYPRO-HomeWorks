package Inheritance.Animals;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name, int age){
        if(name == null || name.isEmpty()) this.name = "неизвестное животное"; else this.name = name;
        this.age = Math.abs(age);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name){
        if(name == null || name.isEmpty()) this.name = getName(); else this.name = name;
    }
    public void setAge(int age){
        if(age<0) this.age = getAge(); else this.age = age;
    }
    public void eat(){
        System.out.println("Животное кушает");
    }
    public void sleep(){
        System.out.println("Животное спит");
    }
    public void move(){
        System.out.println("Животное двигается");
    }
    @Override
    public String toString() {
        return name + " возраст " + age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
