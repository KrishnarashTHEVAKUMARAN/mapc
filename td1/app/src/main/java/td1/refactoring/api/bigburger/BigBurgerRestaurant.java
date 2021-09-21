package td1.refactoring.api.bigburger;

import td1.refactoring.api.burger.*;

public class BigBurgerRestaurant implements BurgerRestaurant {

    private static BigBurgerRestaurant instance = null;

    private BigBurgerRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new BigBurgerRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook burgerCook = null;
        switch (menu) {
            case MEAT_MENU:
                burgerCook = new BigBurgerCook("Beefy", MenuSize.MEDIUM, BurgerMeat.BEEF).with_sauce(BurgerSauce.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                burgerCook = new BigBurgerCook("Fishy", MenuSize.SMALL, BurgerMeat.WHITEFISH).with_sauce(BurgerSauce.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                burgerCook = new BigBurgerCook("Cheesy", MenuSize.SMALL, BurgerMeat.BEEF).with_cheese();
        }
        return burgerCook;
    }

    @Override
    public BurgerCook order_personal(MenuSize size, BurgerMeat type) {
        return new BigBurgerCook("Own style", size, type);
    }

}
