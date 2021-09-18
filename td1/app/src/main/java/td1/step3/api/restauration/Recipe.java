package td1.step3.api.restauration;

import java.util.List;

public class Recipe implements Food {

    private String name;
    private List<Ingredient> ingredients;

    public Recipe(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
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
        return ingredients.stream().map(Ingredient::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double calories() {
        return ingredients.stream().map(Ingredient::calories).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return ingredients.stream().map(Ingredient::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Ingredient ingredient : ingredients) {
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
