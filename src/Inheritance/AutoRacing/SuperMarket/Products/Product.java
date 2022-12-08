package Inheritance.AutoRacing.SuperMarket.Products;
import java.util.Objects;
public class Product {
    private String name;
    private Double weight;
    private Double cost;
    public Product(String name, Double weight, Double cost){
        try {
            setName(name);
            setCost(cost);
            setWeight(weight);
        }catch (RuntimeException e){
            System.out.println("Заполните карточку товара полностью");
        }
    }
    public void setName(String name) {
        if(name == null || name.isEmpty() || name.isBlank()) throw new RuntimeException(); else this.name = name;
    }
    public void setCost(Double cost) {
        if(cost == null) throw new RuntimeException(); else this.cost = cost;
    }
    public void setWeight(Double weight) {
        if(weight == null) throw new RuntimeException(); else this.weight = weight;
    }
    public Double getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public Double getWeight() {
        return weight;
    }
    @Override
    public String toString() {
        return name + " вес " +  weight + " цена " + cost + " рублей";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(weight, product.weight) && Objects.equals(cost, product.cost);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, weight, cost);
    }
}
