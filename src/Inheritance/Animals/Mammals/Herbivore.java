package Inheritance.Animals.Mammals;
import java.util.Objects;
public class Herbivore extends Mammal{
    private String typeOfFood;
    public Herbivore(String name, int age, String habitat, double speedOfMoving) {
        super(name, age, habitat, speedOfMoving);
        this.typeOfFood = " много травы";
    }
    public void graze(){
        System.out.println(getName() + " пасётся");
    }
    public String getTypeOfFood() {
        return typeOfFood;
    }
    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood == null || typeOfFood.isEmpty()) this.typeOfFood = getTypeOfFood(); else this.typeOfFood = typeOfFood;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушает " + getTypeOfFood());
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void move() {
        System.out.println(getName() + " вольяжно перемещается");
    }
    @Override
    public String toString() {
    return super.toString() + typeOfFood + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return Objects.equals(typeOfFood, herbivore.typeOfFood);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
