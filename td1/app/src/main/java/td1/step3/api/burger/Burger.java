package td1.step3.api.burger;

import java.util.List;

import td1.step3.api.restauration.Ingredient;
import td1.step3.api.restauration.Recipe;

public class Burger extends Recipe {
    public Burger(String name, List<Ingredient> ingredients) {
        super(name, ingredients);
    }
}
