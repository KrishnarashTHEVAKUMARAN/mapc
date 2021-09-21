package td1.refactoring.api.macdeau;

import td1.refactoring.api.burger.*;

import java.util.ArrayList;
import java.util.List;

public class McDeauCook implements BurgerCook {

    String name;
    List<Food> products;

    McDeauCook(String name, MenuSize size, BurgerMeat type) {
        this.name = name;
        double weight_for_size;
        switch (size) {
            case SMALL:
                weight_for_size = 50;
                break;
            case MEDIUM:
                weight_for_size = 100;
                break;
            case BIG:
            default:
                weight_for_size = 200;
        }
        this.products = new ArrayList<>();
        this.products.add(new Meat(type, weight_for_size));
    }

    @Override
    public McDeauCook with_sauce(BurgerSauce sauce) {
        this.products.add(new Sauce(sauce, 40));
        return this;
    }

    @Override
    public McDeauCook with_onions() {
        this.products.add(new DeepFriedOnions(10));
        return this;
    }

    @Override
    public McDeauCook with_tomato() {
        this.products.add(new Tomato(10));
        return this;
    }

    @Override
    public McDeauCook with_cheese() {
        this.products.add(new Cheddar(15));
        return this;
    }

    @Override
    public Burger cook() {
        return new MacDeauBurger(name, products);
    }

}
