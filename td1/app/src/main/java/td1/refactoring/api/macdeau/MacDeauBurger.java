package td1.refactoring.api.macdeau;

import td1.refactoring.api.burger.Burger;
import td1.refactoring.api.burger.Food;

import java.util.List;

public class MacDeauBurger extends Burger {
    MacDeauBurger(String name, List<Food> items) {
        super(name, items);
    }
}
