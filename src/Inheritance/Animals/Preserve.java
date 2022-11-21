package Inheritance.Animals;

import Inheritance.Animals.Amphibians.Amphibian;
import Inheritance.Animals.Birds.Bird;
import Inheritance.Animals.Birds.Flightless;
import Inheritance.Animals.Birds.Flying;
import Inheritance.Animals.Mammals.Herbivore;
import Inheritance.Animals.Mammals.Mammal;
import Inheritance.Animals.Mammals.Predator;

public class Preserve {
    public static void main(String[] args) {
        Animal gazelle = new Herbivore("Газель", 3, "засушливая Африка", 49.0);
        Mammal giraffe = new Herbivore("Жираф" , 2, "засушливая Африка", 39.0);
        Herbivore horse = new Herbivore("Лошадь", 6, "зелёные равнины", 59.0);

        Animal hyena = new Predator("Гиена", 3, "засушливая Африка", 30.0);
        Mammal tiger = new Predator("Тигр", 4, "засушливая Африка", 48.0);
        Predator bear = new Predator("Медведь", 5, "Тайга", 45.0);

        Animal frog = new Amphibian("Лягушка", 1, "водоёмы");
        Amphibian snake = new Amphibian("Уж пресноводный", 1, "водоёмы");

        Animal peacock = new Flightless("Павлин", 1, "на земле");
        Bird penguin = new Flightless("Пингвин", 1, "на севере");
        Flightless dodo = new Flightless("Птица Додо", 2, "где-то обитает");

        Animal gull = new Flying("Чайка", 2, "в морском небе");
        Bird albatross = new Flying("Альбатрос", 2, "в морском небе");
        Flying falcon = new Flying("Сокол", 3, "вездесущ");

    }
}
