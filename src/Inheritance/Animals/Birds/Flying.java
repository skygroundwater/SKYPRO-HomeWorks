package Inheritance.Animals.Birds;
import java.util.Objects;
public class Flying extends Bird{
    private String wayToMove;
    public Flying(String name, int age, String habitat) {
        super(name, age, habitat);
        wayToMove = " нормальная птичка нормально летает";
    }
    public void flight(){
        System.out.println("Птичка летает");
    }
    public String getWayToMove() {
        return wayToMove;
    }
    public void setWayToMove(String wayToMove) {
        if(wayToMove == null || wayToMove.isEmpty()) this.wayToMove = getWayToMove(); else this.wayToMove = wayToMove;
    }
    @Override
    public void hunt() {
        System.out.println(getName() + " охотится");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " клюёт всё подряд");
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }
    @Override
    public void move() {
        System.out.println(getName() + getWayToMove());
    }
    @Override
    public String toString() {
        return super.toString() + wayToMove + " относится к классу " + getClass();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(wayToMove, flying.wayToMove);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wayToMove);
    }
}
