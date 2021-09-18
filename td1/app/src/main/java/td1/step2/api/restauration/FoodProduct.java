package td1.step2.api.restauration;

import td1.step2.api.food.Food;
import td1.step2.api.money.Product;

public interface FoodProduct extends Food, Product {
    boolean hasUniquePrice();
}
