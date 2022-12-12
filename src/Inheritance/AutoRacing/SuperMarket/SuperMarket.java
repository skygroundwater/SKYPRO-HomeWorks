package Inheritance.AutoRacing.SuperMarket;
import Inheritance.AutoRacing.SuperMarket.Products.Product;
import java.util.*;
public class SuperMarket {
    public static class FoodBasket{
        private final HashSet<Product> products;
        protected FoodBasket(){
            this.products = new HashSet<>();
        }
        public void addNewProduct(String name, Double weight, Double cost, Integer count){
            Product product = new Product(name, weight, cost, count);
            try {
                if (products.contains(product)) throw new RuntimeException();
            }catch (RuntimeException e){
                System.out.println("Такой продукт уже имеется в корзине");
            }
            products.add(product);
        }
        public void removeFromBasket(String name){
            products.removeIf(product -> product.getName().equals(name));
        }
        @Override
        public String toString() {
            return products + "";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FoodBasket that = (FoodBasket) o;
            return Objects.equals(products, that.products);
        }
        @Override
        public int hashCode() {
            return Objects.hash(products);
        }
    }
    public static class Recipe{
        private Double sum;
        private String name;
        private final HashMap<Product, Integer> products;
        protected Recipe(String name, Double sum, Product... products){
            this.products = new HashMap<>();
            setSum(0.0);
            for (Product product : products) {
                setSum((getSum() + product.getCost()) * product.getCount());
                this.products.put(product, product.getCount());
            }
        }
        public String getName() {
            return name;
        }
        private void setName(String name) {
            if(name == null || name.isEmpty()) throw new RuntimeException(); else  this.name = name;
        }
        public Double getSum() {
            return sum;
        }
        private void setSum(Double sum) {
            this.sum = sum;
        }
        @Override
        public String toString() {
            return "Название " + name + " сумма покупки " + sum + " список продуктов" + products;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Recipe recipe = (Recipe) o;
            return Objects.equals(sum, recipe.sum) && Objects.equals(name, recipe.name) && Objects.equals(products, recipe.products);
        }
        @Override
        public int hashCode() {
            return Objects.hash(sum, name, products);
        }
    }
    public static class BookForRecipes{
        private final HashSet<Recipe> bookForRecipes;
        public BookForRecipes(){
            this.bookForRecipes = new HashSet<>();
        }
        public void addRecipe(Recipe recipe){
            for(Recipe recipe1: bookForRecipes){
                try {
                    if(recipe.getName().equals(recipe1.getName())) throw new RuntimeException();
                }catch (RuntimeException e){
                    System.out.println("Такой рецепт уже существует в книге");
                }
            }
            bookForRecipes.add(recipe);
        }
        @Override
        public String toString() {
            return bookForRecipes + "";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BookForRecipes that = (BookForRecipes) o;
            return Objects.equals(bookForRecipes, that.bookForRecipes);
        }
        @Override
        public int hashCode() {
            return Objects.hash(bookForRecipes);
        }
    }
    public static void main(String[] args) {

    }
}
