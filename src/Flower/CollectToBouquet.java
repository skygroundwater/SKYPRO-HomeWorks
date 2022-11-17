package Flower;

import java.util.ArrayList;

public class CollectToBouquet {
    private final ArrayList<Flower> bouquet;
    private static final double floristAllowance = 1.1;
    public CollectToBouquet(){
        this.bouquet = new ArrayList<>();
    }
    public void collectBouquet(Flower anyFlower){
        bouquet.add(anyFlower);
    }
    public void removeFlowerFromBouquet(Flower anyFlower){
        if(!bouquet.contains(anyFlower)) System.out.println("Такого цветка пока нет в букете. Но вы можете его добавить"); else bouquet.remove(anyFlower);

    }
    public void getCostForBouquet(){
        if(bouquet.isEmpty()){ System.out.println("Вы ещё не собирали букет"); return;}
        double bouquetCost = 0.0;
        int bouquetLifeSpan = bouquet.get(0).getLifeSpan();
        for (Flower flower: bouquet) bouquetCost = bouquetCost + flower.getCost();
        for (Flower flower: bouquet) if(flower.getLifeSpan() < bouquetLifeSpan) bouquetLifeSpan = flower.getLifeSpan();
        System.out.println("Цена букета равна " + bouquetCost * floristAllowance +" рублей");
        System.out.println("Срок стояния букета " + bouquetLifeSpan +" дней");
    }
}
