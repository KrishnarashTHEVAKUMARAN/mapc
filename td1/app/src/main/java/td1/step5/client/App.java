package td1.step5.client;

import java.util.Arrays;
import java.util.List;

import td1.step5.api.restauration.Food;
import td1.step5.api.burger.BurgerBuilder;
import td1.step5.api.burger.BurgerMeat;
import td1.step5.api.burger.BurgerSauce;

import static td1.step5.api.burger.MenuSize.*;
import static td1.step5.api.burger.MenuType.*;

public class App {
    public static void main(String args[]) {
        Food alice_dinner = BurgerBuilder.order_menu("Fishy", FISH_MENU).cook();
        Food bob_dinner = BurgerBuilder.order_menu("Beefy", MEAT_MENU).with_onions().with_cheese().cook();
        Food charles_dinner = BurgerBuilder.order_personal("Own Style", BurgerMeat.BEEF, BIG).with_onions()
                .with_cheese().with_sauce(BurgerSauce.BARBECUE).with_sauce(BurgerSauce.BEARNAISE)
                .with_sauce(BurgerSauce.BURGER).with_cheese().cook();
        List<Food> dinners = Arrays.asList(alice_dinner, bob_dinner, charles_dinner);
        for (Food dinner : dinners) {
            System.out.println(dinner);
        }
    }
}