package td1.step3.client;

import java.util.Arrays;
import java.util.List;

import td1.step3.api.restauration.Food;
import td1.step3.api.restauration.Ingredient;
import td1.step3.api.burger.Burger;
import static td1.step3.api.burger.BurgerBase.*;

public class App {
    public static void main(String args[]) {
        Food alice_dinner = new Burger("Fishy",
                List.of(new Ingredient(WHITEFISH, 50), new Ingredient(BEARNAISE, 40)));
        Food bob_dinner = new Burger("Beefy",
                List.of(new Ingredient(BEEF, 100), new Ingredient(BURGER, 40),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15)));
        Food charles_dinner = new Burger("Own Style",
                List.of(new Ingredient(BEEF, 400), new Ingredient(DEEPFRIEDONIONS, 20),
                        new Ingredient(CHEDDAR, 30), new Ingredient(BARBECUE, 20),
                        new Ingredient(BEARNAISE, 20), new Ingredient(BURGER, 20),
                        new Ingredient(CHEDDAR, 30)));
        List<Food> dinners = Arrays.asList(alice_dinner, bob_dinner, charles_dinner);
        for (Food dinner : dinners) {
            System.out.println(dinner);
        }
    }
}