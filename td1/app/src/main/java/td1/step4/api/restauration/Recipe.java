package td1.step4.api.restauration;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements ComposedFood {

    private String name;
    private List<Food> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public String name() {
        return name;
    }

    @Override
    public void add(Base base, double weight) {
        ingredients.add(new Ingredient(base, weight));
    }

    @Override
    public double calories_per_100g() {
        return calories() / weight() * 100;
    }

    @Override
    public double weight() {
        return ingredients.stream().map(Food::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return ingredients.stream().map(Food::calories).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return ingredients.stream().map(Food::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Food ingredient : ingredients) {
            buffer.append(String.format("- %s\n", ingredient));
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
