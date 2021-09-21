package td1.refactoring.api.macdeau;

import td1.refactoring.api.burger.*;

public class MacDeauRestaurant implements BurgerRestaurant {

    private static MacDeauRestaurant instance = null;

    private MacDeauRestaurant() {
    }

    public static BurgerRestaurant queue() {
        if (instance == null) {
            instance = new MacDeauRestaurant();
        }
        return instance;
    }

    @Override
    public BurgerCook order_menu(MenuType menu) {
        BurgerCook burgerCook = null;
        switch (menu) {
            case MEAT_MENU:
                burgerCook = new McDeauCook("Beefy", MenuSize.MEDIUM, BurgerMeat.BEEF).with_sauce(BurgerSauce.BURGER).with_onions().with_cheese();
                break;
            case FISH_MENU:
                burgerCook = new McDeauCook("Fishy", MenuSize.SMALL, BurgerMeat.WHITEFISH).with_sauce(BurgerSauce.BEARNAISE);
                break;
            case CHEESE_MENU:
            default:
                burgerCook = new McDeauCook("Cheesy", MenuSize.SMALL, BurgerMeat.BEEF).with_cheese();
        }
        return burgerCook;
    }

    @Override
    public BurgerCook order_personal(MenuSize size, BurgerMeat type) {
        return new McDeauCook("Own style", size, type);
    }

}
