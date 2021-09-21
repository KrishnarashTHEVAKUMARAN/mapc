package td1.refactoring.api.burger;

public interface BurgerRestaurant {
    BurgerCook order_menu(MenuType menu);
    BurgerCook order_personal(MenuSize size, BurgerMeat type);
}
