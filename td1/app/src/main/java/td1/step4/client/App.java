package td1.step4.client;

import java.util.Arrays;
import java.util.List;

import td1.step4.api.restauration.Food;
import td1.step4.api.burger.BurgerBuilder;
import static td1.step4.api.burger.MenuSize.*;
import static td1.step4.api.burger.MenuType.*;

public class App {
    public static void main(String args[]) {
        Food alice_dinner = BurgerBuilder.order_menu("Fishy", FISH_MENU).cook();
        Food bob_dinner = BurgerBuilder.order_menu("Beefy", MEAT_MENU).with_onions().with_cheese().cook();
        Food charles_dinner = BurgerBuilder.order_beef("Own Style", BIG).with_onions().with_cheese()
                .with_barbecue_sauce().with_bearnaise_sauce().with_burger_sauce().with_cheese()
                .cook();
        List<Food> dinners = Arrays.asList(alice_dinner, bob_dinner, charles_dinner);
        for (Food dinner : dinners) {
            System.out.println(dinner);
        }
    }
}