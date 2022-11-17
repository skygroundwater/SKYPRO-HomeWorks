package Flower;
public class FlowerShop {
    public static void main(String[] args) {
        Flower roseFlower = new Flower("Роза обыкновенная", "Голландия", 35.59);
        Flower chrysanthemumFlower = new Flower("Хризантема", 15.0, 1);
        Flower peonyFlower = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophilaFlower = new Flower("Гипсофила", "Турция", 19.5, 10);
        CollectToBouquet bouquet = new CollectToBouquet();

        bouquet.collectBouquet(gypsophilaFlower);
        bouquet.collectBouquet(peonyFlower);
        bouquet.removeFlowerFromBouquet(gypsophilaFlower);
        bouquet.removeFlowerFromBouquet(gypsophilaFlower);
        bouquet.getCostForBouquet();
    }
}
