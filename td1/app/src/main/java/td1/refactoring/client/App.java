package td1.refactoring.client;

import td1.refactoring.api.burger.Burger;
import td1.refactoring.api.burger.BurgerFactory;
import td1.refactoring.api.bigburger.BigBurgerRestaurant;
import td1.refactoring.api.macdeau.MacDeauRestaurant;

import java.util.Arrays;
import java.util.List;

import static td1.refactoring.api.burger.BurgerMeat.*;
import static td1.refactoring.api.burger.BurgerSauce.*;
import static td1.refactoring.api.burger.MenuSize.*;
import static td1.refactoring.api.burger.MenuType.*;
import static td1.refactoring.api.burger.Price.*;

public class App {
    public static void main(String args[]) {
        BurgerFactory.register(CHEAP, MacDeauRestaurant.queue());
        BurgerFactory.register(EXPENSIVE, BigBurgerRestaurant.queue());
        BurgerFactory advisor = BurgerFactory.instance();

        Burger alice_dinner = advisor
                .select(CHEAP)
                .order_menu(FISH_MENU)
                .cook();

        Burger bob_dinner = advisor
                .select(CHEAP)
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();

        Burger charles_dinner = advisor
                .select(EXPENSIVE)
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}
