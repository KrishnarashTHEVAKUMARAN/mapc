package td1.refactoring.api.bigburger;

import td1.refactoring.api.burger.Burger;
import td1.refactoring.api.burger.Food;

import java.util.List;

public class BigBurgerBurger extends Burger {
    BigBurgerBurger(String name, List<Food> items) {
        super(name, items);
    }
}
