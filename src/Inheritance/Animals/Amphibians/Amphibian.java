package Inheritance.Animals.Amphibians;

import Inheritance.Animals.Animal;

import java.util.Objects;

public class Amphibian extends Animal {
    private String habitat;
    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        if(habitat == null || habitat.isEmpty())this.habitat = "неизвестная среда обитания"; else this.habitat = habitat;
    }
    public void hunt(){
        System.out.println("Земноводное животное охотится");
    }
    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat == null || habitat.isEmpty()) this.habitat = getHabitat(); else this.habitat = habitat;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void move() {
        System.out.println(getName() + " плавает");
    }

    @Override
    public String toString() {
        return super.toString() + habitat + " относится к классу " + getClass();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return Objects.equals(habitat, amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }
}
