package Animal;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void makeNoise() {
        System.out.println("Dog is barking");
    }
}
