package td1.step2.api.burger;

import td1.step2.api.restauration.WeightedFoodProduct;

public class Ingredient implements WeightedFoodProduct {
    private FoodType type;
    private double weight;

    public Ingredient(FoodType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double calories_per_100g() {
        return type.calories_per_100g();
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public double price() {
        return type.hasUniquePrice() ? type.price() : weight / 100 * type.price();
    }

    @Override
    public boolean hasUniquePrice() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", this.type, weight(), price());
    }

}
