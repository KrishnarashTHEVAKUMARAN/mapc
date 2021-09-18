package td1.step2.api.burger;

import java.util.List;

import td1.step2.api.restauration.WeightedFoodProduct;

public class Burger implements WeightedFoodProduct {

    private String name;
    private List<Ingredient> items;

    public Burger(String name, List<Ingredient> items) {
        this.name = name;
        this.items = items;
    }

    public String name() {
        return name;
    }

    @Override
    public double calories_per_100g() {
        return calories() / weight() * 100;
    }

    @Override
    public double weight() {
        return items.stream().map(Ingredient::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return items.stream().map(Ingredient::calories).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Ingredient::price).reduce(0.0, Double::sum);
    }

    @Override
    public boolean hasUniquePrice() {
        return true;
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Ingredient item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(String.format("calories:      %.0f\n", calories()));
        buffer.append(String.format("calories/100g: %.0f\n", calories_per_100g()));
        buffer.append(DELIM);
        return buffer.toString();
    }
}
