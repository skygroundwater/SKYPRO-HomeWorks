package Animal;

public class Veterinarian {
    private Animal animal;

    public Veterinarian() {
    }

    public static void threatAnimal(Animal animal) {
        System.out.println(animal);
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Eating a lot of meat ", "living at country house");
        Animal cat = new Cat("Eating a dry food ", "living at apartment");
        Animal horse = new Horse("Eating a greens ", "living at the farm");
        threatAnimal(horse);
        horse.eat();
        horse.makeNoise();
        horse.sleep();
        threatAnimal(cat);
        cat.eat();
        cat.makeNoise();
        cat.sleep();
        threatAnimal(dog);
        dog.eat();
        dog.makeNoise();
        dog.sleep();
    }
}
