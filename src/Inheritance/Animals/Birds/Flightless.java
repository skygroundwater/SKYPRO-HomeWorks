package Inheritance.Animals.Birds;
import java.util.Objects;
public class Flightless extends Bird{
    private String wayToMove;
    public Flightless(String name, int age, String habitat) {
        super(name, age, habitat);
        this.wayToMove = " ходит пешочком, иногда впрепрыжку";
    }
    public void walk(){
        System.out.println("Птичка гуляет");
    }
    @Override
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
    public String getWayToMove() {
        return wayToMove;
    }
    public void setWayToMove(String wayToMove) {
        if(wayToMove == null || wayToMove.isEmpty()) this.wayToMove = getWayToMove(); else this.wayToMove = wayToMove;
    }
    @Override
    public void move() {
        System.out.println(getName() + getWayToMove());
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " клюёт зёрна");
    }
    @Override
    public String toString() {
        return super.toString() +" способ передвижения "+ wayToMove + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(wayToMove, that.wayToMove);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wayToMove);
    }
}
