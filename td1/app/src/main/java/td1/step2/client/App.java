package td1.step2.client;

import java.util.Arrays;
import java.util.List;

import td1.step2.api.burger.Burger;
import td1.step2.api.burger.Ingredient;
import static td1.step2.api.burger.FoodType.*;

public class App {
    public static void main(String args[]) {
        Burger alice_dinner = new Burger("Fishy",
                List.of(new Ingredient(WHITEFISH, 50), new Ingredient(BEARNAISE, 40)));
        Burger bob_dinner = new Burger("Beefy",
                List.of(new Ingredient(BEEF, 100), new Ingredient(BURGER, 40),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15),
                        new Ingredient(DEEPFRIEDONIONS, 10), new Ingredient(CHEDDAR, 15)));
        Burger charles_dinner = new Burger("Own Style",
                List.of(new Ingredient(BEEF, 400), new Ingredient(DEEPFRIEDONIONS, 20),
                        new Ingredient(CHEDDAR, 30), new Ingredient(BARBECUE, 20),
                        new Ingredient(BEARNAISE, 20), new Ingredient(BURGER, 20),
                        new Ingredient(CHEDDAR, 30)));
        List<Burger> dinners = Arrays.asList(alice_dinner, bob_dinner, charles_dinner);
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}